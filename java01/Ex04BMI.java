/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
//1, 設定變數和資料類型
public class Ex04BMI {
    public static double cm;
    public static double kg;
    public static double m;
    public static double bmi;
    
    //2. 設定變數值和運算
    public static void 設定初值() {
        System.out.println("---設定初值---");
        cm = 156;
        kg = 51;
        m = cm / 100.0;
        bmi = kg / (m*m);
       
        
        
    }
    
    //3. 設定條件
    public static void 設定條件(){
        System.out.println("---你是---");
         if (bmi >=18 && bmi <=21 ){
            System.out.println("標準美人");
         }
         else if (bmi >=21 && bmi<= 23){
             System.out.println("棉花糖女孩");
         }
         else{
             System.out.println("極端身材");
         }
         
         //4. 把浮點數 轉成整數
            
             
         }
    
             
    //打印
    public static void 顯示資料(){
        double myDouble = bmi;
        int myInt = (int) myDouble;
        System.out.println("bmi: " + myInt);
        
    }

         
        
         
        
    }
    
    

    
}
