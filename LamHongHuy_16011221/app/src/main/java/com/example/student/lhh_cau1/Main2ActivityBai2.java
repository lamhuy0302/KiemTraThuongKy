package com.example.student.lhh_cau1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2ActivityBai2 extends AppCompatActivity {

    TextView tvKq;
    Button btnGoiA;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_bai2);
        btnGoiA=(Button) findViewById(R.id.btnGoiA);
        tvKq=(TextView) findViewById(R.id.etKq);
        //lấy intent gọi Activity này
        Intent callerIntent=getIntent();
        //có intent rồi thì lấy Bundle dựa vào MyPackage
        Bundle packageFromCaller=
                callerIntent.getBundleExtra("MyPackage");
        //Có Bundle rồi thì lấy các thông số dựa vào soa, sob
        int a=packageFromCaller.getInt("soa");
        int b=packageFromCaller.getInt("sob");
        int c=packageFromCaller.getInt("soc");
        giaipt(a,b,c);
        //        //tiến hành xử lý
        btnGoiA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void giaipt(int a,int b, int c)
    {
        int kq = a+b+c;
        tvKq.setText(kq);
    }
}
