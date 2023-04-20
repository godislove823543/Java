/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class 班級test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        學生 x1,x2;
                班級 c;
                
                x1 = new 學生();
                x1.id = 1;
                x1.name = "jamie";
                x1.eng = 99;
                x1.math = 89;
                
                x2 = new 學生();
                x2.id = 2;
                x2.name= "chuchu";
                x2.eng = 87;
                x2.math=78;
                
                c = new 班級();
                c.名稱 = "甲班";
                c.加入學生(x1);
                c.加入學生(x2);
                c.顯示資料();
                
                //測試 找學生
                學生 x;
                x = c.find學生ById(3);
                
                if (x==null){
                    System.out.println("搞消失");
                } else{
                    System.out.println("找到" + x.name);
                }
                
                
                
    }
    
}
