package com.mars.app.dao;

import java.util.List;

import com.mars.app.dto.UserDTO;

/**
 * UserDao
 */
public interface UserDao {

    public List<UserDTO> findAll();
    public int editById(UserDTO uDto);
    public int delete(int no);
    public  int save(UserDTO uDto);
    
}