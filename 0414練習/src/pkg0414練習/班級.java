
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
import java.util.ArrayList;
public class 班級 {
    public String 名稱;
    private ArrayList<學生> 學生們;
    
    //建構子 沒有static 沒有void 用class(類別)方法
    public 班級(){
        this.學生們 = new ArrayList();
        System.out.println("班級建構 完成");
    }
    //物件方法 沒有static
    public void 加入學生(學生 x){ //學生檔案 x ---參數
        this.學生們.add(x);
        System.out.println("加入學生" + x.name);
         } 
    
    public void 顯示資料(){
        System.out.println("顯示"+this.名稱+"資料");
        for (學生 x:學生們){x.show();}
            
    }
   //findById 方法会立即（EAGER）访问数据库，并返回和指定 ID 关联的实体对象 
 public 學生 find學生ById(String name)  {
     for(學生 x :學生們){
         if(x.name == name) {return x;} //如果class學生 的id = 參數id
     }
     return null; //找不到學生 回傳空值
     
 }
        

    
}
