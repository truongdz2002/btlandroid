package com.example.appbanmaytinh.Package;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.appbanmaytinh.R;

public class RegisterActivity extends AppCompatActivity {
    Button register;
    EditText gmail , password , rePassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_register);
        setContentView(R.layout.activity_register);
        queryItem();

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private  void queryItem(){
        register = findViewById(R.id.btnRegisterRegister);
        gmail = findViewById(R.id.edGmailRegister);
        password = findViewById(R.id.edPasswordRegister);
        rePassword = findViewById(R.id.edRePasswordRegigter);
    }
}