//Create a Main class
public class 建構子 {

    int x; //Create a class attribute(屬性)

    //Create a class constructor(建構子) for the Main class
    public 建構子() {
        x = 3; //Set the initial value(初始值) for the class attribute x
    }

   
    public static void main(String[] args) {
        // Create an obj    of class Main(This will call the constructor)
        建構子 myObj = new 建構子();
        System.out.println(myObj.x);
        
    }

}
