package com.baby.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.baby.R;
import com.baby.activity.doctor.DoctorHomeActivity;
import com.baby.activity.doctor.DoctorMainActivity;

public class LogoActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Intent intent=new Intent();
        intent.setClass(this,DoctorMainActivity.class);
        startActivity(intent);
        this.finish();
    }
}