/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class 測試帳戶1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //建構子 初值設定
        帳戶1 p1 = new 帳戶1("Scatlett有",120000);
        帳戶1 p2 = new 帳戶1("kiki有",65333);
        
        //測試 字串方法 toString()
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        
        //測試get取值
        System.out.println("p1 帳戶=" + p1.get名稱() + p1.get餘額());
        System.out.println("p2 帳戶=" + p2.get名稱() + p2.get餘額());
    }
    
}
