package calculator;

import java.io.BufferedInputStream;
import java.util.Scanner;

//calculator implimantation class
class calc {

    public calc() {
    }

    public void myCalc(String in) {
        int ans = 0;
        if (in.equals(" ")) {
            ans = 0;
            
        } else if (in.contains("-")) {
            ans = -1;
            System.out.println("Error. Only positive input is valid.");

        } else if (!in.contains(",")) {
            ans = Integer.parseInt(in);
            
        } else if (in.contains(",")) {
            String[] arr = in.split(",");
            for (String ss : arr) {
                int a = Integer.parseInt(ss);
                ans += a;
            }
        }
        if (ans != -1) {
            System.out.println("Addition is:-" + ans);
        }
    }

}

public class Calculator {

    public static void main(String[] args) {
        calc c = new calc();
        Scanner sn = new Scanner(new BufferedInputStream(System.in));
        System.out.println("Enter input string:");
        String in = sn.nextLine();
        c.myCalc(in);

    }

}
