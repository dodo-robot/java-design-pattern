package decorator;

public class Main {

	public static void main(String[] args) {
		Reader fileReader = new FileReader("path/to/file...");
		fileReader.read();
		 
		Reader compressedFileReader = new CompressedFileReader(fileReader);
		compressedFileReader.read(); 
		
		Reader encryptedFileReader = new EncryptedFileReader(fileReader);
		encryptedFileReader.read(); 
		
		
		Reader encryptedCompressedFileReader = 
				new EncryptedFileReader(
						new CompressedFileReader(
								new FileReader("path/to/encrypted/compressed/file...")));
		
		encryptedCompressedFileReader.read();
	
	}

}
