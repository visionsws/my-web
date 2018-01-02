package com.vicente.dao.autogen;

import com.vicente.entity.autogen.MaUserData;
import com.vicente.entity.autogen.MaUserDataExample;
import com.vicente.entity.autogen.MaUserDataWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaUserDataMapper {
    int countByExample(MaUserDataExample example);

    int deleteByExample(MaUserDataExample example);

    int deleteByPrimaryKey(Long userid);

    int insert(MaUserDataWithBLOBs record);

    int insertSelective(MaUserDataWithBLOBs record);

    List<MaUserDataWithBLOBs> selectByExampleWithBLOBs(MaUserDataExample example);

    List<MaUserData> selectByExample(MaUserDataExample example);

    MaUserDataWithBLOBs selectByPrimaryKey(Long userid);

    int updateByExampleSelective(@Param("record") MaUserDataWithBLOBs record, @Param("example") MaUserDataExample example);

    int updateByExampleWithBLOBs(@Param("record") MaUserDataWithBLOBs record, @Param("example") MaUserDataExample example);

    int updateByExample(@Param("record") MaUserData record, @Param("example") MaUserDataExample example);

    int updateByPrimaryKeySelective(MaUserDataWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MaUserDataWithBLOBs record);

    int updateByPrimaryKey(MaUserData record);
}