package com.wyf.serial.web;

import com.wyf.serial.po.SerialNumPo;
import com.wyf.serial.service.SerialNumberGenerateService;
import com.wyf.serial.util.Constant;
import com.wyf.serial.util.DateUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wangyafei
 * @creat 2018-11-30-17:14
 */
public class SerialNumWeb {
    /**
     * 生成器锁.
     */
    private final ReentrantLock lock = new ReentrantLock();

    private SerialNumberGenerateService serialNumberGenerateService;
    @RequestMapping(value = "/generateMattersCode/{documentType}", method = {RequestMethod.GET})
    public  String generateMattersCode(@PathVariable("documentType") String documentType) {
        String matterCode = null;
        // 获取当前时间,格式是yyyyMMdd
        String currentTime = DateUtils.format2Date(new Date());
        SerialNumPo serialNumPo = new SerialNumPo();
        serialNumPo.setModuleCode(Constant.ModuleCode.DISPATCH);
        serialNumPo.setDataWidth(5);
        //加锁
        lock.lock();
        try {
            // 获取流水号后六位
            String serialNum =serialNumberGenerateService.getSerialNum(serialNumPo);
//          String lastSixString = SeriaNumberUtil.getSerialNO();
            matterCode = new StringBuilder("1000").append(documentType).append(currentTime).append(serialNum).toString();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //释放锁
            lock.unlock();
        }

        return matterCode;
    }

}
