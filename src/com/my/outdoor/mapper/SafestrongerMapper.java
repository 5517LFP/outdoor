package com.my.outdoor.mapper;

import com.my.outdoor.pojo.Safestronger;
import com.my.outdoor.pojo.SafestrongerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SafestrongerMapper {
    int countByExample(SafestrongerExample example);

    int deleteByExample(SafestrongerExample example);

    int deleteByPrimaryKey(Integer ssid);

    int insert(Safestronger record);

    int insertSelective(Safestronger record);

    List<Safestronger> selectByExample(SafestrongerExample example);

    Safestronger selectByPrimaryKey(Integer ssid);

    int updateByExampleSelective(@Param("record") Safestronger record, @Param("example") SafestrongerExample example);

    int updateByExample(@Param("record") Safestronger record, @Param("example") SafestrongerExample example);

    int updateByPrimaryKeySelective(Safestronger record);

    int updateByPrimaryKey(Safestronger record);
}