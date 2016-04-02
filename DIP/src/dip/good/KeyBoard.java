package dip.good;

public class KeyBoard implements IReader {
    @Override
    public String read() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("Input a string: ");
        return in.nextLine();
    }
}
