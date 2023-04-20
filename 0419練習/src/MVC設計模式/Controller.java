/*
 Controller類別 協調模型和視圖之間的交互，包括一個setData方法，用於更新model中的數據，
以及一個updateView方法，用於更新view中顯示的數據。
 */
package MVC設計模式;

/**
 *
 * @author user
 */
public class Controller {
    private StudentModel model;
    private TextView view;
    
    public void create(){
        model = new StudentModel("joe",80,98);
        view = new TextView();
    }
    
    public void run(){
        String s;
        //從StudentModel裡取值
        s = model.getName() + "\n" + model.getEng()+"\n" + model.getMath();
        view.setText(s);//在TextView裡的setText方法
    }
    
    
}
