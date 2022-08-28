package com.example.learnandroid.recommend.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Recommend {

	@SerializedName("code")
	private int code;

	@SerializedName("data")
	private List<RecommendItem> data;

	@SerializedName("message")
	private String message;

	@SerializedName("ttl")
	private int ttl;

	public void setCode(int code){
		this.code = code;
	}

	public int getCode(){
		return code;
	}

	public void setData(List<RecommendItem> data){
		this.data = data;
	}

	public List<RecommendItem> getData(){
		return data;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setTtl(int ttl){
		this.ttl = ttl;
	}

	public int getTtl(){
		return ttl;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"code = '" + code + '\'' + 
			",data = '" + data + '\'' + 
			",message = '" + message + '\'' + 
			",ttl = '" + ttl + '\'' + 
			"}";
		}
}