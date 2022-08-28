package com.example.learnandroid.recommend.model;

import com.google.gson.annotations.SerializedName;

public class Banner{

	@SerializedName("image")
	private String image;

	@SerializedName("cm_mark")
	private int cmMark;

	@SerializedName("resource_id")
	private int resourceId;

	@SerializedName("index")
	private int index;

	@SerializedName("id")
	private int id;

	@SerializedName("title")
	private String title;

	@SerializedName("uri")
	private String uri;

	@SerializedName("request_id")
	private String requestId;

	@SerializedName("hash")
	private String hash;

	@SerializedName("server_type")
	private int serverType;

	@SerializedName("src_id")
	private int srcId;

	@SerializedName("is_ad")
	private boolean isAd;

	@SerializedName("is_ad_loc")
	private boolean isAdLoc;

	@SerializedName("creative_id")
	private int creativeId;

	@SerializedName("client_ip")
	private String clientIp;

	@SerializedName("click_url")
	private String clickUrl;

	@SerializedName("ad_cb")
	private String adCb;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setCmMark(int cmMark){
		this.cmMark = cmMark;
	}

	public int getCmMark(){
		return cmMark;
	}

	public void setResourceId(int resourceId){
		this.resourceId = resourceId;
	}

	public int getResourceId(){
		return resourceId;
	}

	public void setIndex(int index){
		this.index = index;
	}

	public int getIndex(){
		return index;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setUri(String uri){
		this.uri = uri;
	}

	public String getUri(){
		return uri;
	}

	public void setRequestId(String requestId){
		this.requestId = requestId;
	}

	public String getRequestId(){
		return requestId;
	}

	public void setHash(String hash){
		this.hash = hash;
	}

	public String getHash(){
		return hash;
	}

	public void setServerType(int serverType){
		this.serverType = serverType;
	}

	public int getServerType(){
		return serverType;
	}

	public void setSrcId(int srcId){
		this.srcId = srcId;
	}

	public int getSrcId(){
		return srcId;
	}

	public void setIsAd(boolean isAd){
		this.isAd = isAd;
	}

	public boolean isIsAd(){
		return isAd;
	}

	public void setIsAdLoc(boolean isAdLoc){
		this.isAdLoc = isAdLoc;
	}

	public boolean isIsAdLoc(){
		return isAdLoc;
	}

	public void setCreativeId(int creativeId){
		this.creativeId = creativeId;
	}

	public int getCreativeId(){
		return creativeId;
	}

	public void setClientIp(String clientIp){
		this.clientIp = clientIp;
	}

	public String getClientIp(){
		return clientIp;
	}

	public void setClickUrl(String clickUrl){
		this.clickUrl = clickUrl;
	}

	public String getClickUrl(){
		return clickUrl;
	}

	public void setAdCb(String adCb){
		this.adCb = adCb;
	}

	public String getAdCb(){
		return adCb;
	}

	@Override
 	public String toString(){
		return 
			"BannerItemItem{" + 
			"image = '" + image + '\'' + 
			",cm_mark = '" + cmMark + '\'' + 
			",resource_id = '" + resourceId + '\'' + 
			",index = '" + index + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",uri = '" + uri + '\'' + 
			",request_id = '" + requestId + '\'' + 
			",hash = '" + hash + '\'' + 
			",server_type = '" + serverType + '\'' + 
			",src_id = '" + srcId + '\'' + 
			",is_ad = '" + isAd + '\'' + 
			",is_ad_loc = '" + isAdLoc + '\'' + 
			",creative_id = '" + creativeId + '\'' + 
			",client_ip = '" + clientIp + '\'' + 
			",click_url = '" + clickUrl + '\'' + 
			",ad_cb = '" + adCb + '\'' + 
			"}";
		}
}