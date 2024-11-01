
public class GuitarString {

    public RingBuffer buffer;
    private int capacity;
    private int time;
    public GuitarString(double frequency) {
    	capacity = (int) (44100 / frequency);
        buffer = new RingBuffer(capacity);
        for (int x = 0; x< capacity; x++) {
        	buffer.enqueue(0.0);
        }
        time = 0;
    }

    public GuitarString(double[] init) {
    	capacity = init.length;
        buffer = new RingBuffer(capacity);
        for (int x = 0; x< capacity; x++) {
        	buffer.enqueue(init[x]);
        }
        time = 0;
    }

    public void pluck() {
    	for (int x = 0; x< capacity; x++) {
        	buffer.dequeue();
        }
    	for (int x = 0; x< capacity; x++) {
        	buffer.enqueue(Math.random() - .5);
        }
    }

    void tic() {
    	double daDub = 0.994 * 0.5 * (buffer.dequeue() + buffer.peek());
    	buffer.enqueue(daDub);
    	time++;
    }

    double sample() {
    	return buffer.peek();
    }

    int time() {
    	return time;
    }
}
