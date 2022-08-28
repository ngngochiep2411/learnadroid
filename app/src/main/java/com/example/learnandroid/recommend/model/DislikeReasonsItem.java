package com.example.learnandroid.recommend.model;

import com.google.gson.annotations.SerializedName;

public class DislikeReasonsItem{

	@SerializedName("reason_name")
	private String reasonName;

	@SerializedName("reason_id")
	private int reasonId;

	public void setReasonName(String reasonName){
		this.reasonName = reasonName;
	}

	public String getReasonName(){
		return reasonName;
	}

	public void setReasonId(int reasonId){
		this.reasonId = reasonId;
	}

	public int getReasonId(){
		return reasonId;
	}

	@Override
 	public String toString(){
		return 
			"DislikeReasonsItem{" + 
			"reason_name = '" + reasonName + '\'' + 
			",reason_id = '" + reasonId + '\'' + 
			"}";
		}
}