package dip.bad;

public class Copy {
	
	private KeyBoard keyBoard;
	private PaperPrinter printer;
	
	public void doWork() {
		keyBoard = new KeyBoard();
		printer = new PaperPrinter();
		printer.write(keyBoard.read());
	}
}
