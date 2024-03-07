package JavaTwo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {

//		int[] value = new int[3];
//		
//		 value[0] = 10;
//		 value[1] = 20;
//		 value[2] = 30;
		
		 int[] values = {40,20,30};
		 
		 System.out.println(values.length);
		 Arrays.sort(values);
		 
		for (int i = 0; i < values.length; i++) {
			System.out.println("Ascending :" +values[i]);
		}
		System.out.println("Second Largest:" +values[values.length-2]);
		 
	}

}
