package com.gracie.test1.mapper;

import com.gracie.test1.domain.ConselorTab;

public interface ConselorTabMapper {
    int deleteByPrimaryKey(Integer cstabid);

    int insert(ConselorTab record);

    int insertSelective(ConselorTab record);

    ConselorTab selectByPrimaryKey(Integer cstabid);

    int updateByPrimaryKeySelective(ConselorTab record);

    int updateByPrimaryKey(ConselorTab record);
}