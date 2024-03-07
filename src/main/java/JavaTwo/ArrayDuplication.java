package JavaTwo;

public class ArrayDuplication {

	public static void main(String[] args) {
         int[] arr = {12,11,14,15,15,13,16,17,16,18,17,18,19,12};
         
         // F8 -> to hop at each break point
         for (int i = 0; i < arr.length; i++) {
        	 for (int j = i+1; j < arr.length; j++) {
        		 if(arr[i]==arr[j]) {
        			 System.out.println("Duplicate Array:"+arr[i]);
        		 }
				
        	 }		
		}
	}
}
