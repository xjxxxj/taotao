package com.taotao.service;

import com.taotao.model.User;

public interface UserService {
	/**
	 * 登录
	 * @Title：login
	 * @Description:TODO
	 * @param 
	 * @return User
	 * @throws 
	 *
	 */
	User login(String username , String password) ;
	/**
	 * 检查用户名是否存在
	 * @Title：checkUsername
	 * @Description:TODO
	 * @param 
	 * @return boolean
	 * @throws 
	 *
	 */
	boolean checkUsername(String username) ;
}
