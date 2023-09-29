package com.example.bai5;

public class nhanvien {
    String ma,ten;

    public nhanvien(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }
    @Override
    public String toString(){
        return ten +"-"+ ma;
    }
}
