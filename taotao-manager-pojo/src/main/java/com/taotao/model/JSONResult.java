package com.taotao.model;
/**
 * 供controller层给请求返回json数据
 * 
 * @Description 
 * @author 谢庆香
 * @date 2018年10月31日
 *
 */
public class JSONResult {

	// 响应业务状态
    private Integer status;//200:成功 其他失败
    // 响应消息
    private String msg;
    // 响应中的数据
    private Object data;
    
    public static JSONResult ok(Object data) {
        return new JSONResult(200,null,data);
    }
    public static JSONResult ok(Object data,String msg) {
        return new JSONResult(200,msg,data);
    }
    public static JSONResult ok(String msg) {
        return new JSONResult(200,msg,null);
    }
    public static JSONResult ok() {
        return new JSONResult(200,null,null);
    }
    
    public static JSONResult errorMsg(String msg) {
        return new JSONResult(500, msg, null);
    }
    
    public static JSONResult errorMap(Object data) {
        return new JSONResult(501, "error", data);
    }
    
    public static JSONResult errorTokenMsg(String msg) {
        return new JSONResult(502, msg, null);
    }
    
    public static JSONResult errorException(String msg) {
        return new JSONResult(555, msg, null);
    }
	public JSONResult(Integer status, String msg, Object data) {
		super();
		this.status = status;
		this.msg = msg;
		this.data = data;
	}
	public JSONResult() {
		super();
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
    
}
