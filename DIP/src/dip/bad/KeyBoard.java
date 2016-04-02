package dip.bad;

import java.util.Scanner;

public class KeyBoard {
    public String read() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        return in.nextLine();
    }
}
