package com.example.demo;

public class DataType2 {
    public static void main(String[] args) {
        //変数の宣言・初期化
        int a = 5;
        double b = 3.0;
        String x = "文字列";

        //Stringとintの連結
        String result1 = x + a;
        System.out.println("result1: " + result1);

        //Stringとdoubleの連結
        String result2 = x + b;
        System.out.println("result2: " + result2);
    }
}
