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

    int batchUpdateByPrimaryKeySelective(@Param("list") List<FieldCommonts> list, @Param("example") FieldCommontsExample example);
}