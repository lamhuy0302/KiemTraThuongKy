package com.example.student.lhh_cau1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2ActivityBai2 extends AppCompatActivity {

    @Override
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
        int b=packageFromCaller.getInt("soc");
        //        //tiến hành xử lý
        giaipt(a, b,c);
        btnGoiA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void giaipt(int a,int b, int c)
    {
        String kq="";
        if(a==0 && b==0)
        {
            kq="Vô số nghiệm";
        }
        else if(a==0 && b!=0)
        {
            kq="Vô nghiệm";
        }
        else
        {

        }
        tvKq.setText(kq);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_result, menu);
        return true;
    }
}
