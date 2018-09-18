package com.platform.field.mapping.dao;

import com.platform.field.mapping.entity.PlatformFields;
import com.platform.field.mapping.entity.PlatformFieldsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlatformFieldsMapper {
    long countByExample(PlatformFieldsExample example);

    int deleteByExample(PlatformFieldsExample example);

    int insert(PlatformFields record);

    int insertSelective(PlatformFields record);

    List<PlatformFields> selectByExample(PlatformFieldsExample example);

    int updateByExampleSelective(@Param("record") PlatformFields record, @Param("example") PlatformFieldsExample example);

    int updateByExample(@Param("record") PlatformFields record, @Param("example") PlatformFieldsExample example);

    //请注意：该方法并没有做全表更新的危险性预防判断，实际使用中请加入判断规避全表更新！
    int batchUpdateByPrimaryKeySelective(@Param("list") List<PlatformFields> list, @Param("example") PlatformFieldsExample example);

    //请注意：此方法的List条件是String 类型，有可能有其他类型的，请自行扩展重载！
    List<PlatformFields> selectFieldByList(@Param("fieldName") String fieldName, @Param("paramList") List<String> paramList);
}