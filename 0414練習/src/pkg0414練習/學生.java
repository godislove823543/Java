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
public class 學生 {
    //物件變數(沒有static)
    public int id;
    public String name;
    public int eng;
    public int math;
    
    //物件方法 沒有static
    public void show(){
        System.out.println("id" + this.id);
        System.out.println("name" + this.name);
        System.out.println("eng" + this.eng);
        System.out.println("math" + this.math);
        System.out.println("----------------------------");
        
        
        
        
    }
    
    
}
