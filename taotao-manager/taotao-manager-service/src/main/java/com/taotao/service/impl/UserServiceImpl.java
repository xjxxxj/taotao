package com.taotao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.mapper.UserMapper;
import com.taotao.model.User;
import com.taotao.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper ;
	
	@Override
	public User login(String username, String password) {
		return userMapper.selectByUsernameAndPassWord(username, password) ;
	}

	@Override
	public boolean checkUsername(String username) {
		List<User> selectByUsername = userMapper.selectByUsername(username) ;
		if(selectByUsername == null || selectByUsername.size() == 0) return false ;
		return true;
	}

	
	
}
