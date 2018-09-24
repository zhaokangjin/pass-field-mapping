package com.platform.field.mapping.dao.master;

import com.platform.field.mapping.entity.TableMapping;
import com.platform.field.mapping.entity.TableMappingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableMappingMapper {
    long countByExample(TableMappingExample example);

    int deleteByExample(TableMappingExample example);

    int insert(TableMapping record);

    int insertSelective(TableMapping record);

    List<TableMapping> selectByExample(TableMappingExample example);
    List<TableMapping> selectAllSort();

    int updateByExampleSelective(@Param("record") TableMapping record, @Param("example") TableMappingExample example);

    int updateByExample(@Param("record") TableMapping record, @Param("example") TableMappingExample example);

    //请注意：该方法并没有做全表更新的危险性预防判断，实际使用中请加入判断规避全表更新！
    int batchUpdateByPrimaryKeySelective(@Param("list") List<TableMapping> list, @Param("example") TableMappingExample example);

    //请注意：此方法的List条件是String 类型，有可能有其他类型的，请自行扩展重载！
    List<TableMapping> selectFieldByList(@Param("fieldName") String fieldName, @Param("paramList") List<String> paramList);
}