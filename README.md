# TopTitleView<br>
顶部标题栏使用说明 <br>
===
##第一种:LiwyTop<br>
        liwyTop = (LiwyTop)findViewById(R.id.liwytop);<br>
        //配置类(配置控件样式,可配置详情可查看ConfigTop类) 如果设置属性满足了不来各位客官，各位客官只能再扩充点了<br>
        // 配置1<br>
        ConfigTop config = new ConfigTop.Builder().setActivity(this)<br>
                .setLeftButtonImg(R.drawable.btn_back)<br>
                .setTitleText("首页")<br>
                .setRightText("提交").setRightButtonImg(R.drawable.btn_back).setOnRightClickListener(new LiwyTop.OnRightClickListener() {<br>
                    @Override<br>
                    public void onClick(View v) {<br>
                        System.out.println("点击了提交");<br>
                    }<br>
                }).setOnLeftClickListener(new LiwyTop.OnLeftClickListener() {<br>
                    @Override<br>
                    public void onClick(View v) {<br>
                        System.out.println("点击了返回按钮");<br>
                    }<br>
                }).builder();<br>
      liwyTop.setConfig(config);<br>
 如果左侧按钮既设置了文字又设置了图片，则以图片优先级为主。右侧按钮同理。<br>
 
 ##第二种:ToolBar的封装实现，适合在封装在Activity的基类里面继承使用<br>
   首先在布局里引入<br>
   <include layout="@layout/toolbar_layout"></include><br>
   然后初始化标题栏<br>
   initToolBar();<br>
   最后设置标题栏内容 分别提供了一下四种方法（setToolbarTitle和setToolbarWithBack为设置标题和左侧内容的方法）<br>
   （setToolbarRight和setToolbarRight为设置右侧内容的方法）<br>
        setToolbarTitle(TOOLBAR_MODE_CENTER,"主页");<br>
//        setToolbarWithBack(TOOLBAR_MODE_LEFT, "主页", R.drawable.btn_back, new OnLeftClickListener() {<br>
//            @Override<br>
//            public void onLeftClick() {<br>
//                System.out.println("点击了返回");<br>
//            }<br>
//        });<br>
//        setToolbarRight("更多", new OnRightClickListener() {<br>
//            @Override<br>
//            public void onRightClick() {<br>
//                System.out.println("点击了更多");<br>
//            }<br>
//        });<br>
//        setToolbarRight(R.drawable.btn_back,null);<br>
