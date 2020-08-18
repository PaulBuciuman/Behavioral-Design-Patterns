package iterator;

import java.util.Iterator;

public class BikeRepository implements Iterable<String>{

	
	private String[] bikes;
	private int index;
	
	public BikeRepository() {
		
		bikes = new String[10];
		index =0;
	}
	
	public void addBike(String bike) {
		if(index == bikes.length) {
			String[] largerBikes = new String[bikes.length+5];
			System.arraycopy(bikes, 0, largerBikes, 0, bikes.length);
			bikes = largerBikes;
			largerBikes= null;
		}
		
		bikes[index] = bike;
		index++;
	}

	public Iterator<String> iterator() {
		Iterator<String> it = new Iterator() {

			
			private int currentIndex = 0;
			
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return currentIndex<bikes.length && bikes[currentIndex]!=null;
			}

			public String next() {
				// TODO Auto-generated method stub
				return bikes[currentIndex++];
			}
			
			public void remove() {
				throw new UnsupportedOperationException();
				
			}
			
		};
		return null;
		
	}
}
