/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.Scanner;

public class 成績02 {
    //public 全域變數
    //private 私有的 不開放給其他類別使用
    //System.in 代表鍵盤輸入
    //new 建立物件

    private static Scanner sc = new Scanner(System.in,"big5");
    public static boolean x;
    //int 整數方法，返回值，若沒有返回值寫void
    //英文成績() 方法名稱
    public static String 輸入姓名() {
        System.out.println("請輸入姓名:");
        String e; //區域變數,限於功能內部使用
        e = sc.next(); //輸入字串
        return e; //x返回到int
    }

    //傳入訊息 為參數,用來接收對方傳遞過來的值
    public static int 數學成績() {
        System.out.println("數學:");
        int m;
        m = sc.nextInt(); //輸入整數
        return m;

    }
    
    public static int 英文成績(){
        System.out.println("英文");
        int e;
        e = sc.nextInt();
        return e;
    }
    
    
   //我要設定這個算式
    public static int 加總(int 英文,int 數學) {
         
        int t;
        t = 英文+數學;
        System.out.println("加總:");
        System.out.println(t);
        return t;
        
        
        
    }

    public static int 平均(int 英文,int 數學) {
        
        int a;
        a = 英文+數學/2;
        System.out.println("平均:");
        System.out.println(a);
        
        return a;
        
        
    }

        public static boolean 評量(int a){
        
       
        System.out.println("評量結果:");
        
        if  (a>=60){
            x = true;
            System.out.println("成功");
          } else{
           System.out.println("失敗");
        }
            
           
        
         return x;
        }
  
        
        
        
        
    /*public static double 平均(int 輸入成績,int 輸入成績2){
         System.out.println("平均:");
        int x;
        x = 輸入成績+ 輸入成績2/2;
        return x;
   }
     */
        
        public static void 成績02(){
            輸入姓名();
            
            int m = 成績02.數學成績();
            int e = 成績02.英文成績();
            int t = 成績02.加總(m,e);
            int a = 成績02.平均(m,e);
           
            
            評量(a);
            
            
            
          

}
}
