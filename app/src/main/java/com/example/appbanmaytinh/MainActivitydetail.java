package com.example.appbanmaytinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appbanmaytinh.computer.computer;

public class MainActivitydetail extends AppCompatActivity {
    private ImageView sp;
    private TextView tv3;
    private TextView tv4;
    private Button take;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitydetail);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        take = findViewById(R.id.bttake);
        sp = findViewById(R.id.sp);
        /*Bundle bundle = getArguments();
        if (bundle != null) {
            computer computer = (computer) bundle.get("Anh");
            if (computer != null) {
                tv3.setText(computer.getTenpc());
                tv4.setText(computer.getGiapc());
                sp.setImageResource(computer.getHinh());
            }
        }*/
    }
}
