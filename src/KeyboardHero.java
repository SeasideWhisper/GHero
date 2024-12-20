
import java.awt.Color;
import java.awt.Font;

/**
 * ***************************************************************************
 * Compilation: javac GuitarHeroLite.java Execution: java GuitarHeroLite
 * Dependencies: StdAudio.java StdDraw.java GuitarString.java
 *
 * Plays two guitar strings (concert A and concert C) when the user types the
 * lowercase letters 'a' and 'c', respectively in the standard drawing window.
 *
 ***************************************************************************
 */
public class KeyboardHero {

    private static char[] notes = {'w', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'q', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', '8', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'u', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'w', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'q', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', '8', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'u', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'w', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'q', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', '8', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'u', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'w', 'n', '7', 'y', 't', 'r', 'w', 'r', 't', 'q', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', '8', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'u', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', '[', 'o', '[', 'z', 'x', '[', 'o', '[', 'z', '[', 'z', 'x', 'd', 'g', 'd', 'n', 'd', 'n', 'g', '[', 'o', '[', 'o', '[', '-', 'o', 'i', 'v', 'n', 'z', 'o', '-', 'd', '[', 'z', 'o', '8', 'o', '[', 'g', 'o', '8', 'o', 'z', '8', '[', 't', '8', 't', '-', 'u', 'i', 'u', 'o', '-', 'o', 'u', '[', '-', '[', '-', 'z', 'o', 'u', 'x', 'o', '-', 'x', 'd', 'g', 'd', 'x', 'z', '[', 'o', '-', '[', 'z', 'd', 'g', 'b', 'x', 'z', '[', 'z', 'w', '4', 'r', 'o', 'i', '7', 't', '7', 'i', '7', 'o', 'd', 'x', 'z', '=', '[', '-', 'p', 'o', 'y', 'u', 'o', 'u', '[', '-', '[', '-', 'z', 'o', 'u', 'x', 'o', '-', 'x', 'd', 'g', 'd', 'x', 'z', '[', 'o', '-', '[', 'z', 'd', 'g', 'b', 'x', 'z', '[', 'z', 'w', '4', 'r', 'o', 'i', '7', 't', '7', 'i', '7', 'o', 'd', 'x', 'z', '=', '[', '-', 'p', 'o', 'y', 'u', 'u', 'r', '4', 'w', 'r', 'u', 'r', '4', 'w', 'w', 'u', 'w', 'u', '7', 'u', 'y', 'u', 't', 'u', 'r', 'r', 'w', 'r', 't', 'r', 'q', '4', 'q', 'w', '4', '7', '4', 'y', 'w', 't', 'w', 'r', 'w', 'w', 'r', 't', 'w', '8', 'r', '8', 'w', 'r', '7', 'r', 'y', 'r', 't', 'r', 'r', 'r', 'w', 'r', 't', 'r', '8', 'r', '8', 'w', 'r', '7', 'r', 'y', 'r', 't', 'r', 'r', 'r', 'w', 'r', 't', 'r', 'w', 'u', 'w', 'u', '7', 'u', 'y', 'u', 't', 'u', 'r', 'r', 'w', 'r', 't', 'r', 'q', '4', 'q', 'w', '4', '7', '4', 'y', 'w', 't', 'w', 'r', 'w', 'w', 'r', 't', 'w', 'w', 'w', '7', 'y', 't', 'r', 'w', 'r', 't', 'w', 'w', '7', 'y', 't', 'r', 'w', 'r', 't', 'r', 'u', 'r', 'u', 'r', 'u', 'r', 'u', 'r', 'u', 'r', 't', 'q', 't', 'q', 't', 'q', 't', 'q', 't', 'q', 't', 'q', 't', '7', 'w', '7', 'w', '7', 'w', '7', 'w', 'y', '2', 'y', '2', 'y', 't', 'q', 't', 'q', 't', 'q', 't', 'q', '5', '8', '5', '8', '5', 'r', 'u', 'r', 'u', 'r', 'u', 'r', 'u', 'r', 'u', 'r', 'u', 'r', 't', 'q', 't', 'q', 't', 'q', 't', 'q', 't', 'q', 't', 'q', 't', '7', 'w', '7', 'w', '7', 'w', '7', 'w', '7', 'w', '7', 'w', 'w', '7', 'w', '7', 'w', '7', 'w', '7', 'w', '7', 'w', '7', 'w', '7', 'r', 'u', 'r', 'u', 'r', 'u', 'r', 'u', 'r', 'u', 'r', 'u', 'r', 't', 'q', 't', 'q', 't', 'q', 't', 'q', 't', 'q', 't', 'q', 't', '7', 'w', '7', 'w', '7', 'w', '7', 'w', 'y', '2', 'y', '2', 'y', 't', 'q', 't', 'q', 't', 'q', 't', 'q', '5', '8', '5', '8', '5', 'r', 'u', 'r', 'u', 'r', 'u', 'r', 'u', 'r', 'u', 'r', 'u', 'r', 't', 'q', 't', 'q', 't', 'q', 't', 'q', 't', 'q', 't', 'q', 't', 'w', 'w', 'w', 'w', '7', 'w', 'w', 'y', 't', 'w', 'r', 'w', 'r', 't', 'w', 'w', 'w', 'w', 'w', '7', 'w', 'w', 'y', 't', 'w', 'r', 'w', 'r', 't', 'w', 'u', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'q', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'w', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'w', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'u', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'q', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'w', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'q', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', '8', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'u', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'w', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'q', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', '8', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'u', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'w', 'n', '7', 'y', 't', 'r', 'w', 'r', 't', 'q', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', '8', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'u', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', '[', 'o', '[', 'z', 'x', '[', 'o', '[', 'z', '[', 'z', 'x', 'd', 'g', 'd', 'n', 'd', 'n', 'g', '[', 'o', '[', 'o', '[', '-', 'o', 'i', 'v', 'n', 'z', 'o', '-', 'd', '[', 'z', 'o', '8', 'o', '[', 'g', 'o', '8', 'o', 'z', '8', '[', 't', '8', 't', '-', 'u', 'i', 'u', 'o', '-', 'o', 'u', '[', '-', '[', '-', 'z', 'o', 'u', 'x', 'o', '-', 'x', 'd', 'g', 'd', 'x', 'z', '[', 'o', '-', '[', 'z', 'd', 'g', 'b', 'x', 'z', '[', 'z', 'w', '4', 'r', 'o', 'i', '7', 't', '7', 'i', '7', 'o', 'd', 'x', 'z', '=', '[', '-', 'p', 'o', 'y', 'u', 'u', 'r', '4', 'w', 'r', 'u', 'r', '4', 'w', 'w', 'u', 'w', 'u', '7', 'u', 'y', 'u', 't', 'u', 'r', 'r', 'w', 'r', 't', 'r', 'q', '4', 'q', 'w', '4', '7', '4', 'y', 'w', 't', 'w', 'r', 'w', 'w', 'r', 't', 'w', '8', 'r', '8', 'w', 'r', '7', 'r', 'y', 'r', 't', 'r', 'r', 'r', 'w', 'r', 't', 'r', '8', 'r', '8', 'w', 'r', '7', 'r', 'y', 'r', 't', 'r', 'r', 'r', 'w', 'r', 't', 'r', 'w', 'u', 'w', 'u', '7', 'u', 'y', 'u', 't', 'u', 'r', 'r', 'w', 'r', 't', 'r', 'q', '4', 'q', 'w', '4', '7', '4', 'y', 'w', 't', 'w', 'r', 'w', 'w', 'r', 't', 'w', 'w', 'w', '7', 'y', 't', 'r', 'w', 'r', 't', 'w', 'w', '7', 'y', 't', 'r', 'w', 'r', 't', 'r', 'u', 'r', 'u', 'r', 'u', 'r', 'u', 'r', 'u', 'r', 't', 'q', 't', 'q', 't', 'q', 't', 'q', 't', 'q', 't', 'q', 't', '7', 'w', '7', 'w', '7', 'w', '7', 'w', 'y', '2', 'y', '2', 'y', 't', 'q', 't', 'q', 't', 'q', 't', 'q', '5', '8', '5', '8', '5', 'r', 'u', 'r', 'u', 'r', 'u', 'r', 'u', 'r', 'u', 'r', 'u', 'r', 't', 'q', 't', 'q', 't', 'q', 't', 'q', 't', 'q', 't', 'q', 't', 'w', 'w', 'w', 'w', '7', 'w', 'w', 'y', 't', 'w', 'r', 'w', 'r', 't', 'w', 'w', 'w', 'w', 'w', '7', 'w', 'w', 'y', 't', 'w', 'r', 'w', 'r', 't', 'u', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'q', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'w', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'w', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'u', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'q', 'o', '7', 'y', 't', 'r', 'w', 'r', 't', 'o', 'n', 'd', 'x', 'z', '[', 'o', '[', 'z', 'i', '8', 'u'};
    private static Color[] bob = {Color.BLACK,
        Color.BLUE,
        Color.CYAN,
        Color.DARK_GRAY,
        Color.GRAY,
        Color.GREEN,
        Color.LIGHT_GRAY,
        Color.MAGENTA,
        Color.ORANGE,
        Color.PINK,
        Color.RED,
        Color.WHITE,
        Color.YELLOW};

    public static void main(String[] args) {
        System.out.println(getNote(1));
        // Create two guitar strings, for concert A and C

        GuitarString[] strings = new GuitarString[37];
        for (int x = 0; x < 37; x++) {
            strings[x] = new GuitarString(getNote(x + 1));
        }
        StdDraw.setCanvasSize(2900, 1000);
        StdDraw.setFont(new Font("SansSerif", 0, 500));
        
        final double TEXT_POS_X = .5;
        final double TEXT_POS_Y = .5;
        renderNote();
        play(strings);

    }
    static String bigString = "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' ";

    public static double getNote(int i) {
        return 440 * Math.pow(1.05956, i - 25);
    }

    public static void renderNote() {
        int num = (int) (Math.random()*13);
        StdDraw.clear(bob[num]);
        int num2 = (int) (Math.random()*13);
        if(num2 == num)
        {
        	while (true)
        	{
        		num2 = (int) (Math.random()*13);
        		 if(num2 != num)
        		 {
        			 break;
        		 }
        	}
        }
        int[] arr = new int[11];
        for( int i = 0; i < 11; i++)
        {
        		arr[i] = (int) (Math.random()*13);
        		if( i >= 0)
        		{
	        		for(int x = i; x < 11; x++)
	        		{
	        			if(arr[i] == arr[x])
	        			{
	        				arr[i] = (int) (Math.random()*13);
	        			}
	        			if(arr[i] == num)
	        			{
	        				arr[i] = (int) (Math.random()*13);
	        			}
	        		}
        		}
   
        }
        //StdDraw.setPenColor(bob[num2]);
        StdDraw.setFont(new Font("SansSerif", 0, 100));
        StdDraw.setPenColor(bob[arr[0]]);
        StdDraw.text(.3, .85, "M");
        StdDraw.setPenColor(bob[arr[1]]);
        StdDraw.text(.34, .85, "E");
        StdDraw.setPenColor(bob[arr[2]]);
        StdDraw.text(.38, .85, "G");
        StdDraw.setPenColor(bob[arr[3]]);
        StdDraw.text(.42, .85, "A");
        StdDraw.setPenColor(bob[arr[4]]);
        StdDraw.text(.46, .85, "L");
        StdDraw.setPenColor(bob[arr[5]]);
        StdDraw.text(.50, .85, "O");
        StdDraw.setPenColor(bob[arr[6]]);
        StdDraw.text(.54, .85, "V");
        StdDraw.setPenColor(bob[arr[7]]);
        StdDraw.text(.58, .85, "A");
        StdDraw.setPenColor(bob[arr[8]]);
        StdDraw.text(.62, .85, "N");
        StdDraw.setPenColor(bob[arr[9]]);
        StdDraw.text(.66, .85, "I");
        StdDraw.setPenColor(bob[arr[10]]);
        StdDraw.text(.70, .85, "A");
        StdDraw.setFont(new Font("SansSerif", 0, 500));
        StdDraw.setPenColor(bob[num2]);
        StdDraw.text(.5, .5, notes[0] + "");
    }

    public static boolean checkNote(char note, GuitarString[] strings) {
        if (note == notes[0]) {
            int noteNum = bigString.indexOf(note);
            if (noteNum != -1) {
                strings[noteNum].pluck();
            }

            int n = notes.length - 1;
            char[] tempArray = new char[n];
            System.arraycopy(notes, 1, tempArray, 0, n);

            notes = tempArray.clone();
            renderNote();
            return true;
        }

        return false;
    }

    private static void play(GuitarString[] strings) {        // the main input loop
        while (true) {

            // check if the user has typed a key, and, if so, process it
            if (StdDraw.hasNextKeyTyped()) {

                // the user types this character
                char key = StdDraw.nextKeyTyped();
                if(key == ' ')
                {StdDraw.setFont(new Font("SansSerif", 0, 50));
                    for(int x = 0; x < 5000; x++){
                        StdDraw.text(Math.random(),Math.random(), "FEIN!!");

                    }
                    StdDraw.text(.50, .15, "FEIN!!");

                }
                // pluck the corresponding string
                checkNote(key, strings);
            }

            // compute the superposition of the samples
            double sample = 0.0;
            for (int x = 0; x < strings.length; x++) {
                sample += strings[x].sample();
            }

            // send the result to standard audio
            StdAudio.play(sample);
            for (int x = 0; x < strings.length; x++) {
                strings[x].tic();
            }
        }

    }

}
