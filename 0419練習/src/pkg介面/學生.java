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
public class 學生 {
    private CharSequence name; //可以是任何一種字串類型(可變或不可變)
    private int eng;
    private int math;
    
    //constructor
    public 學生(CharSequence name,int eng,int math){
        this.name = name;
        this.eng = eng;
        this.math = math;
    }
    
    //getter public 類型 方法
    public CharSequence getName(){
        return name;
    }
    public int getEng(){
        return eng;
    }
    public int Math(){
        return math;
    }
    //toString方法將回傳 學生類別 的字串 
    @Override
    public String toString(){
        return "姓名=" + name.toString() + "英文="+eng+",數學="+math;
                
    }
    
}
