package decorator;

public class CompressedFileReader extends ReadDecorator{

	public CompressedFileReader(Reader reader) {
		super(reader);
	}

	@Override
	public void read() {
		System.out.println("decrompessed the file");
		this.reader.read();  
	}

}
