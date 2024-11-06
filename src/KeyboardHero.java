import java.util.HashMap;
import java.util.Map;

/*****************************************************************************
 *  Compilation:  javac GuitarHeroLite.java
 *  Execution:    java  GuitarHeroLite
 *  Dependencies: StdAudio.java StdDraw.java GuitarString.java
 *
 *  Plays two guitar strings (concert A and concert C) when the user
 *  types the lowercase letters 'a' and 'c', respectively in the 
 *  standard drawing window.
 *
 ****************************************************************************/

public class KeyboardHero {
	
	private char[] notes = new char[];
	
    public static void main(String[] args) {
    	 System.out.println(getNote(1));
        // Create two guitar strings, for concert A and C
    	 
    	 GuitarString[] strings = new GuitarString[37];
    	    for (int x = 0; x<37; x++) {
    	    	strings[x] = new GuitarString(getNote(x+1));
    	   }
        
        
        final double TEXT_POS_X = .5;
        final double TEXT_POS_Y = .5;
        
        play(strings);
       
    }
    
    public static double getNote(int i) {
    	return 440* Math.pow(1.05956, i-25);
    }
    
    public static void renderNote() {
    	 StdDraw.text(.5, .5, );
    }
    
    public static boolean checkNote(char note) {
    	
    }
    
    private static void play(GuitarString[] strings) {        // the main input loop
    	String bigString = "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' ";
    	while (true) {
            
            // check if the user has typed a key, and, if so, process it
            if (StdDraw.hasNextKeyTyped()) {
 
                // the user types this character
                char key = StdDraw.nextKeyTyped();

                // pluck the corresponding string
                int noteNum = bigString.indexOf(key);
                if (noteNum != -1) 
                	strings[noteNum].pluck();
            }

            // compute the superposition of the samples
            double sample = 0.0;
            for (int x = 0; x< strings.length; x++) {
            	sample += strings[x].sample();
            }

            // send the result to standard audio
            StdAudio.play(sample);
            for (int x = 0; x< strings.length; x++) {
            	strings[x].tic();
            }
        }
        
    }

}
