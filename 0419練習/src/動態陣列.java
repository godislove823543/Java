import java.util.ArrayList;


public class 動態陣列 {

    //Arraylist 可調整大小
    public static void main(String[] args) {
        ArrayList<String>  lesson = new ArrayList<String>();
        lesson.add("老孟");
        lesson .add("健身");
        lesson .add("蕾蕾");
        lesson .add("班長");
        //lesson.set(2, "希希");
        //lesson.get(0);
     
    
       //System.out.println(lesson);
       //System.out.println(lesson.get(0));
       
       //for -each 循環 往下排列
       for(String i:lesson){
           System.out.println(i);
       }
        
        
        
        
    }
    
}
