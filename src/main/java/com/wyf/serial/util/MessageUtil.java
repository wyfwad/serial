package com.wyf.serial.util;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.wyf.serial.po.AjaxResult;

/**
 * 构造ajax返回信息.
 * 
 * @className MessageUtil
 * @author zl
 * @version V1.0 2018年9月5日 上午9:39:10
 */
public class MessageUtil {

    /**
     * 构造成功返回信息.
     * 
     * @param obj 返回对象
     * @return AjaxResult
     */
    public static AjaxResult getSuccessMessage(Object obj) {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setResultCode(Constant.AjaxStatus.SUCCESS);
        ajaxResult.setResultCodeDes("操作成功!");
        ajaxResult.setResultData(obj);
        return ajaxResult;
    }

    /**
     * 构造Ajax成功返回信息.
     * 
     * @param succMsg 返回描述
     * @return AjaxResult
     */
    public static AjaxResult getSuccessMessage(String succMsg) {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setResultCode(Constant.AjaxStatus.SUCCESS);
        ajaxResult.setResultCodeDes(succMsg);
        return ajaxResult;
    }

    /**
     * 构造Ajax成功返回信息.
     * 
     * @param succMsg 返回描述
     * @param obj 返回对象
     * @return AjaxResult
     */
    public static AjaxResult getSuccessMessage(String succMsg, Object obj) {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setResultCode(Constant.AjaxStatus.SUCCESS);
        if (StringUtils.isEmpty(succMsg)) {
            ajaxResult.setResultCodeDes("操作成功!");
        } else {
            ajaxResult.setResultCodeDes(succMsg);
        }
        ajaxResult.setResultData(obj);
        return ajaxResult;
    }

    /**
     * 构造Ajax成功返回信息.
     * 
     * @return AjaxResult
     */
    public static AjaxResult getSuccessMessage() {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setResultCode(Constant.AjaxStatus.SUCCESS);
        ajaxResult.setResultCodeDes("操作成功!");
        return ajaxResult;
    }

    /**
     * 构造Ajax失败返回信息.
     * 
     * @param errorMsg 错误描述
     * @return AjaxResult
     */
    public static AjaxResult getFailMessage(String errorMsg) {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setResultCode(Constant.AjaxStatus.FAIL);
        ajaxResult.setResultCodeDes(errorMsg);
        return ajaxResult;
    }

    /**
     * 构造Ajax失败返回信息.
     * 
     * @param errorMsg 错误描述.
     * @return String
     */
    public static String getFailJsonMessage(String errorMsg) {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setResultCode(Constant.AjaxStatus.FAIL);
        ajaxResult.setResultCodeDes(errorMsg);
        return JSON.toJSONString(ajaxResult);
    }

    /**
     * 构造Ajax失败返回信息.
     * 
     * @return String
     */
    public static String getSuccessJsonMessage() {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setResultCode(Constant.AjaxStatus.SUCCESS);
        ajaxResult.setResultCodeDes("操作成功!");
        return JSON.toJSONString(ajaxResult);
    }

}
