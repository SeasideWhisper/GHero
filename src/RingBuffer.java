import java.util.NoSuchElementException;

public class RingBuffer {
	
	private double[] buffer;
	private int first;
	private int last;
	public RingBuffer(int capacity) {
		buffer = new double[capacity];
		first = 0;
		last = 0;
	}
	
	public int size() {
		return last-first;
	}
	
	public boolean isEmpty() {
		return (size() > 0);
	}
	
	public boolean isFull() {
		return (size() >= buffer.length);
	}
	
	public void enqueue() {
		
	}
	
	public double dequeue() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		double toReturn = buffer[first];
		
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
