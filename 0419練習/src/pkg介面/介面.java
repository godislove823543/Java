package pkg介面;

/*CharSequence是一個介面(interface)，它表示一個字符序列的讀取操作，而這個字符序列可以是字符串（String）或其他的字元序列（如字符緩衝區、字符陣列等）。CharSequence定義了多個方法，如length()、charAt()、subSequence()等，這些方法可以用來對字符序列進行各種操作。

CharSequence可以用作方法的參數或返回值，這樣可以讓方法支持不同種類的字符序列。例如，在Java中，String類實現了CharSequence介面，因此可以使用String對象或其他實現CharSequence介面的對象作為方法的參數或返回值。

使用CharSequence可以提高代碼的靈活性和可讀性，因為它使得代碼能夠處理不同類型的字符序列，而不必關心具體的實現類型。

package pkg0420;

/**
 *
 * @author user
 */
public class 介面 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String
       String s = "Bambi";
       //StringBuilder
       StringBuilder sb = new StringBuilder();
       sb.append("Temmy");
       
       //CharSequence 字串介面 定義字串(string)有哪些功能
       CharSequence cs;
       cs = s;
       System.out.println("字數" + cs.length());
       System.out.println("產生不可變字串" + cs.toString());
       System.out.println("位置文字" + cs.charAt(3)); //charAt() 檢索 特定索引位置的字符 的方法
       
       cs = sb;
       System.out.println("字數" + cs.length());
       System.out.println("產生不可變字串" + cs.toString());
       System.out.println("位置文字" + cs.charAt(3));
       
       
       
               
    }
    
}
