package com.taotao.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taotao.model.JSONResult;
import com.taotao.model.User;
import com.taotao.service.UserService;
import com.taotao.util.StringUtils ;
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService ;
	@RequestMapping("/dologin")
	public JSONResult doLogin(User user , HttpSession session) {
		//判空
		if(StringUtils.checkEmpty(user.getUsername() , user.getPassword())) {
			//调用登录方法
			User loginUser = userService.login(user.getUsername(), user.getPassword()) ;
			if(loginUser != null) {
				//将User放到session中
				session.setAttribute("loginUser", loginUser);
				return JSONResult.ok("登录成功") ;
			}else if(userService.checkUsername(user.getUsername())){//判断是否存在此账号
						return JSONResult.errorMsg("密码错误") ;
			}else {
				return JSONResult.errorMsg("账号不存在") ;
			}
		}else {
			return JSONResult.errorMsg("账号和密码不能为空") ;
		}
	}
	
}
