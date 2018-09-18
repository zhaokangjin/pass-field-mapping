package com.platform.field.mapping.dao;

import com.platform.field.mapping.entity.FieldCommonts;
import com.platform.field.mapping.entity.FieldCommontsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FieldCommontsMapper {
    long countByExample(FieldCommontsExample example);

    int deleteByExample(FieldCommontsExample example);

    int deleteByPrimaryKey(String fieldId);

    int insert(FieldCommonts record);

    int insertSelective(FieldCommonts record);

    List<FieldCommonts> selectByExample(FieldCommontsExample example);

    FieldCommonts selectByPrimaryKey(String fieldId);

    int updateByExampleSelective(@Param("record") FieldCommonts record, @Param("example") FieldCommontsExample example);

    int updateByExample(@Param("record") FieldCommonts record, @Param("example") FieldCommontsExample example);

    int updateByPrimaryKeySelective(FieldCommonts record);

    int updateByPrimaryKey(FieldCommonts record);

    //请注意：该方法并没有做全表更新的危险性预防判断，实际使用中请加入判断规避全表更新！
    int batchUpdateByPrimaryKeySelective(@Param("list") List<FieldCommonts> list, @Param("example") FieldCommontsExample example);

    //请注意：此方法的List条件是String 类型，有可能有其他类型的，请自行扩展重载！
    List<FieldCommonts> selectFieldByList(@Param("fieldName") String fieldName, @Param("paramList") List<String> paramList);
}