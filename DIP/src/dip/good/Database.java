package dip.good;

public class Database implements IWriter {
    @Override
    public void write(String inInput) {
        System.out.println("The data will be updated to database: " + inInput);
    }
}