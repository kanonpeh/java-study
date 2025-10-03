package com.example.demo;
/*
*変数のサンプル２
 */
public class Variable2 {
    public static void main(String[] args) {

        int age;
        age = 20; //変数の宣言と値の代入

        age =24; //変数の値の上書き

        int height = 173; //変数の宣言と値の代入（初期化）

        int thisAge = age; //変数の値を別の変数に代入
        int nextAge = age + 1; //計算結果の代入

        //剛留くん情報の表示を
        System.out.print("剛留くん:年齢は" + thisAge + "歳");
        System.out.print("・身長=" + height + "cm");
        System.out.println("・来年の年齢は" + nextAge + "歳");
    }
}
