package com.wyf.serial.service.imp;

import com.wyf.serial.dao.SerialNumDao;
import com.wyf.serial.po.SerialNumPo;
import com.wyf.serial.util.DateUtils;
import com.wyf.serial.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.DecimalFormat;
import java.util.Date;

/**
 * 提供获取流水号的服务.
 *
 * @author wangyafei
 * @creat 2018-11-29-15:40
 */
@RestController
public class SerialNumberGenerateServiceImp {

    @Autowired
    private SerialNumDao serialNumDao;

    /**
     * 获取流水号后几位
     *
     * @return
     */
    @RequestMapping(value = "/serialNum", method = {RequestMethod.POST})
    public String getSerialNum(@RequestBody SerialNumPo serialNumPo) {
        String serialNum = null;
        //获取DecimalFormat对象
        DecimalFormat decimalFormat = getDecimalFormat(serialNumPo.getDataWidth());
        // 获取当前时间,格式是yyyyMMdd
        String currentTime = DateUtils.format2Date(new Date());
        //判断是否是当月
        if (DateUtils.isThisMonth("yyyyMMdd", currentTime)) {
            //根据模块编码获取当前的流水号
            SerialNumPo serialNumPoCurrent = serialNumDao.getByModuleCode(serialNumPo.getModuleCode());
            if(serialNumPoCurrent == null){
                return MessageUtil.getFailJsonMessage("生产流水号失败！");
            }
            int currentSerialNum = serialNumPoCurrent.getCurrentSerial();
            int newSerialNumTemp = currentSerialNum + serialNumPoCurrent.getAutoIncrementNum();
            //生产新的流水号
             serialNum = decimalFormat.format(newSerialNumTemp);
            //更新流水号
            serialNumPoCurrent.setCurrentSerial(newSerialNumTemp);
            serialNumPoCurrent.setConfigTemplate(currentTime.substring(0,6));
            updateSerialNum(serialNumPoCurrent);
        }else{
            //不是当月
             serialNum = decimalFormat.format(1);
        }
        return serialNum;
    }

    /**
     * 获取DecimalFormat格式.
     *
     * @param width
     * @return
     */
    private DecimalFormat getDecimalFormat(int width) {
        char[] chs = new char[width];
        for (int i = 0; i < width; i++) {
            chs[i] = '0';
        }
        return new DecimalFormat(new String(chs));
    }

    private void updateSerialNum(SerialNumPo serialNumPo) {
        serialNumDao.update(serialNumPo);
    }
}
