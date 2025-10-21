package com.example.demo;

public class Grades {
    public static void main(String[] args) {
        String name ="河合彩香";//名前
        float value = 62.7f;//偏差値
        char assess = 'A';//評価

        //文字列の連結（連結演算子を使用）
        String result = name + "さんの偏差値は" + value + "で、評価は" + assess + "です。";
        System.out.println(result);
    }
}
