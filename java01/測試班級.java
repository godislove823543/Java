/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class 測試班級 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         學生物件 x1;
        學生物件 x2;
        學生物件 x3;
        班級 c1;
        班級 c2;
        
        //創造兩個學生資料
        //class 學生物件
        x1 = new 學生物件();
        x1.name = "SC";
        x1.eng = 98;
        x1.math = 78;
  
        
         x2 = new 學生物件();
        x2.name = "cc";
        x2.eng = 102;
        x2.math = 91;
        
        //創造兩個班級資料
        //class 班級
        c1 = new 班級();
        c1.名稱 = "丙班";
        c1.加入學生(x1);
        c1.加入學生(x2);
        c1.顯示資料();
    
        
         c2 = new 班級();
        c2.名稱 = "甲班";
        c2.加入學生(x1);
        c2.加入學生(x2);   
        c2.顯示資料();
      
                
    }
           
    
    
}
