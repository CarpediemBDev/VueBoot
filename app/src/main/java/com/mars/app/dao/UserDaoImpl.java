package com.mars.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mars.app.dto.UserDTO;
import com.mars.app.mapper.UserMapper;

@Repository
public class UserDaoImpl implements UserDao {

    
    @Autowired UserMapper uMapper;

    public List<UserDTO> findAll(){
        return uMapper.findAll();
    }
    public int editById(UserDTO uDto){
        return 0;
    }
    public int delete(int no){
        return 0;
    }
    public  int save(UserDTO uDto){
        return 0;
    }
}
