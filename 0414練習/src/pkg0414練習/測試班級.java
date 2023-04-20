/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0414練習;

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
        學生 x1,x2;
        班級 c;
        
        x1 = new 學生();
        x1.id = 1;
        x1.name = "明明";
        x1.eng = 98;
        x1.math=100;
        
        x2 = new 學生();
        x2.id =2;
        x2.name = "豪豪";
        x2.eng = 87;
        x2.math = 97;
        
        c = new 班級();
        c.名稱 = "忠班";
        c.加入學生(x1);
        c.加入學生(x2);
        c.顯示資料();
        
       // 找學生
       學生 x;
       x = c.find學生ById("咪咪");
       
       if(x==null){
           System.out.println("迷有");
       }else{System.out.println("找到" + x.name);}
        
        
        
    }
    
}
