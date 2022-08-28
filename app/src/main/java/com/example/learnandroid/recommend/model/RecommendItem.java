package com.example.learnandroid.recommend.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class RecommendItem {

	@SerializedName("play")
	private int play;

	@SerializedName("dislike_reasons")
	private List<DislikeReasonsItem> dislikeReasons;

	@SerializedName("tname")
	private String tname;

	@SerializedName("mid")
	private int mid;

	@SerializedName("title")
	private String title;

	@SerializedName("uri")
	private String uri;

	@SerializedName("tid")
	private int tid;

	@SerializedName("cover")
	private String cover;

	@SerializedName("duration")
	private int duration;

	@SerializedName("face")
	private String face;

	@SerializedName("goto")
	private String jsonMemberGoto;

	@SerializedName("param")
	private String param;

	@SerializedName("name")
	private String name;

	@SerializedName("danmaku")
	private int danmaku;

	@SerializedName("ctime")
	private int ctime;

	@SerializedName("share")
	private int share;

	@SerializedName("tag")
	private Tag tag;

	@SerializedName("reply")
	private int reply;

	@SerializedName("idx")
	private int idx;

	@SerializedName("favorite")
	private int favorite;

	@SerializedName("desc")
	private String desc;

	@SerializedName("coin")
	private int coin;

	@SerializedName("area")
	private String area;

	@SerializedName("area_id")
	private int areaId;

	@SerializedName("online")
	private int online;

	@SerializedName("open")
	private int open;

	@SerializedName("banner_item")
	private List<Banner> bannerItem;

	public void setPlay(int play){
		this.play = play;
	}

	public int getPlay(){
		return play;
	}

	public void setDislikeReasons(List<DislikeReasonsItem> dislikeReasons){
		this.dislikeReasons = dislikeReasons;
	}

	public List<DislikeReasonsItem> getDislikeReasons(){
		return dislikeReasons;
	}

	public void setTname(String tname){
		this.tname = tname;
	}

	public String getTname(){
		return tname;
	}

	public void setMid(int mid){
		this.mid = mid;
	}

	public int getMid(){
		return mid;
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

	public void setTid(int tid){
		this.tid = tid;
	}

	public int getTid(){
		return tid;
	}

	public void setCover(String cover){
		this.cover = cover;
	}

	public String getCover(){
		return cover;
	}

	public void setDuration(int duration){
		this.duration = duration;
	}

	public int getDuration(){
		return duration;
	}

	public void setFace(String face){
		this.face = face;
	}

	public String getFace(){
		return face;
	}

	public void setJsonMemberGoto(String jsonMemberGoto){
		this.jsonMemberGoto = jsonMemberGoto;
	}

	public String getJsonMemberGoto(){
		return jsonMemberGoto;
	}

	public void setParam(String param){
		this.param = param;
	}

	public String getParam(){
		return param;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setDanmaku(int danmaku){
		this.danmaku = danmaku;
	}

	public int getDanmaku(){
		return danmaku;
	}

	public void setCtime(int ctime){
		this.ctime = ctime;
	}

	public int getCtime(){
		return ctime;
	}

	public void setShare(int share){
		this.share = share;
	}

	public int getShare(){
		return share;
	}

	public void setTag(Tag tag){
		this.tag = tag;
	}

	public Tag getTag(){
		return tag;
	}

	public void setReply(int reply){
		this.reply = reply;
	}

	public int getReply(){
		return reply;
	}

	public void setIdx(int idx){
		this.idx = idx;
	}

	public int getIdx(){
		return idx;
	}

	public void setFavorite(int favorite){
		this.favorite = favorite;
	}

	public int getFavorite(){
		return favorite;
	}

	public void setDesc(String desc){
		this.desc = desc;
	}

	public String getDesc(){
		return desc;
	}

	public void setCoin(int coin){
		this.coin = coin;
	}

	public int getCoin(){
		return coin;
	}

	public void setArea(String area){
		this.area = area;
	}

	public String getArea(){
		return area;
	}

	public void setAreaId(int areaId){
		this.areaId = areaId;
	}

	public int getAreaId(){
		return areaId;
	}

	public void setOnline(int online){
		this.online = online;
	}

	public int getOnline(){
		return online;
	}

	public void setOpen(int open){
		this.open = open;
	}

	public int getOpen(){
		return open;
	}

	public void setBannerItem(List<Banner> bannerItem){
		this.bannerItem = bannerItem;
	}

	public List<Banner> getBannerItem(){
		return bannerItem;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"play = '" + play + '\'' + 
			",dislike_reasons = '" + dislikeReasons + '\'' + 
			",tname = '" + tname + '\'' + 
			",mid = '" + mid + '\'' + 
			",title = '" + title + '\'' + 
			",uri = '" + uri + '\'' + 
			",tid = '" + tid + '\'' + 
			",cover = '" + cover + '\'' + 
			",duration = '" + duration + '\'' + 
			",face = '" + face + '\'' + 
			",goto = '" + jsonMemberGoto + '\'' + 
			",param = '" + param + '\'' + 
			",name = '" + name + '\'' + 
			",danmaku = '" + danmaku + '\'' + 
			",ctime = '" + ctime + '\'' + 
			",share = '" + share + '\'' + 
			",tag = '" + tag + '\'' + 
			",reply = '" + reply + '\'' + 
			",idx = '" + idx + '\'' + 
			",favorite = '" + favorite + '\'' + 
			",desc = '" + desc + '\'' + 
			",coin = '" + coin + '\'' + 
			",area = '" + area + '\'' + 
			",area_id = '" + areaId + '\'' + 
			",online = '" + online + '\'' + 
			",open = '" + open + '\'' + 
			",banner_item = '" + bannerItem + '\'' + 
			"}";
		}
}