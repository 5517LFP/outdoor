package com.my.outdoor.mapper;

import com.my.outdoor.pojo.Memactlist;
import com.my.outdoor.pojo.MemactlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemactlistMapper {
    int countByExample(MemactlistExample example);

    int deleteByExample(MemactlistExample example);

    int deleteByPrimaryKey(Integer maid);

    int insert(Memactlist record);

    int insertSelective(Memactlist record);

    List<Memactlist> selectByExample(MemactlistExample example);

    Memactlist selectByPrimaryKey(Integer maid);

    int updateByExampleSelective(@Param("record") Memactlist record, @Param("example") MemactlistExample example);

    int updateByExample(@Param("record") Memactlist record, @Param("example") MemactlistExample example);

    int updateByPrimaryKeySelective(Memactlist record);

    int updateByPrimaryKey(Memactlist record);
}