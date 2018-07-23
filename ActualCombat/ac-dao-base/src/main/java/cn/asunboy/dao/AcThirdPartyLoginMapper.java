package cn.asunboy.dao;

import cn.asunboy.entity.AcThirdPartyLoginExample;
import cn.asunboy.entity.AcThirdPartyLoginKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcThirdPartyLoginMapper {
    int countByExample(AcThirdPartyLoginExample example);

    int deleteByExample(AcThirdPartyLoginExample example);

    int deleteByPrimaryKey(AcThirdPartyLoginKey key);

    int insert(AcThirdPartyLoginKey record);

    int insertSelective(AcThirdPartyLoginKey record);

    List<AcThirdPartyLoginKey> selectByExample(AcThirdPartyLoginExample example);

    int updateByExampleSelective(@Param("record") AcThirdPartyLoginKey record, @Param("example") AcThirdPartyLoginExample example);

    int updateByExample(@Param("record") AcThirdPartyLoginKey record, @Param("example") AcThirdPartyLoginExample example);
}