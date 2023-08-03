package com.mars.app.service;

import com.mars.app.dto.ResultDTO;
import com.mars.app.dto.UserDTO;

public interface UserService {

    public ResultDTO findAll();
    public ResultDTO editById(UserDTO uDto);
    public ResultDTO delete(int no);
    public ResultDTO save(UserDTO uDto);

    
}
