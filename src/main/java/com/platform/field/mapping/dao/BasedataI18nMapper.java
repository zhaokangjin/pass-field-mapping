package com.platform.field.mapping.dao;

import com.platform.field.mapping.entity.BasedataI18n;
import com.platform.field.mapping.entity.BasedataI18nExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasedataI18nMapper {
    long countByExample(BasedataI18nExample example);

    int deleteByExample(BasedataI18nExample example);

    int insert(BasedataI18n record);

    int insertSelective(BasedataI18n record);

    List<BasedataI18n> selectByExample(BasedataI18nExample example);

    int updateByExampleSelective(@Param("record") BasedataI18n record, @Param("example") BasedataI18nExample example);

    int updateByExample(@Param("record") BasedataI18n record, @Param("example") BasedataI18nExample example);

    int batchUpdateByPrimaryKeySelective(@Param("list") List<BasedataI18n> list, @Param("example") BasedataI18nExample example);

    List<BasedataI18n> selectFieldByList(@Param("fieldName") String fieldName, @Param("list") List<String> paramList);
}