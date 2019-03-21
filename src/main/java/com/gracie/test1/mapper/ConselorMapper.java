package com.gracie.test1.mapper;

import com.gracie.test1.domain.Conselor;

public interface ConselorMapper {
    int deleteByPrimaryKey(Integer csid);

    int insert(Conselor record);

    int insertSelective(Conselor record);

    Conselor selectByPrimaryKey(Integer csid);

    int updateByPrimaryKeySelective(Conselor record);

    int updateByPrimaryKey(Conselor record);
}