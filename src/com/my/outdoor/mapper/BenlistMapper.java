package com.my.outdoor.mapper;

import com.my.outdoor.pojo.Benlist;
import com.my.outdoor.pojo.BenlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BenlistMapper {
    int countByExample(BenlistExample example);

    int deleteByExample(BenlistExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(Benlist record);

    int insertSelective(Benlist record);

    List<Benlist> selectByExample(BenlistExample example);

    Benlist selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") Benlist record, @Param("example") BenlistExample example);

    int updateByExample(@Param("record") Benlist record, @Param("example") BenlistExample example);

    int updateByPrimaryKeySelective(Benlist record);

    int updateByPrimaryKey(Benlist record);
}