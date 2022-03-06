package com.example.appbanmaytinh.Package;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.appbanmaytinh.computer.computer;

import com.example.appbanmaytinh.R;

public class Fragment_detail extends Fragment {
  private  ImageView sp;
    private  TextView tv3;
    private  TextView tv4;
    private Button take;
    private View view;














    public Fragment_detail() {

    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view= inflater.inflate(R.layout.fragment_detail, container, false);
        tv3=view.findViewById(R.id.tv3);
        tv4=view.findViewById(R.id.tv4);
        take=view.findViewById(R.id.bttake);
        sp=view.findViewById(R.id.sp);
        Bundle bundle=getArguments();
        if(bundle!=null)
        {
            computer computer=(computer) bundle.get("Anh");
            if(computer!=null)
            {
                tv3.setText(computer.getTenpc());
                tv4.setText(computer.getGiapc());
                sp.setImageResource(computer.getHinh());
            }
        }

        return view;


    }
}