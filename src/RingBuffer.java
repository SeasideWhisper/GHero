
import java.util.Arrays;
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
		if (last == -1) {
			return 0;
		}
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
	
	public void enqueue(Double dub) {
		if (isFull()) {
			throw new IllegalStateException();
		}
		if (last == -1) {
			last = first;
		}
		if (last >= buffer.length){
			last = 0;
		}
		buffer[last] = dub;
		last++;
		if (last >= buffer.length){
			last = 0;
		
		}
	}
	
	public double dequeue() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		double toReturn = buffer[first];
		first++;
		if (first >= buffer.length){
			first = 0;
		}
		if (first == last) {
			last = -1;
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
		Double[] toReturn = new Double[size()];
        for (int i = 0; i < size(); i++) {
            toReturn[i] = buffer[(first + i) % buffer.length];
        }
        return Arrays.toString(toReturn);
	}
}
