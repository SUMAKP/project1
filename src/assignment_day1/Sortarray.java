package assignment_day1;

import java.util.Arrays;

public class Sortarray {
	public static void main(String[] args) {
		
	
	int ar1[]= {1,2,3};
	int ar2[]= {4,5,6};
	int merge[]=mergeArrays(ar1,ar2);
	for(int i=0;i<merge.length;i++)
	{
		System.out.println(merge[i]);
	}
	}
}

	/*
	 * Arrays.sort(ar); System.out.println(Arrays.toString(ar));
	 */
	
	

	/*}

	private static int[] mergeArrays(int[] ar1, int[] ar2) {
		// TODO Auto-generated method stub
		return null;
	}
*/

