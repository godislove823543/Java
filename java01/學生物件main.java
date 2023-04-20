/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class 學生物件main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        學生物件 a;
        學生物件 b;
        
        a = new 學生物件();
        a.name = "Miranda";
        a.eng = 100;
        a.math = 89;
        a.show();
        
        b = new 學生物件();
        b.name = "kiki";
        b.eng = 78;
        b.math = 69;
        b.show();
    }
    
}
