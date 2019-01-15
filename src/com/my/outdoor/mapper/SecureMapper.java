package com.my.outdoor.mapper;

import com.my.outdoor.pojo.Secure;
import com.my.outdoor.pojo.SecureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecureMapper {
    int countByExample(SecureExample example);

    int deleteByExample(SecureExample example);

    int deleteByPrimaryKey(Integer seid);

    int insert(Secure record);

    int insertSelective(Secure record);

    List<Secure> selectByExample(SecureExample example);

    Secure selectByPrimaryKey(Integer seid);

    int updateByExampleSelective(@Param("record") Secure record, @Param("example") SecureExample example);

    int updateByExample(@Param("record") Secure record, @Param("example") SecureExample example);

    int updateByPrimaryKeySelective(Secure record);

    int updateByPrimaryKey(Secure record);
}