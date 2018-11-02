package com.taotao.util;
/**
 * 字符串工具类，为操作字符串对象提供支持
 * 
 * @Description 
 * @author 谢庆香
 * @date 2018年10月31日
 *
 */
public class StringUtils {

	/**
	 * 判断对个字符串对象是否为空
	 * @Title：checkEmpty
	 * @Description:TODO
	 * @param 
	 * @return boolean
	 * @throws 
	 *
	 */
	public static boolean checkEmpty(String... strArgs) {
		if(strArgs == null || strArgs.length ==0) return false ;
		for(String str:strArgs) {
			if(str == null || str.equals("")) return false ;
		}
		return true ;
	}
	
}
