package com.liwy.toptitleview.view2;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.liwy.toptitleview.R;

/**
 * 第二种 顶部标题栏 基于ToolBar封装,适合封装到Activity基类里面使用
 */
public class ToolBarActivity extends AppCompatActivity {
    private OnLeftClickListener onLeftClickListener;                                // 左侧返回按钮点击事件
    private OnRightClickListener onRightClickListener;                              // 右侧标题点击事件
    private static final int defalutBackIconResID = R.drawable.btn_back;          // 左侧返回按钮的默认图片

    // toolbar标题显示位置
    protected static final int TOOLBAR_MODE_NONE = 0;                             // 不显示标题
    protected static final int TOOLBAR_MODE_LEFT = 1;                             // 标题居左侧
    protected static final int TOOLBAR_MODE_CENTER = 2;                           // 标题居右

    public Toolbar toolbar;                                                       // toolbar控件
    public TextView toolbarTitle;                                                 // 标题
    public TextView toolbarRight;                                                 // 右侧控件



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool_bar);
        //初始化
        initToolBar();
        // 设置标题栏内容 分别提供了一下四种方法（setToolbarTitle和setToolbarWithBack为设置标题和左侧内容的方法）
        // setToolbarRight和setToolbarRight为设置右侧内容的方法
        setToolbarTitle(TOOLBAR_MODE_CENTER,"主页");
//        setToolbarWithBack(TOOLBAR_MODE_LEFT, "主页", R.drawable.btn_back, new OnLeftClickListener() {
//            @Override
//            public void onLeftClick() {
//                System.out.println("点击了返回");
//            }
//        });
//        setToolbarRight("更多", new OnRightClickListener() {
//            @Override
//            public void onRightClick() {
//                System.out.println("点击了更多");
//            }
//        });
//        setToolbarRight(R.drawable.btn_back,null);

    }

    // 初始化标题栏控件
    private void initToolBar(){
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        // 初始化toolbar
        if (toolbar != null){
            toolbarTitle = (TextView)findViewById(R.id.tv_toolbar_title);
            toolbarRight = (TextView)findViewById(R.id.tv_toolbar_right);
            //如果页面导入了toolbar则显示
            setSupportActionBar(toolbar);
            if (toolbarTitle != null) {
                //getTitle()的值是activity的android:lable属性值
                toolbarTitle.setText(getTitle());
                toolbarRight.setText("");
                //设置默认的标题不显示
                getSupportActionBar().setDisplayShowTitleEnabled(false);
            }
        }
    }
    // 左侧返回按钮点击事件
    public interface OnLeftClickListener{
        public void onLeftClick();
    }
    // 右侧子标题点击事件
    public interface OnRightClickListener{
        public void onRightClick();
    }

    /**
     * 设置toolbar标题
     * @param titleMode     标题的位置模式
     * @param title          标题的内容
     */
    public void setToolbarTitle (int titleMode,String title) {
        switch (titleMode) {
            case TOOLBAR_MODE_NONE:
                toolbar.setTitle("");
                toolbarTitle.setText("");
                break;
            case TOOLBAR_MODE_LEFT:
                toolbar.setTitle(title);
                toolbarTitle.setText("");
                break;
            case TOOLBAR_MODE_CENTER:
                toolbar.setTitle("");
                toolbarTitle.setText(title);
                break;
        }
    }

    /**
     * 设置toolbar标题和左侧返回键
     * @param titleMode     标题的位置模式
     * @param title          标题的内容
     * @param backResId     左侧返回按钮的图标资源id
     * @param leftClickListener 左侧点击事件
     */
    public void setToolbarWithBack(int titleMode,String title,int backResId,OnLeftClickListener leftClickListener){
        setToolbarTitle(titleMode,title);
        if (backResId != 0){
            toolbar.setNavigationIcon(backResId);
        }else{
            toolbar.setNavigationIcon(defalutBackIconResID);
        }
        this.onLeftClickListener = leftClickListener;
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onLeftClickListener != null){
                    onLeftClickListener.onLeftClick();
                }else{
                    onBackPressed();
                }
            }
        });
    }

    /**
     *  设置右侧文字或图标及点击事件
     * @param text  右侧标题内容
     * @param rightClickListener  右侧点击事件
     */
    public void setToolbarRight(String text,OnRightClickListener rightClickListener){
        if (text != null && !"".equals(text)){
            toolbarRight.setCompoundDrawables(null,null,null,null);
            toolbarRight.setText(text);
            this.onRightClickListener = rightClickListener;
            toolbarRight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onRightClickListener != null){
                        onRightClickListener.onRightClick();
                    }
                }
            });
        }else{
            toolbarRight.setVisibility(View.INVISIBLE);
        }
    }

    /**
     * 设置右侧文字或图标及点击事件
     * @param resId 右侧图标资源id
     * @param rightClickListener 右侧点击事件
     */
    public void setToolbarRight(int resId,OnRightClickListener rightClickListener){
        if (resId != 0){
            toolbarRight.setText("");
            Drawable drawable;
            if (Build.VERSION.SDK_INT >= 21){
                drawable = getResources().getDrawable(resId,null);
            }else{
                drawable = getResources().getDrawable(resId);
            }
            drawable.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());

            toolbarRight.setCompoundDrawables(drawable,null,null,null);
            this.onRightClickListener = rightClickListener;
            toolbarRight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onRightClickListener != null){
                        onRightClickListener.onRightClick();
                    }
                }
            });
        }else{
            toolbarRight.setVisibility(View.INVISIBLE);
        }
    }
    public void setOnLeftClickListener(OnLeftClickListener onLeftClickListener) {
        this.onLeftClickListener = onLeftClickListener;
    }

    public void setOnRightClickListener(OnRightClickListener onRightClickListener) {
        this.onRightClickListener = onRightClickListener;
    }

}
