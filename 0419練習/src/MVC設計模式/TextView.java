/*
MVC設計模式是一種軟體架構模式，分成:model(模型)、view(視圖)、controller(控制器)
 */
package MVC設計模式;

/*
View類代表應用程式的界面，其中有一個CharSequence方法，
用於顯示模型中的數據。
 */
public class TextView {
    //設一個CharSequence類型 的變數
    private CharSequence text;
    
    //getter 沒有void 因為有回傳值
    //getter 通常是在Java中的類別中定義的，可以被用來取得該類別中的某個變數或屬性的值
    public CharSequence getText(){
        return text;
    }
    
    //setter()裡面的參數:類別 名稱
    //在類別中定義 用來設置物件的值 或 屬性
    public void setText(CharSequence text){
        this.text = text;
        this.show(); //在下面的private void show() {}
    }
    
    private void show(){
        System.out.println("-----TextView---------");
        System.out.println(this.text);
    }


    
    
    
}
