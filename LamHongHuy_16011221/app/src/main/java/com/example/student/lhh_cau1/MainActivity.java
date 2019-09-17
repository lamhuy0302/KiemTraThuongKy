package com.example.student.lhh_cau1;





import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvInfo = (ListView) findViewById(R.id.lvInfomation);
        ArrayList<Infomation> arrInfo = new ArrayList<>();

        Infomation info1 = new Infomation( R.drawable.kyduyen,"Ky Duyen",1990,R.drawable.co1);
        Infomation info2 = new Infomation( R.drawable.thuthao,"Dang Thu Thao",1995,R.drawable.co1);

        arrInfo.add(info1);
        arrInfo.add(info2);

        CustomAdapter customAdaper = new CustomAdapter(MainActivity.this,R.layout.row,arrInfo);
        lvInfo.setAdapter(customAdaper);

    }
}

