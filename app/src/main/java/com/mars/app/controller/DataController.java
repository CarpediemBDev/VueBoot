package com.mars.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mars.app.dto.ResultDTO;
import com.mars.app.service.UserService;

/**
 * DataController
 */
@RestController
public class DataController {
    @Autowired UserService uService;

    @GetMapping("/api")
    public String home(){
        return "Api Data 준비중 ....";
    }

    @PostMapping("/findAll")
    public ResultDTO findAll(){
        return uService.findAll();
    }

    @PostMapping("/editById")
    public void editById(){

    }
    @DeleteMapping("/delete")
    public void delete(){

    }
    @PutMapping("/save")
    public void save(){

    }
}