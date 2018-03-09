package com.it.Iterator1;

public class NameRepository {
	
	public static void main(String[] args) {
		C1NameIterator c1NameIterator=new C1NameIterator();
		for(Iterator iter = c1NameIterator.getIterator();iter.hasNext();){
			String name=(String)iter.next();
			System.out.println("Name:"+name);
		}
		
	}
	
	
}
