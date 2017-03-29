package com.liwy.toptitleview.view1;

import android.app.Activity;
import android.graphics.Color;

/**
 * 标题栏配置类
 * Created by liwy on 16/7/28.
 */
public class ConfigTop {

    public ConfigTop(Builder builder) {
        this.backgroundColor = builder.backgroundColor;
        this.buttonTitleSize = builder.buttonTitleSize;
        this.titleSize = builder.titleSize;
        this.titleTextColor = builder.titleTextColor;
        this.leftButtonImg = builder.leftButtonImg;
        this.rightButtonImg = builder.rightButtonImg;
        this.leftText = builder.leftText;
        this.titleText = builder.titleText;
        this.rightText = builder.rightText;
        this.activity = builder.activity;
        this.leftContentMargin = builder.leftContentMargin;
        this.rightContentMargin = builder.rightContentMargin;
        this.onLeftClickListener = builder.onLeftClickListener;
        this.onRightClickListener = builder.onRightClickListener;

    }

    public static final int transprent = Color.parseColor("#00000000");//透明色
    /**
     * 背景色
     */
    private int backgroundColor = Color.parseColor("#3F51B5");//默认深蓝色
    /**
     * 字体颜色
     */
    private int titleTextColor = Color.parseColor("#ffffff");//默认白色

    /**
     * 标题字体大小
     */
    private int titleSize = 20;
    /**
     * 按钮字体大小
     */
    private int buttonTitleSize = 16;

    /**
     * 左侧按钮图片
     */
    private int leftButtonImg;
    /**
     * 左侧按钮的内容距离最左边的长度
     */
    private int leftContentMargin;
    /**
     * 右侧按钮的内容距离最右边的长度
     */
    private int rightContentMargin;
    /**
     * 右侧按钮图片
     */
    private int rightButtonImg;

    /**
     * 左侧按钮文字
     */
    private String leftText;

    /**
     * 标题文字
     */
    private String titleText;

    /**
     * 右侧按钮文字
     */
    private String rightText;
    /**
     * 左右侧点击事件
     */
    private LiwyTop.OnLeftClickListener onLeftClickListener;
    private LiwyTop.OnRightClickListener onRightClickListener;

    /**
     * Activity实例，用于返回按钮销毁页面
     */
    private Activity activity;

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        activity = activity;
    }

    public String getLeftText() {
        return leftText;
    }

    public void setLeftText(String leftText) {
        this.leftText = leftText;
    }

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }

    public String getRightText() {
        return rightText;
    }

    public void setRightText(String rightText) {
        this.rightText = rightText;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * 设置标题栏背景色
     * @param backgroundColor
     */
    public void setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public int getTitleTextColor() {
        return titleTextColor;
    }

    /**
     * 设置标题文字和按钮文字颜色
     * @param titleTextColor
     */
    public void setTitleTextColor(int titleTextColor) {
        this.titleTextColor = titleTextColor;
    }

    public int getTitleSize() {
        return titleSize;
    }

    public void setTitleSize(int titleSize) {
        this.titleSize = titleSize;
    }

    public int getButtonTitleSize() {
        return buttonTitleSize;
    }

    public void setButtonTitleSize(int buttonTitleSize) {
        this.buttonTitleSize = buttonTitleSize;
    }

    public int getLeftButtonImg() {
        return leftButtonImg;
    }

    public void setLeftButtonImg(int leftButtonImg) {
        this.leftButtonImg = leftButtonImg;
    }

    public int getRightButtonImg() {
        return rightButtonImg;
    }

    public void setRightButtonImg(int rightButtonImg) {
        this.rightButtonImg = rightButtonImg;
    }

    public int getLeftContentMargin() {
        return leftContentMargin;
    }

    public void setLeftContentMargin(int leftContentMargin) {
        this.leftContentMargin = leftContentMargin;
    }

    public int getRightContentMargin() {
        return rightContentMargin;
    }

    public void setRightContentMargin(int rightContentMargin) {
        this.rightContentMargin = rightContentMargin;
    }

    public LiwyTop.OnLeftClickListener getOnLeftClickListener() {
        return onLeftClickListener;
    }

    public void setOnLeftClickListener(LiwyTop.OnLeftClickListener onLeftClickListener) {
        this.onLeftClickListener = onLeftClickListener;
    }

    public LiwyTop.OnRightClickListener getOnRightClickListener() {
        return onRightClickListener;
    }

    public void setOnRightClickListener(LiwyTop.OnRightClickListener onRightClickListener) {
        this.onRightClickListener = onRightClickListener;
    }

    public static class Builder{
        public Builder() {
        }

        public ConfigTop builder(){
            return new ConfigTop(this);
        }

        private int backgroundColor = Color.parseColor("#3F51B5");//默认深蓝色

        private int titleTextColor = Color.parseColor("#ffffff");//默认白色

        private int titleSize = 20;

        private int buttonTitleSize = 16;

        private int leftButtonImg;

        private int rightButtonImg;

        private String leftText;

        private String titleText;

        private String rightText;

        private Activity activity;

        private int leftContentMargin;

        private int rightContentMargin;

        private LiwyTop.OnRightClickListener onRightClickListener;

        private LiwyTop.OnLeftClickListener onLeftClickListener;


        public Builder setBackgroundColor(int backgroundColor) {
            this.backgroundColor = backgroundColor;
            return this;
        }

        public Builder setTitleTextColor(int titleTextColor) {
            this.titleTextColor = titleTextColor;
            return this;
        }

        public Builder setTitleSize(int titleSize) {
            this.titleSize = titleSize;
            return this;
        }

        public Builder setButtonTitleSize(int buttonTitleSize) {
            this.buttonTitleSize = buttonTitleSize;
            return this;
        }

        public Builder setLeftButtonImg(int leftButtonImg) {
            this.leftButtonImg = leftButtonImg;
            return this;
        }

        public Builder setRightButtonImg(int rightButtonImg) {
            this.rightButtonImg = rightButtonImg;
            return this;
        }

        public Builder setLeftText(String leftText) {
            this.leftText = leftText;
            return this;
        }

        public Builder setTitleText(String titleText) {
            this.titleText = titleText;
            return this;
        }

        public Builder setRightText(String rightText) {
            this.rightText = rightText;
            return this;
        }

        public Builder setActivity(Activity activity) {
            this.activity = activity;
            return this;
        }

        public Builder setLeftContentMargin(int leftContentMargin) {
            this.leftContentMargin = leftContentMargin;
            return this;
        }

        public Builder setRightContentMargin(int rightContentMargin) {
            this.rightContentMargin = rightContentMargin;
            return this;
        }

        public Builder setOnRightClickListener(LiwyTop.OnRightClickListener onRightClickListener) {
            this.onRightClickListener = onRightClickListener;
            return this;
        }

        public Builder setOnLeftClickListener(LiwyTop.OnLeftClickListener onLeftClickListener) {
            this.onLeftClickListener = onLeftClickListener;
            return this;
        }
    }
}
