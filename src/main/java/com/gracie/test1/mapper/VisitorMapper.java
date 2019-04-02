package com.gracie.test1.mapper;

import com.gracie.test1.domain.Visitor;

import java.util.List;

public interface VisitorMapper {
    int deleteByPrimaryKey(Integer vsid);

    int insert(Visitor record);

    int insertSelective(Visitor record);

    Visitor selectByPrimaryKey(Integer vsid);

    int updateByPrimaryKeySelective(Visitor record);

    int updateByPrimaryKey(Visitor record);

    List<Visitor> selectAllVisitor();
}