package com.platform.field.mapping.dao.master;

import com.platform.field.mapping.entity.FieldMapping;
import com.platform.field.mapping.entity.FieldMappingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FieldMappingMapper {
    long countByExample(FieldMappingExample example);

    int deleteByExample(FieldMappingExample example);

    int insert(FieldMapping record);

    int insertSelective(FieldMapping record);

    List<FieldMapping> selectByExample(FieldMappingExample example);
    List<FieldMapping> selectAllSort();

    int updateByExampleSelective(@Param("record") FieldMapping record, @Param("example") FieldMappingExample example);

    int updateByExample(@Param("record") FieldMapping record, @Param("example") FieldMappingExample example);

    //请注意：该方法并没有做全表更新的危险性预防判断，实际使用中请加入判断规避全表更新！
    int batchUpdateByPrimaryKeySelective(@Param("list") List<FieldMapping> list, @Param("example") FieldMappingExample example);

    //请注意：此方法的List条件是String 类型，有可能有其他类型的，请自行扩展重载！
    List<FieldMapping> selectFieldByList(@Param("fieldName") String fieldName, @Param("paramList") List<String> paramList, @Param("splitSize") int splitSize);
}