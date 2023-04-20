

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class 班級 {
   public String 名稱; //班級名稱
   private ArrayList<學生物件> 學生們;
   
   //建構子 new
   public 班級(){
       //建立一個陣列
       this.學生們=new ArrayList<>(); 
       System.out.println("班級 建構完成");
       
   }
    //main 給我學生 我把它放進陣列裡
   public void 加入學生(學生物件 x){ 
      //在陣列裡加入 學生物件
       this.學生們.add(x);
       System.out.println("加入學生" + x.name);
   }  
   public void 顯示資料(){  
       //this.名稱(班級)
       System.out.println("顯示" + this.名稱 + "的資料");
       //System.out.println(學生們.toString());
       //用for讀取學生物件 到 陣列裡 然後show
     for (學生物件 x : this.學生們){   x.show(); }
      
       
    
          
      
            
         
       
   }
}
