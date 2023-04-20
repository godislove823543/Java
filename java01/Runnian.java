/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Runnian {
    public static double x;
    public static int y;
    
    public static void 設定初值(){
        x = Math.random();
    }
    public static void 產生年分(){
        y = (int)(x*3000);
    }
    
    public static void 設定條件(){
        if((y % 4 ==0 && y %100!=0) || (y % 400 ==0&&y%100!=0)){
            System.out.println(y +"是閏年");
    }
        else{
            System.out.println(y+"不是閏年");
        }
    }
    
    public static void 跑流程(){
        設定初值();
        產生年分();
        設定條件();
    }
    
}
