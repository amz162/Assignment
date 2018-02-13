package com.example.muizsiddiqui.test_app;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.muizsiddiqui.test_app.R.string.error_empty;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_main_submit;
    private EditText edt_main_Password,edt_main_ConfirmPassword,edt_main_username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        buttoninit();
    }

    private void init()
    {
        btn_main_submit=(Button)findViewById(R.id.ok);
        edt_main_username=(EditText)findViewById(R.id.email);
        edt_main_Password=(EditText)findViewById(R.id.password);
        edt_main_ConfirmPassword=(EditText)findViewById(R.id.confirmpassword);
    }
    private void buttoninit(){
        btn_main_submit.setOnClickListener((View.OnClickListener) this);
    }

    private void checks(){

        if(edt_main_username.getText().toString().equals("")){
            edt_main_username.requestFocus();
            edt_main_username.setError(getResources().getString(R.string.error_empty));
            return;
        }
        if(edt_main_Password.getText().toString().equals("")){
            edt_main_Password.requestFocus();
            edt_main_Password.setError(getResources().getString(R.string.error_empty));
            return;
        }
        if(edt_main_ConfirmPassword.getText().toString().equals("")){
            edt_main_ConfirmPassword.requestFocus();
            edt_main_ConfirmPassword.setError(getResources().getString(R.string.error_empty));
            return;
        }
        if(!edt_main_ConfirmPassword.getText().toString().equals(edt_main_Password)){
            edt_main_ConfirmPassword.requestFocus();
            edt_main_ConfirmPassword.setError(getResources().getString(R.string.error_different));
            return;
        }
        String username = edt_main_username.getText().toString();
        Intent intent =new Intent(this,Main2Activity.class);
        intent.putExtra("UserName",username);
        startActivity(intent);

    }
    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.ok){
                checks();
        }
    }
}
