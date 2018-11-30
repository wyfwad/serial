package com.wyf.serial.po;

import com.sinosig.core.pojo.BaseEntity;

public class SerialNumPo extends BaseEntity {
    private String moduleName;

    private String moduleCode;

    private String configTemplate;

    private Integer currentSerial;

    private Integer preMaxNum;

    private Integer autoIncrementNum;

    private Integer dataWidth;


    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode == null ? null : moduleCode.trim();
    }

    public String getConfigTemplate() {
        return configTemplate;
    }

    public void setConfigTemplate(String configTemplate) {
        this.configTemplate = configTemplate == null ? null : configTemplate.trim();
    }

    public Integer getAutoIncrementNum() {
        return autoIncrementNum;
    }

    public void setAutoIncrementNum(Integer autoIncrementNum) {
        this.autoIncrementNum = autoIncrementNum;
    }

    public int getDataWidth() {
        return dataWidth;
    }

    public void setDataWidth(int dataWidth) {
        this.dataWidth = dataWidth;
    }

    public Integer getCurrentSerial() {
        return currentSerial;
    }

    public void setCurrentSerial(Integer currentSerial) {
        this.currentSerial = currentSerial;
    }

    public Integer getPreMaxNum() {
        return preMaxNum;
    }

    public void setPreMaxNum(Integer preMaxNum) {
        this.preMaxNum = preMaxNum;
    }

    public void setDataWidth(Integer dataWidth) {
        this.dataWidth = dataWidth;
    }
}