package com.my.outdoor.mapper;

import com.my.outdoor.pojo.Linemanage;
import com.my.outdoor.pojo.LinemanageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LinemanageMapper {
    int countByExample(LinemanageExample example);

    int deleteByExample(LinemanageExample example);

    int deleteByPrimaryKey(Integer lid);

    int insert(Linemanage record);

    int insertSelective(Linemanage record);

    List<Linemanage> selectByExample(LinemanageExample example);

    Linemanage selectByPrimaryKey(Integer lid);

    int updateByExampleSelective(@Param("record") Linemanage record, @Param("example") LinemanageExample example);

    int updateByExample(@Param("record") Linemanage record, @Param("example") LinemanageExample example);

    int updateByPrimaryKeySelective(Linemanage record);

    int updateByPrimaryKey(Linemanage record);
}