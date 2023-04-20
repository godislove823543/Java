/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class 工具 {
    private static Scanner sc = new Scanner(System.in);
    
    public static int 輸入成績(){
        System.out.println("請輸入成績:");
        int x;
        x = sc.nextInt();
        return x;
    }
    
    public static int 加總(int eng,int math){
        int x;
        x = eng + math;
        return x;
    }
    
    public static int 平均(int total){
        int x;
        x = total/2;
        return x;
    }
}
