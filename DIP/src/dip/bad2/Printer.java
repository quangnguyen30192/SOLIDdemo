package dip.bad2;

public class Printer implements IWriter {
    public void write(String inInput) {
        System.out.println("The text will be printed to paper: " + inInput);
    }
}
