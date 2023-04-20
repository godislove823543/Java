/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class 帳戶 {
    private String 名稱;  // 物件變數
    private int 餘額;

    帳戶(String scatlett, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void set名稱(String 名稱){ //區域變數 
        //this.物件變數 = 區域變數
        this.名稱 = 名稱;  
        System.out.println("帳戶名稱:"+名稱);
    }
    public void set餘額(int 餘額){
        this.餘額 = 餘額;
        System.out.println("帳戶餘額:"+餘額);
    }
                
    
    
}
