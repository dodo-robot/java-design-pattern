package iterator;

import java.util.ArrayList;
import java.util.List;

public class CustomIterableCollection implements IterableCollection{

	private List<String> internalList = new ArrayList<String>();
	
	public CustomIterableCollection() {
		internalList.add("We");
		internalList.add("Love");
		internalList.add("Pandas");
		
	}
	@Override
	public Iterator createIterator() {
		return new CustomIterableCollectionIterator(this);
	}
	
	
	public int getSize() {
		return internalList.size();
	}
	
	public String getStringAtIndex(int i) {
		return internalList.get(i);
	}

}
