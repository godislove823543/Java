/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Ex03SCORE {
    //宣告變數和資料類型
    public static String 名字;
    public static int TOEIC_SCORE;
    public static int TQC_SCORE;
    
    //設定變數值
    public static void 設定初值(){
        System.out.println("---設定初值---");
        名字 = "Scarlett";
        TOEIC_SCORE = 700;
        TQC_SCORE = 100;
    }
    
    public static void 顯示資料(){
        System.out.println("---顯示資料---");
        System.out.println(名字);
        System.out.println(TOEIC_SCORE);
        System.out.println(TQC_SCORE);
    }
    
    public static void 修改資料() {
        System.out.println("---修改資料---");
        名字 = "KIKI";
        TOEIC_SCORE = 930;
        TQC_SCORE = 87;
    }
    
    
    
    
}
