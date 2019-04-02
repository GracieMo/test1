package com.gracie.test1.mapper;

import com.gracie.test1.domain.VisitorDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.gracie.test1.mapper")
public class test1 {
    @Autowired
    VisitorMapper visitorMapper;

    @Autowired
    DmMapper dmmapper;
    @Test
    public void test(){
        visitorMapper.selectAllVisitor().stream().map( visitor -> {
            VisitorDTO vsdm = new VisitorDTO(visitor);
            vsdm.setHealth(dmmapper.selectMc(1010,visitor.getHealth()));
//            vsdm.setEdubackground(visitor.getEdubackground());
            return vsdm;
        }).forEach(vsdm -> {
            System.out.println(vsdm.getHealth());
        });
    }

}
