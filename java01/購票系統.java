/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.Scanner;

public class 購票系統 {

    private static Scanner sc = new Scanner(System.in);

    //int 整數 方法返回值(結果) 若沒有返回值以void表示
    public static int 購票() {
        int t, 人數, 全票, 優待, 兒童, 早鳥, 愛心, 總金額;

        System.out.println("請輸入票種:");
        System.out.println("1.全票 2. 優待票 3. 兒童票 4.早鳥票 5. 愛心票");

        t = sc.nextInt();

        System.out.println("請輸入人數:");
        人數 = sc.nextInt();
        if (t == 1) {

            全票 = 310;
            總金額 = 全票 * 人數;
            System.out.println("總金額:" + 總金額);
        }
        if (t == 2) {
            優待 = 290;
            總金額 = 優待 * 人數;
            System.out.println("總金額:" + 總金額);
        }
        if (t == 3) {
            兒童 = 260;
            總金額 = 兒童 * 人數;
            System.out.println("總金額:" + 總金額);
        }
        if (t == 4) {
            早鳥 = 280;
            總金額 = 早鳥 * 人數;
            System.out.println("總金額:" + 總金額);
        }
        if (t == 5) {
            愛心 = 155;
            總金額 = 愛心 * 人數;
            System.out.println("總金額:" + 總金額);
        }

        return t;
    }
}
