/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class 測試日期 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //建立物件 完成初值
        //連動到日期3個參數
        日期 d1 = new 日期(2023, 1, 1);
        日期 d2 = new 日期(2023, 2, 2);

        //測試 字串方法 toString()
        System.out.println(d1.toString());
        System.out.println(d2.toString());

        //測試 getter 取值
        System.out.println("d2 年 = " + d2.getYear());
        System.out.println("d2 月 = " + d2.getMonth());
        System.out.println("d2 年 = " + d2.getDay());

    }

}
