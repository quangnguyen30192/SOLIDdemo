package dip.good;

public class Printer implements IWriter {
    @Override
    public void write(String inInput) {
        System.out.println("The text will be printed to paper: " + inInput);
    }
}
