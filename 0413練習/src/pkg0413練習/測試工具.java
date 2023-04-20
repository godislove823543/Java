/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0413練習;

/**
 *
 * @author user
 */
public class 測試工具 {
    private static void 測試輸入(){
        //1 呼叫英文() 忽略 返回結果
        System.out.println("1");
        工具.英文();
        
        //2 呼叫英文() 接收 返回結果
        System.out.println("2");
        int 結果;
        結果 = 工具.英文();
        System.out.println(結果);
        
        //3 呼叫 生物() 傳值 接收結果
        System.out.println("3");
        結果 = 工具.生物("生物:");
        System.out.println(結果);
    }
   
        
        //測試加總
        private static void 測試平均加總(){
            System.out.println("4");
            int tot;
            int eng;
            int math;
            int avg;
            
            eng = 工具.英文();
            math = 工具.數學();
            tot = 工具.加總(eng,math);
            
            
            
            avg = tot/2;
            System.out.println("total:" + tot);
            System.out.println("average:" + avg);
        }
           
            
                 
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        測試輸入();
        測試平均加總();
        

        
    } 
            
            
        }
        
        
        
        
        
        
        
        
        

    

