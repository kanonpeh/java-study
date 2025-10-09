package com.example.demo;
/*
*定数のサンプル１
 */
public class Constant {
    public static void main(String[] args) {

        final int PERFECT_SCORE =100;        //満点
        int mySCORE  =72; //変数（得点）の宣言・初期化
        //PERFECT_SCORE =200; //定数への再代入（エラーになる）

        //成績情報の表示
        System.out.println("満点=" +PERFECT_SCORE );
        System.out.println("得点=" +mySCORE );
    }
}
