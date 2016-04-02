package dip.bad2;

import java.util.Scanner;

public class KeyBoard implements IReader {
    public String read() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        return in.nextLine();
    }
}
