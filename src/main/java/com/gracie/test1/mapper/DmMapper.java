package com.gracie.test1.mapper;

import com.gracie.test1.domain.Dm;

public interface DmMapper {
    int deleteByPrimaryKey(Integer dmid);

    int insert(Dm record);

    int insertSelective(Dm record);

    Dm selectByPrimaryKey(Integer dmid);

    int updateByPrimaryKeySelective(Dm record);

    int updateByPrimaryKey(Dm record);
}