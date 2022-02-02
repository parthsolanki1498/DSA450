package cracker.dsa450.array;

import java.util.Arrays;

public class MinimizeHeight {
	
	public static void main(String[] args) {
		
		//int array[] = {1,5,8,10};
		int array[] = {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
		//int array[] = {3,9,12,16,20};
		int k = 5;
		Arrays.sort(array);
		minimizeHeight(array,k);
		
		
	}

	private static void minimizeHeight(int[] array, int k) {
		// TODO Auto-generated method stub
		for(int i = 0; i < array.length; i++) {
			if(array[i] < k) {
				array[i] = array[i] + k;
			} else {
				array[i] = array[i] - k;
			}
		}
		//Arrays.sort(array);
		for(int ele : array) {
			System.out.println(ele);
		}
		
		
		//System.out.println(array[array.length - 1] - array[0]);
	}

}
