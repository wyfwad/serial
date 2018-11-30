package com.wyf.serial.service;

import com.wyf.serial.po.SerialNumPo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public interface SerialNumberGenerateService {

    @RequestMapping(value = "/serialNum", method = {RequestMethod.POST})
    public String getSerialNum(@RequestBody SerialNumPo serialNumPo);
}
