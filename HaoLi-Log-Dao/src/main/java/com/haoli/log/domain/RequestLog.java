package com.haoli.log.domain;

import java.util.Map;
import java.util.TreeMap;

public class RequestLog {

	Long id;
	
	String url; //请求接口路径
	
	String requestParams; //请求参数
	
	String requestTime; //请求时间
	
	String createTime; //插入数据库时间
	
	String serverIp; //服务器ip地址
	
	String clientIp; //客户ip地址
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getRequestParams() {
		return requestParams;
	}

	public void setRequestParams(String requestParams) {
		this.requestParams = requestParams;
	}

	public String getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getServerIp() {
		return serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public String getClientIp() {
		return clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}
	
	@Override
	public String toString() {
		Map<String, Object> params = new TreeMap<String, Object>();
		params.put("id", this.id);
		params.put("url", this.url);
		params.put("requestParams", this.requestParams);
		params.put("serverIp", this.serverIp);
		params.put("clientIp", this.clientIp);
		params.put("requestTime", this.requestTime);
		params.put("createTime", this.createTime);
		return params.toString();
	}


}
