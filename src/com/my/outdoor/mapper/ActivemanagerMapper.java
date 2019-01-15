package com.my.outdoor.mapper;

import com.my.outdoor.pojo.Activemanager;
import com.my.outdoor.pojo.ActivemanagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivemanagerMapper {
    int countByExample(ActivemanagerExample example);

    int deleteByExample(ActivemanagerExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(Activemanager record);

    int insertSelective(Activemanager record);

    List<Activemanager> selectByExample(ActivemanagerExample example);

    Activemanager selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") Activemanager record, @Param("example") ActivemanagerExample example);

    int updateByExample(@Param("record") Activemanager record, @Param("example") ActivemanagerExample example);

    int updateByPrimaryKeySelective(Activemanager record);

    int updateByPrimaryKey(Activemanager record);
}