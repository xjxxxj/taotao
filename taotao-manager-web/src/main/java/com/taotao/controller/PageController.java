package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 显示页码
 * 
 * @Description 
 * @author 谢庆香
 * @date 2018年10月31日
 *
 */
@Controller
public class PageController {

	@RequestMapping("/")
	public String showIndex() {
		return "index" ;
	}
	@RequestMapping("/login")
	public String toLogin() {
		return "login" ;
	}
	
}
