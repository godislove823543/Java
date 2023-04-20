
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class 班級 {
    public String 名稱;
    private ArrayList<學生> 學生們;
    
    //建構子
    //static 想在類別上定義一個方法 來執行某些操作
    public 班級(){
        //新建一個ArrayList
        this.學生們=new ArrayList();
        //System.out.println("班級 建構完成");
    }
    //void 沒有返回值 只是將一些數據寫入檔案或從檔案中讀取數據
    public void 加入學生(學生 x){
        this.學生們.add(x);
        System.out.println("加入學生" + x.name);
    }
    public void 顯示資料(){
         System.out.println("-------我們是" + this.名稱 + "------------");
         for (學生 x :學生們){
             x.show();
         }
    }
    public 學生 find學生ById(int id){
        for(學生 x:學生們){
            if(x.id == id){
                return x;
            }
        }
        return null; //找不到學生 回傳空值
    }
    
}
