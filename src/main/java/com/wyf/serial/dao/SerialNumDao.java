package com.wyf.serial.dao;

import com.wyf.serial.po.SerialNumPo;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface SerialNumDao extends BaseDao<SerialNumPo> {
    SerialNumPo getByModuleCode(String moduleCode);
}