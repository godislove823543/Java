/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class 帳戶1 {
    private String 名稱;
    private int 餘額;
    
    //建構子 不可寫void
    public 帳戶1(String 名稱,int 餘額){
        this.名稱 = 名稱;
        this.餘額 = 餘額;
        System.out.println("建構子rrrrr");
    }
    //get 取值
    public String get名稱(){return this.名稱;}
    public int get餘額(){return this.餘額;}
    
    //字串方法
    public String toString(){
        return this.0名稱 + this.餘額 ;
    }
}
