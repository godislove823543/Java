/*
Model類代表應用程式的數據，包括一個data成員變數和相應的設置和獲取方法。
 */
package MVC設計模式;

/**
 *
 * @author user
 */
public class StudentModel {

    private String name;
    private int eng;
    private int math;

    //這段程式碼是一個建構子(Constructor)
    //。它是一個特殊的方法，名稱與類別相同，用於初始化新建立的物件。
    //在這個例子中，建構子的名稱為 "StudenModel"，接受三個參數(像是String物件)
    //並且將它們存儲在類別的成員變數中(this.name)。
    public StudentModel(String name, int eng, int math) {
        this.name = name;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name; //this class
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }
}
