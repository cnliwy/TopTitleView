# TopTitleView
顶部标题栏使用说明 
第一种:LiwyTop
        liwyTop = (LiwyTop)findViewById(R.id.liwytop);
        //配置类(配置控件样式,可配置详情可查看ConfigTop类) 如果设置属性满足了不来各位客官，各位客官只能再扩充点了
        // 配置1
        ConfigTop config = new ConfigTop.Builder().setActivity(this)
                .setLeftButtonImg(R.drawable.btn_back)
                .setTitleText("首页")
                .setRightText("提交666").setRightButtonImg(R.drawable.btn_back).setOnRightClickListener(new LiwyTop.OnRightClickListener() {
                    @Override
                    public void onClick(View v) {
                        System.out.println("点击了提交");
                    }
                }).setOnLeftClickListener(new LiwyTop.OnLeftClickListener() {
                    @Override
                    public void onClick(View v) {
                        System.out.println("点击了返回按钮");
                    }
                }).builder();
      liwyTop.setConfig(config);
 如果左侧按钮既设置了文字又设置了图片，则以图片优先级为主。右侧按钮同理
