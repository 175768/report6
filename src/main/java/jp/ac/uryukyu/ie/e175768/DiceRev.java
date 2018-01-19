package jp.ac.uryukyu.ie.e175768;
import java.util.Scanner;

public class DiceRev {
    public void SetDice() {
        int eye;
        int n = 0;
        int m = 1;
        double num = 0.83;
        double num1;
        double num2;
        System.out.println("ダイスダイスレボリューション！！！");
        System.out.println("1を出さずにサイコロを回し続けろ！！");
        System.out.println("1回目");
        num2 = num*100;
        System.out.println("次に1以外が出る確率"+Math.round(num2)+"%");
        System.out.println("サイコロを回しますか？ yes or no");
        Scanner sc = new Scanner(System.in);
        String anser = sc.next();
        if (anser.equals("yes")) {
            for ( ; ; ) {
                int ran = (int) (Math.random() * 6);
                eye = ran + 1;
                System.out.println(eye+"  出た目は"+eye+"です");
                n++;
                m++;

                if (eye == 1) {
                    break;
                }

                num1 =Math.pow(num,m)*100;
                System.out.println("\n"+m+"回目");
                System.out.println("次に1以外が出る確率"+Math.round(num1)+"%");
                System.out.println("続けてサイコロを回しますか？ yes or no");
                String anser1 = sc.next();

                if (anser1.equals("yes")){}
                else{break;}

            }
            System.out.println("\n今回の記録は"+n+"回でした");
        } else {
            System.out.println("終了します");
        }
    }
}
