package com.am.myse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BGProcess extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_g_process);
        intent=new Intent(BGProcess.this,MyService.class);
    }

    public void st(View view) {
        startService(intent);
    }

    public void sp(View view) {
        stopService(intent);
    }
}