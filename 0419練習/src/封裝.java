/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author user
 */
public class 封裝 {

    private String name; //用private 封裝起來 所以要getter setter
    
     //Getter 返回name的值 省略靜態、空值 因為她要取setter的值
    public String getName(){
    return name ;}
    
    //Setter 採用參數newName(隨便取) 並分配給name 省略靜態 因為他要設定新值

    public void setName(String newName) {
        this.name = newName;
    }
    
    
    
    
            
     
    
}
