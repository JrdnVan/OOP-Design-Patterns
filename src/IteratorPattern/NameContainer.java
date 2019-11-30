package IteratorPattern;
public class NameContainer implements Container{
	private String names[] = {"A", "B", "C", "D"};
	
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new NameIterator();
	} 
	
	private class NameIterator implements Iterator{
		private int index;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return index < names.length ? true : false;
		}
		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return this.hasNext() ? names[index++] : null;
		}
		
	}
}