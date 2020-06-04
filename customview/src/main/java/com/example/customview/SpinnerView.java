package com.example.customview;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class SpinnerView extends RelativeLayout {


    private ArrayList<String> list;
    private EditText et_content;
    private ImageView iv;
    private PopupWindow pop;



    public SpinnerView(Context context) {
        super(context);
    }
    //必须有的构造
    public SpinnerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        //需要将写的布局添加到这个自定义view中
        //需要将写的布局添加到这个自定义view中
        //LayoutInflater.from(getContext()).inflate(R.layout.layout_spinner,this);
        LayoutInflater.from(getContext()).inflate(R.layout.layout_spinner,this);
        initView();
        initData();
    }

    private void initData() {
//        list = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            list.add("数据"+i);
//        }
        list = new ArrayList<>();
            //向集合添加数据
            list.add("哈哈");
            list.add("嘻嘻");
            list.add("呵呵");
            list.add("嘿嘿");
            list.add("丫丫");
            list.add("啦啦");
            list.add("嗯嗯");
            list.add("哈哈");
            list.add("嘻嘻");
            list.add("哈哈");
            list.add("呜呜");

    }

    private void initView() {
        et_content = findViewById(R.id.et_content);
        iv = findViewById(R.id.iv);
        iv.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                showPop();
            }
        });
    }

    private void showPop() {
//        if (pop == null){
//            pop = new PopupWindow(et_content.getWidth(), 600);
//            ListView listView = new ListView(getContext());
//            listView.setAdapter(new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,list));
//            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                @Override
//                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                    String s = list.get(position);
//                    et_content.setText(s);
//                    //将光标移动到某个位置
//                    et_content.setSelection(s.length());
//                    pop.dismiss();
//                }
//            });
//            //popwindow三要素之View
//            pop.setContentView(listView);
//            pop.setBackgroundDrawable(new ColorDrawable());
//            pop.setOutsideTouchable(true);
//            pop.setFocusable(true);
//        }
//        pop.showAsDropDown(et_content);
        //判断popwindow是否为空，实现复用
        if (pop == null){
             pop = new PopupWindow(et_content.getWidth(), 800);
            ListView listView = new ListView(getContext());
            listView.setAdapter(new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,list));
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String s = list.get(position);
                    et_content.setText(s);
                    et_content.setSelection(s.length());
                    pop.dismiss();
                }
            });
            pop.setContentView(listView);
            pop.setBackgroundDrawable(new ColorDrawable());
            pop.setOutsideTouchable(true);
            pop.setFocusable(true);
        }
        pop.showAsDropDown(et_content);
   }
}
