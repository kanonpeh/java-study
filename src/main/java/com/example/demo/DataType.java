package com.example.demo;

public class DataType {
    public static void main(String[] args) {

        int engScore = 78; //英語の点数
        int mathScore = 64; //数学の点数
        float value =58.3F;//偏差値
        char assess  ='B'; //評価
        boolean pass = true; //合格
        long takerCnt = 12345L; //受験者数

        System.out.println("_______________________________");
        System.out.println("【●●さんの結果】");
        System.out.println("英語点数=" + engScore );
        System.out.println("数学点数=" + mathScore );
        System.out.println("偏差値=" + value );
        System.out.println("評価=" + assess );
        System.out.println("合格=" + pass );
        System.out.println("_______________________________");
        System.out.println("受験者数=" + takerCnt );



    }
}
