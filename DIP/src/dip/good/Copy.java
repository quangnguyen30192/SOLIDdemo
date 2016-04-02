package dip.good;

public class Copy {
	private IReader mReader;
	private IWriter mWriter;

	public Copy(IReader inReader, IWriter inWriter) {
		if (inReader == null || inWriter == null) {
			throw new NullPointerException();
		}
		mReader = inReader;
		mWriter = inWriter;
		
		// Dependency Injection
	}

	public void doWork() {
		mWriter.write(mReader.read());
	}
}
