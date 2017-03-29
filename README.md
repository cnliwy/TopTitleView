# TopTitleView<br>
顶部标题栏使用说明 <br>
===
第一种:LiwyTop<br>
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
