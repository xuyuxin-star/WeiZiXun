package com.example.customview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private DeleteTextview deleteview;
    private SpinnerView spinnerview;
    private CustomView customview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        deleteview = (DeleteTextview) findViewById(R.id.deleteview);
        spinnerview = (SpinnerView) findViewById(R.id.spinnerview);
        //设置删除线
        deleteview.setDeleteLine();
        customview = (CustomView) findViewById(R.id.customview);
    }
}
