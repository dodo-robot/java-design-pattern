package composite;

public class Main {

	public static void main(String[] args) {
		GiftSurpriseBox surpriseBox = new GiftSurpriseBox();
		GiftSurpriseBox subSurpriseBox = new GiftSurpriseBox();
		
		Gift gift1 = new Gift("toy plane");
		surpriseBox.add(gift1);
		
		Gift gift2 = new Gift("toy car");
		subSurpriseBox.add(gift2);
		surpriseBox.add(subSurpriseBox);
		
		surpriseBox.unWrap();

	}

}
