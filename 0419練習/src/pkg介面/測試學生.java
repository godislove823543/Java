/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg介面;

/**
 *
 * @author user
 */
public class 測試學生 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s;
        StringBuilder sb;
        
        s = "Rose";
        sb = new StringBuilder("Jack");
        
        //傳入 建構子 的資料
        學生 st1;
        st1 = new 學生(s,89,85);
        
        學生 st2;
        st2 = new 學生(sb,90,96);
        //toString 如果我尝试将 學生類別 转换为字符串，Java将採用物件類別的toString()方法，该方法将返回 學生類別 的字串
        
        System.out.println(st1);//可省略toString
        System.out.println(st2.toString());
        
    }
    
}
