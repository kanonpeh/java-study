package com.example.demo;

public class DemoApplication5 {
    public static void main(String[] args)
    {
        //変数の宣言・初期化
        int a;

        //後置インクリメント
        a = 5;
        int result1 = a++;
        System.out.println("result1:" + result1 );
        System.out.println("a:" + a );

        //前置インクリメント
        a = 5;
        int result2 = ++a;
        System.out.println("result2:" + result2 );
        System.out.println("a:" + a );

        //後置デクリメント
        a = 5;
        int result3 = a--;
        System.out.println("result3:" + result3 );
        System.out.println("a:" + a );

        //前置デクリメント
        a = 5;
        int result4 = --a;
        System.out.println("result4:" + result4 );
        System.out.println("a:" + a );

    }
}
