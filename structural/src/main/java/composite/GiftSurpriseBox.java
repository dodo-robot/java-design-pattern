package composite;

import java.util.ArrayList;
import java.util.List;

public class GiftSurpriseBox implements SurpriseBox{

	private List<SurpriseBox> surpriseBoxes;

	public GiftSurpriseBox(){
		this.surpriseBoxes=new ArrayList<SurpriseBox>();
	}

	@Override
	public void unWrap() {
		surpriseBoxes.forEach(SurpriseBox::unWrap); 
	}
	
	public void add(SurpriseBox box){
		this.surpriseBoxes.add(box);
	}
	
	public void remove(SurpriseBox box){
		this.surpriseBoxes.remove(box);
	}



}
