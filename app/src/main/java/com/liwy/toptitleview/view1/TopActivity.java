package com.liwy.toptitleview.view1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.liwy.toptitleview.R;

public class TopActivity extends AppCompatActivity {
    private LiwyTop liwyTop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);
        initView();
    }

    private void initView(){
        liwyTop = (LiwyTop)findViewById(R.id.liwytop);
        //配置类(配置控件样式,可配置详情可查看ConfigTop类) 如果设置属性满足了不来各位客官，各位客官只能再扩充点了
        // 配置1
//        ConfigTop config = new ConfigTop.Builder().setActivity(this)
//                .setLeftButtonImg(R.drawable.btn_back)
//                .setTitleText("首页")
//                .setRightText("提交666").setRightButtonImg(R.drawable.btn_back).setOnRightClickListener(new LiwyTop.OnRightClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        System.out.println("点击了提交");
//                    }
//                }).setOnLeftClickListener(new LiwyTop.OnLeftClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        System.out.println("点击了返回按钮");
//                    }
//                }).builder();
        // 配置2
        ConfigTop config = new ConfigTop.Builder().setTitleText("首页").builder();
        //需先传入ConfigTop的实例对象.然后再调用setLiwyTop方法初始化标题栏.
        liwyTop.setConfig(config);
    }
}
