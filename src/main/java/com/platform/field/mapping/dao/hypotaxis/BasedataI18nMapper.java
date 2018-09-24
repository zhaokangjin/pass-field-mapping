package com.platform.field.mapping.dao.hypotaxis;

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
    List<BasedataI18n> selectSepretor();

    int updateByExampleSelective(@Param("record") BasedataI18n record, @Param("example") BasedataI18nExample example);

    int updateByExample(@Param("record") BasedataI18n record, @Param("example") BasedataI18nExample example);

    //请注意：该方法并没有做全表更新的危险性预防判断，实际使用中请加入判断规避全表更新！
    int batchUpdateByPrimaryKeySelective(@Param("list") List<BasedataI18n> list, @Param("example") BasedataI18nExample example);

    //请注意：此方法的List条件是String 类型，有可能有其他类型的，请自行扩展重载！
    List<BasedataI18n> selectFieldByList(@Param("fieldName") String fieldName, @Param("paramList") List<String> paramList);
}