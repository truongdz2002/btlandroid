package com.example.appbanmaytinh.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class database extends SQLiteOpenHelper {
    public  static String TBSanpham="San pham";
    public static String TBNguoidung="Nguoidung";
//Thuoc tinh bang table san  pham
public  static String TBSanpham_MaSP="Ma san pham";
    public  static String TBSanpham_Ten="Ten san pham";
    public  static String TBSanpham_Loai="Loai san pham";
    public  static String TBSanpham_Gia="Gia san pham";
    public  static String TBSanpham_Soluong="So luong san pham";
   //Thuoc tinh du lieu nguoi dung
    public static String TBNguoidung_makh="Ma khach hang";
    public static String TBNguoidung_Gmail="Gmail";
    public static String TBNguoidung_password="Password";
    public static String TBNguoidung_Soluongspmua="So luong san pham mua";
    public static String TBNguoidung_Sotienbora="So tien nhan duoc";



    public database(@Nullable Context context) {
        super(context,"Ban pc",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase DB) {
        String TB_Sanpham=" CREATE TABLE " + TBSanpham + " ( " + TBSanpham_MaSP +" INTEGER PRIMARY KEY AUTOINCREMENT,"
                + TBSanpham_Ten + "TEXT," + TBSanpham_Loai +"TEXT," +TBSanpham_Gia + "TEXT"
                + TBSanpham_Soluong + "TEXT)";
        String TB_Nguoidung="CREATE TABLE " +TBNguoidung +" ( " + TBNguoidung_makh +" INTEGER PRIMARY KEY AUTOINCREMENT,"
                +TBNguoidung_Gmail + "TEXT," +TBNguoidung_password + "TEXT" + TBNguoidung_Soluongspmua + "TEXT,"
                +TBNguoidung_Sotienbora + "TEXT ) ";
        DB.execSQL(TB_Sanpham);
        DB.execSQL(TB_Nguoidung);


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public SQLiteDatabase Open()
    {
        return this.getWritableDatabase();
    }



}
