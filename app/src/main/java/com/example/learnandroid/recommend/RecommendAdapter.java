package com.example.learnandroid.recommend;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.learnandroid.R;
import com.example.learnandroid.recommend.model.MulRecommend;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.loader.ImageLoader;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class RecommendAdapter extends BaseMultiItemQuickAdapter<MulRecommend, BaseViewHolder> {

    public static final int TYPE_HEADER = 1;
    public static final int TYPE_ITEM = 2;
    public static final int HEADER_SPAN_SIZE = 2;// 占2
    public static final int ITEM_SPAN_SIZE = 1;// 占1

    public RecommendAdapter(List<MulRecommend> data) {
        super(data);
        addItemType(TYPE_HEADER, R.layout.layout_recommend_banner);
        addItemType(TYPE_ITEM, R.layout.item_recommend);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void convert(@NotNull BaseViewHolder holder, MulRecommend mulRecommend) {
        switch (holder.getItemViewType()) {
            case TYPE_HEADER:
                Banner banner = holder.getView(R.id.recommendBanner);
                List<com.example.learnandroid.recommend.model.Banner> listBanner = mulRecommend.mBanner;
                List<String> urls = listBanner.stream().map(new Function<com.example.learnandroid.recommend.model.Banner, String>() {
                    @Override
                    public String apply(com.example.learnandroid.recommend.model.Banner banner) {
                        return banner.getImage();
                    }
                }).collect(Collectors.toList());
                banner.setIndicatorGravity(BannerConfig.RIGHT)
                        .setImages(urls)
                        .setImageLoader(new GlideImageLoader())
                        .start();
                banner.setOnBannerListener(new OnBannerListener() {
                    @Override
                    public void OnBannerClick(int position) {
                        Log.d("positionBanner",position+"");
                    }
                });
                break;
            case TYPE_ITEM:
//                Glide.with(mContext)
//                        .load(mulRecommend.mRecommend.cover)
//                        .centerCrop()
//                        .diskCacheStrategy(DiskCacheStrategy.ALL)
//                        .placeholder(R.drawable.bili_default_image_tv)
//                        .dontAnimate()
//                        .into((ImageView) holder.getView(R.id.iv_video_preview));
//                holder.setText(R.id.tv_video_play_num, NumberUtils.format(mulRecommend.mRecommend.play + ""))
//                        .setText(R.id.tv_video_time, FormatUtils.formatDuration(mulRecommend.mRecommend.duration + ""))
//                        .setText(R.id.tv_video_danmaku, NumberUtils.format(mulRecommend.mRecommend.danmaku + ""))
//                        .setText(R.id.tv_video_title, mulRecommend.mRecommend.title);
//                if (mulRecommend.mRecommend.open != 0) {
//                    //直播
//                    holder.setText(R.id.tv_video_tag, mulRecommend.mRecommend.area);
//                } else {
//                    //推荐
//                    holder.setText(R.id.tv_video_tag, mulRecommend.mRecommend.tname + " · " + mulRecommend.mRecommend.tag.tag_name);
//                }
//                holder.itemView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        mContext.startActivity(new Intent(mContext, VideoDetailActivity.class));
//                    }
//                });
                break;
        }
    }
    private static class GlideImageLoader extends ImageLoader {
        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            Glide.with(context)
                    .load((String) path)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .dontAnimate()
                    .into(imageView);
        }
    }
}
