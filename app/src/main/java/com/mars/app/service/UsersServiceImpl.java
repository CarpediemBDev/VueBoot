package com.mars.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mars.app.dao.UserDao;
import com.mars.app.dto.ResultDTO;
import com.mars.app.dto.UserDTO;

@Service
public class UsersServiceImpl implements UserService {

    private ResultDTO rDto;

    @Autowired UserDao uDao;

    public ResultDTO findAll(){
        rDto = new ResultDTO();
        List<UserDTO> resultList = uDao.findAll();
        if(resultList != null){
            rDto.setState(true);
            rDto.setResult(resultList);
        }else{
            rDto.setState(false);
        }
        return rDto;
    }
    public ResultDTO editById(UserDTO uDto){
        return rDto;
    }
    public ResultDTO delete(int no){
        return rDto;
    }
    public ResultDTO save(UserDTO uDto){
        return rDto;
    }
}
