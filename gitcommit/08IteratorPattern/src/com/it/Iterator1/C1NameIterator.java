package com.it.Iterator1;

public class C1NameIterator implements Container {

	public String names[] ={"Tom","Rose","Jerry","Lose"};
	
	@Override
	public Iterator getIterator() {
		
		return new NameIterator();
	}
	private class NameIterator implements Iterator{
		
		int index;
		
		@Override
		public boolean hasNext() {

			if(index<names.length){
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()){
				return names[index++];				
			}
			return null;
		}
		
		
	}
	
	
}
