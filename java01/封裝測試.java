/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class 封裝測試 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //宣告 物件變數
        封裝 d;
        //建立物件(儲存格)
        //用set年()方法來訪問和更新變量
        d = new 封裝();
        d.set年(113);
        d.set月(13);
        d.set日(31);
        //d.年= 113; 因為是private 所以不能從外部呼叫他
        d.顯示資料();
        
        d.set月(11);
        d.顯示資料();
        
    }
    
}
