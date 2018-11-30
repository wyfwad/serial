package com.wyf.serial.po;

import org.springframework.stereotype.Component;

/**
 * ajax请求标准返回结果
 * 
 * @author zl
 *
 */
@Component
public class AjaxResult {
	/**
	 * 返回状态：FAIL/SUCCESS
	 */
	private String resultCode;
	/**
	 * 错误描述
	 */
	private String resultCodeDes;
	/**
	 * 返回对象
	 */
	private Object resultData;

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultCodeDes() {
		return resultCodeDes;
	}

	public void setResultCodeDes(String resultCodeDes) {
		this.resultCodeDes = resultCodeDes;
	}

	public Object getResultData() {
		return resultData;
	}

	public void setResultData(Object resultData) {
		this.resultData = resultData;
	}

}
