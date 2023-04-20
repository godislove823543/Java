/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
//建構子(constructor)
//建構子就是類別當中的方法，用於設定 物件資料(變數)初值，搭配new使用
//如果沒寫建構子，會自動採用預設建構子，雖然程式碼中看不到
//建構子 方法名稱 必須與類別同名，且不能寫void

public class 日期 {
    private final int year;
    private final int month;
    private final int day;
    
    //建構子(帶有3個參數y m d)
    public 日期(int year,int month,int day){
        this.year = year;
        this.month = month;
        this.day = day;
        System.out.println("建構子 完成");
        
    }
    //取值方法getter
    public int getYear(){return this.year;}
    public int getMonth(){return this.month;}
    public int getDay(){return this.day;}
    
    //字串方法 通常用於System.out.println() 顯示物件值 命名為toString()
    
    public String toString(){
        return this.year + "/" + this.month + "/" + this.day;
    }
  
}
