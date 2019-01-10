package decorator;

public class FileReader implements Reader{
	
	private String filePath;
	
	public FileReader( String filePath){
		this.filePath = filePath;
	}	
	

	@Override
	public void read() {
		System.out.println("reading file from "+ this.filePath);
	}

}
