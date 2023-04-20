/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class 猜密碼 {
    public static double r;
    public static int g;
    public static int a;
    public static void Guess(){
        System.out.println("10~50,猜一個數字"); 
        g = (int) (Math.random() * 51);                
        a = 11;
        
        System.out.println("我猜是"+g);
        
        if (g == a && g>10){
            System.out.println("Brilliant!!"+a);
            }
        else if(g<10){
            System.out.println("Error!");
        }
        else{
            System.out.println("Oops,not this");
        }
                
        
        
    }
        
    }
    
            
}
