package com.example.muizsiddiqui.test_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    private TextView tt_main2_Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
    }

    private void init(){
        String Name = getIntent().getStringExtra("UserName");
        tt_main2_Name =(TextView)findViewById(R.id.Name);
        tt_main2_Name.setText(Name);
    }
}
