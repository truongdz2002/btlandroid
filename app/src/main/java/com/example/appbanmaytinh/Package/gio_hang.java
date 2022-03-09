package com.example.appbanmaytinh.Package;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.appbanmaytinh.MainActivity;
import com.example.appbanmaytinh.R;
import com.example.appbanmaytinh.computer.adapter.cartadapter;
import com.example.appbanmaytinh.computer.cart;

import java.util.ArrayList;
import java.util.List;

public class gio_hang extends Fragment {

    private View view;
    private MainActivity nmainActivity;
    private cartadapter adapter;
    private RecyclerView lv4;
    private TextView tt;

    public gio_hang() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_gio_hang, container, false);
       nmainActivity=(MainActivity) getActivity();
       lv4=view.findViewById(R.id.lv4);
       tt=view.findViewById(R.id.tt);
       cartadapter adapter =new cartadapter(getlistcart());
       lv4.setAdapter(adapter);
       GridLayoutManager gridLayoutManager=new GridLayoutManager(nmainActivity,1);
       lv4.setLayoutManager(gridLayoutManager);
       RecyclerView.ItemDecoration itemDecoration=new DividerItemDecoration(nmainActivity,DividerItemDecoration.VERTICAL);
       lv4.addItemDecoration(itemDecoration);
        return view;
    }
    public List<cart> getlistcart()
    {
        List<cart> list=new ArrayList<>();
        list.add(new cart(R.drawable.asus,"ASUS","123213143"));
        return list;

    }

    }
