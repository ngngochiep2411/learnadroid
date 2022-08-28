package com.example.learnandroid.recommend.model;

import com.google.gson.annotations.SerializedName;

public class Tag{

	@SerializedName("tag_name")
	private String tagName;

	@SerializedName("count")
	private Count count;

	@SerializedName("tag_id")
	private int tagId;

	public void setTagName(String tagName){
		this.tagName = tagName;
	}

	public String getTagName(){
		return tagName;
	}

	public void setCount(Count count){
		this.count = count;
	}

	public Count getCount(){
		return count;
	}

	public void setTagId(int tagId){
		this.tagId = tagId;
	}

	public int getTagId(){
		return tagId;
	}

	@Override
 	public String toString(){
		return 
			"Tag{" + 
			"tag_name = '" + tagName + '\'' + 
			",count = '" + count + '\'' + 
			",tag_id = '" + tagId + '\'' + 
			"}";
		}
}