package com.example.learnandroid.recommend.model;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.List;

public class MulRecommend implements MultiItemEntity {

    public int itemType;
    public int spanSize;
    public Recommend mRecommend;
    public List<Banner> mBanner;

    public MulRecommend(int itemType, int spanSize, Recommend recommend) {
        this.itemType = itemType;
        this.spanSize = spanSize;
        this.mRecommend = recommend;
    }

    public MulRecommend(int itemType, int spanSize, List<Banner> banners) {
        this.itemType = itemType;
        this.spanSize = spanSize;
        this.mBanner = banners;
    }

    @Override
    public int getItemType() {
        return itemType;
    }
}
