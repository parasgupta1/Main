package com.example.paras.internsinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Aditi extends AppCompatActivity {
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aditi);
        t=(TextView)findViewById(R.id.textView2);
        Intent I = getIntent();
        String a = I.getStringExtra("desc");
        t.setText(""+a);


    }
}
