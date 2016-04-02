package dip.bad2;

public class Copy {
	
	private IReader reader;
	private IWriter writer;
	
	public void doWork() {
		writer.write(reader.read());
	}
}
