package com.gracie.test1.controller;

import com.gracie.test1.domain.Visitor;
import com.gracie.test1.mapper.VisitorMapper;
import com.gracie.test1.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visitor")
public class VisitorController {
    @Autowired
    private VisitorService visitorservice;

    @GetMapping("/")
    public List<Visitor> showAllVisitor(){

        return visitorservice.showAllVisitor();

    }

    @PostMapping("/")
    public int createVisitor(@RequestBody Visitor visitor){
        return visitorservice.createVisitor(visitor);
    }
}
