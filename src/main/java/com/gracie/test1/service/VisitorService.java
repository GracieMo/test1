package com.gracie.test1.service;


import com.gracie.test1.domain.Visitor;
import com.gracie.test1.mapper.VisitorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VisitorService {
    @Autowired
    private VisitorMapper visitorMapper;

    public List<Visitor> showAllVisitor(){

        return visitorMapper.selectAllVisitor();
    }

    public int createVisitor(Visitor visitor){

       return visitorMapper.insertSelective(visitor);

    }
}
