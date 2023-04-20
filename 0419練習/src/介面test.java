/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class 介面test {

    //類別強調屬於什麼種類 介面強調有什麼功能
    public static void main(String[] args) {
        
        //String 與StringBuilder類別都實現了 CharSequence介面
       String s = "Jayme";
       
       StringBuilder sb = new StringBuilder();
       sb.append("Elsa");
       
       //CharSequence 字串介面 定義字串有哪些功能
       CharSequence cs;
       cs = s; //共用
       System.out.println(cs.length()); //5
       System.out.println("產生不可變字串"+cs.toString()); //jayme
       System.out.println("位置0文字"+cs.charAt(0)); //j
       
       cs =sb; 
         System.out.println(cs.length()); //4
       System.out.println("產生不可變字串"+cs.toString()); //Elsa
       System.out.println("位置0文字"+cs.charAt(0)); //E
       
       
       
       
               
       
       
       
               
    }
    
}
