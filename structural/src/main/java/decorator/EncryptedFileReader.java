package decorator;

public class EncryptedFileReader extends ReadDecorator{

	public EncryptedFileReader(Reader reader) {
		super(reader);
	}

	@Override
	public void read() {
		System.out.println("decrypting the file");
		this.reader.read(); 
	}

}
