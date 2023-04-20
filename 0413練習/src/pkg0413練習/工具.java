/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0413練習;

/**
 *
 * @author user
 */
import java.util.Scanner;
 class 工具 {
    private static Scanner sc = new Scanner(System.in);
    
    public static int 英文(){
        System.out.println("英文:");
        int x;
        x = sc.nextInt();
        return x;
        
    }
    
    public static int 數學(){
        System.out.println("數學:");
        int x;
        x = sc.nextInt();
        return x;
    }
    
    public static int 生物(String 生物成績){
        System.out.println(生物成績);
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
