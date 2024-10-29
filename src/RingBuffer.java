import java.util.NoSuchElementException;

public class RingBuffer {
	
	private double[] buffer;
	private int first;
	private int last;
	public RingBuffer(int capacity) {
		buffer = new double[capacity];
		first = 0;
		last = -1;
	}
	
	public int size() {
		int toReturn = last-first;
		if (toReturn == 0) {
			toReturn = buffer.length;
		} else if(toReturn < 0) {
			toReturn = buffer.length + toReturn;
		}
		return toReturn;
	}
	
	public boolean isEmpty() {
		if (last == -1) {
			return true;
		}
		return (!(size() > 0));
	}
	
	public boolean isFull() {
		if (last == -1) {
			return false;
		}
		return (size() >= buffer.length);
	}
	
	public void enqueue() {
		
	}
	
	public double dequeue() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		double toReturn = buffer[first];
		first++;
		if (first > 0){
			first = 0;
		}
		return toReturn;
	}
	
	public double peek() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		return buffer[first];
	}
	
	public String toString() {
		return null;
	}
}
