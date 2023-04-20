/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class 靜態陣列 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] cars = {"Volvo","BMW","TESLA","BENZ"};
        cars[0] = "BENTLEY";
        System.out.println(cars[0]);
        //算出數組長度
        System.out.println(cars.length);
    
    }
    
}
