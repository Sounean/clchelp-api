package com.hyphenate.easeim.section.me.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hyphenate.easeim.BuildConfig;
import com.hyphenate.easeim.R;
import com.hyphenate.easeim.common.utils.ToastUtils;
import com.hyphenate.easeim.common.widget.ArrowItemView;
import com.hyphenate.easeim.section.base.BaseInitActivity;
import com.hyphenate.easeui.widget.EaseTitleBar;

public class AboutRoomActivity extends BaseInitActivity implements View.OnClickListener, EaseTitleBar.OnBackPressListener {
    private EaseTitleBar title_bar;
    private TextView tv_version;
    private ImageView btnAddSensor;
    //private ArrowItemView item_product;
    //private ArrowItemView item_company;

    public static void actionStart(Context context) {
        Intent starter = new Intent(context, AboutRoomActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_about_room;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        title_bar = findViewById(R.id.title_bar);
        tv_version = findViewById(R.id.tv_version);
        btnAddSensor = findViewById(R.id.btn_add_sensor);
        //item_product = findViewById(R.id.item_product);
        //item_company = findViewById(R.id.item_company);
    }

    @Override
    protected void initData() {
        super.initData();
        tv_version.setText("添加传感器");
    }

    @Override
    protected void initListener() {
        super.initListener();
        title_bar.setOnBackPressListener(this);
        btnAddSensor.setOnClickListener(this);
        //item_product.setOnClickListener(this);
        //item_company.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_add_sensor:
                ToastUtils.showToast("暂无其他传感器可添加");
                break;
            /*case R.id.item_product :
                jumpToIMIntroduction();
                break;
            case R.id.item_company :
                jumpToCompanyIntroduction();
                break;*/
        }
    }

    private void jumpToIMIntroduction() {
        Uri uri = Uri.parse("https://github.com/Sounean");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    private void jumpToCompanyIntroduction() {
        Uri uri = Uri.parse("https://github.com/Sounean");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    @Override
    public void onBackPress(View view) {
        onBackPressed();
    }
}