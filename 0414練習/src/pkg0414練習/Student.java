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
public class Student {

    private String name;
    private int eng;
    private int math;
    
    //建構子 constructor
    public Student(String name,int eng,int math){
        this.name = name;
        this.eng = eng;
        this.math = math;
        
    }
    
    //不提供setter

    public void setName(String name) {
        this.name = name;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMath(int math) {
        this.math = math;
    }
    
    
    //getter
    /*
    public String getName(){
        return name;
    }
    
    public int getEng(){
        return eng;
    }
    public int getMath(){
        return math;
    }
    */
    public String toString(){
        return "name=" + name +",eng=" + eng +",math" +math;
    }


    
    
}
