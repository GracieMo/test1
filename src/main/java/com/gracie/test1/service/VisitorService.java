package com.gracie.test1.service;


import com.gracie.test1.domain.Visitor;
import com.gracie.test1.domain.VisitorDTO;
import com.gracie.test1.mapper.DmMapper;
import com.gracie.test1.mapper.VisitorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VisitorService {
    @Autowired
    private VisitorMapper visitorMapper;

    @Autowired
    DmMapper dmmapper;

    public List<VisitorDTO> showAllVisitor(){
        return visitorMapper.selectAllVisitor().stream().map( visitor -> {
            VisitorDTO vsdto = new VisitorDTO(visitor);
            vsdto.setHealth(dmmapper.selectMc(1010,visitor.getHealth()));
            vsdto.setEdubackground(dmmapper.selectMc(1000,visitor.getEdubackground()));
            vsdto.setIncomelevel(dmmapper.selectMc(1015,visitor.getIncomelevel()));
            vsdto.setMarriage(dmmapper.selectMc(1005,visitor.getMarriage()));
            vsdto.setVssex(dmmapper.selectMc(1020,visitor.getVssex()));
            return vsdto;
        }).collect(Collectors.toList());
    }

//    public List<Visitor> showAllVisitor(){
//
//        return visitorMapper.selectAllVisitor();
//    }

    public int createVisitor(Visitor visitor){

       return visitorMapper.insertSelective(visitor);

    }
}
