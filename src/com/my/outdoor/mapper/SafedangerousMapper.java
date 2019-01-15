package com.my.outdoor.mapper;

import com.my.outdoor.pojo.Safedangerous;
import com.my.outdoor.pojo.SafedangerousExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SafedangerousMapper {
    int countByExample(SafedangerousExample example);

    int deleteByExample(SafedangerousExample example);

    int insert(Safedangerous record);

    int insertSelective(Safedangerous record);

    List<Safedangerous> selectByExample(SafedangerousExample example);

    int updateByExampleSelective(@Param("record") Safedangerous record, @Param("example") SafedangerousExample example);

    int updateByExample(@Param("record") Safedangerous record, @Param("example") SafedangerousExample example);
}