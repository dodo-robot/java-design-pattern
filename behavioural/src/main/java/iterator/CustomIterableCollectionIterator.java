package iterator;

public class CustomIterableCollectionIterator implements Iterator{
	
	private CustomIterableCollection collection;
	private int collectionSize;
	private int currentIndex = -1;

	public CustomIterableCollectionIterator(CustomIterableCollection customIterableCollection) {
		this.collectionSize = customIterableCollection.getSize();
		this.collection = customIterableCollection;
		
	}

	@Override
	public String getNext() {
		currentIndex++;
		return collection.getStringAtIndex(currentIndex);
	}

	@Override
	public boolean hasMore() {
		return currentIndex +1 < collectionSize;
	}

 
}
