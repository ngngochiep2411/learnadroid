package com.example.learnandroid.recommend.model;

import com.google.gson.annotations.SerializedName;

public class Count{

	@SerializedName("atten")
	private int atten;

	public void setAtten(int atten){
		this.atten = atten;
	}

	public int getAtten(){
		return atten;
	}

	@Override
 	public String toString(){
		return 
			"Count{" + 
			"atten = '" + atten + '\'' + 
			"}";
		}
}