package com.my.outdoor.mapper;

import com.my.outdoor.pojo.Equip;
import com.my.outdoor.pojo.EquipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquipMapper {
    int countByExample(EquipExample example);

    int deleteByExample(EquipExample example);

    int insert(Equip record);

    int insertSelective(Equip record);

    List<Equip> selectByExample(EquipExample example);

    int updateByExampleSelective(@Param("record") Equip record, @Param("example") EquipExample example);

    int updateByExample(@Param("record") Equip record, @Param("example") EquipExample example);
}