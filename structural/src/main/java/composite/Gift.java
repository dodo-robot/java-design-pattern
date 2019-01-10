package composite;

public class Gift implements SurpriseBox{

	private String giftName;
	
	public Gift(String name) {
		this.giftName = name;
	}
	
	@Override
	public void unWrap() {
		System.out.println("unwrapping the gift "+ giftName);
		
	}

}
