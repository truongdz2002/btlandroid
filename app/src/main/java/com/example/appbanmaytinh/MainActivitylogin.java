package com.example.appbanmaytinh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.appbanmaytinh.database.database;

public class MainActivitylogin extends AppCompatActivity {
    Button login;
    EditText gmail;
    private long back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitylogin);
        login = findViewById(R.id.login);
        gmail=findViewById(R.id.gmail);
        /*database db=new database(this);
        db.Open();*/
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivitylogin.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
//
    @Override
    public void onBackPressed() {
        if (back + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();

        }

        else

    {
        Toast.makeText(MainActivitylogin.this, "Nhấn lần nữa để thoát", Toast.LENGTH_LONG).show();
    }
        back=System.currentTimeMillis();

}


}