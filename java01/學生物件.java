/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class 學生物件 {
    // 物件變數(沒有static)
    public String name; //預設值 null
    public int eng;
    public int math;
    
    
    //物件方法(沒有static)
    public void show(){
        System.out.println("name" + this.name);
        System.out.println("eng" + this.eng);
        System.out.println("math" + this.math);
        System.out.println("加總" + 工具.加總(eng,math));
        System.out.println("平均" + 工具.平均(eng,math));
    }
    
    
}
