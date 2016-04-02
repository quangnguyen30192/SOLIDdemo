package dip.good;

public class Main {
    public static void main(String[] args) {
        IReader reader = new KeyBoard();
        IWriter writer = new Database();
        Copy copy = new Copy(reader, writer);
        copy.doWork();
    }
}