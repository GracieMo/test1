package com.gracie.test1.mapper;

import com.gracie.test1.domain.Tab;

public interface TabMapper {
    int deleteByPrimaryKey(Integer tabid);

    int insert(Tab record);

    int insertSelective(Tab record);

    Tab selectByPrimaryKey(Integer tabid);

    int updateByPrimaryKeySelective(Tab record);

    int updateByPrimaryKey(Tab record);
}