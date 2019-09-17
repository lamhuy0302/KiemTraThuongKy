package com.example.student.lhh_cau1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityBai2NhapSo extends AppCompatActivity {
    Button btnGiai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_nhapso);
        btnGiai =(Button)findViewById(R.id.btnGiai);
        btnGiai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityBai2NhapSo.this,Main2ActivityBai2.class);
                startActivity(intent);
            }
        });
    }
}
