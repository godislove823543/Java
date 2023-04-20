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
public class 父可變字串 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "kiki";
        String s2 = "kiki";
        String s3 = new String("kiki");
        //s1 s2相等 代表他們參考同一份資料
        System.out.println("s1 == s2 is " + (s1 == s2)); //boolean
  
        //StringBuilder 可變字串
        StringBuilder sb;
        sb = new StringBuilder();
        //append 加入字串
        sb.append("ninja");
        sb.append(s1);
        sb.append("hihi ");
        sb.append(1000);
        System.out.println(sb);
        
        //放一堆字串在一個變數裡 
        String s4;
        s4 = "ninja" + s1 + "hihi" + 1000;
        System.out.println(s4);
        
    
}  }
