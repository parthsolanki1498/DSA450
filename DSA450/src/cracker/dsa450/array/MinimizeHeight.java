package cracker.dsa450.array;

import java.util.Arrays;

public class MinimizeHeight {
	
	public static void main(String[] args) {
		
		// int array[] = {1,5,8,10};
		// int array[] = {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
		int array[] = {7,4,8,8,8,9};
		//int array[] = {3,9,12,16,20};
		int k = 6;
		Arrays.sort(array);
		// minimizeHeight(array,k);
		minimizeHeightAccepted(array, k);	
	}

	private static void minimizeHeightAccepted(int[] array, int k) {
		Arrays.sort(array);
		int n = array.length;

		// Maximum possible height difference
		int ans = array[n-1] - array[0];

		int tempmin, tempmax;
		tempmin = array[0];
		tempmax = array[n-1];

		for(int i = 1; i < n; i++){
			if(array[i] - k < 0){
				continue;
			}

			tempmin = Math.min(array[0] + k, array[i] - k);
			tempmax = Math.max(array[i-1] + k, array[n - 1] - k);

			ans = Math.min(ans,tempmax - tempmin);
		}
		System.out.println(ans);
	}

	private static void minimizeHeight(int[] array, int k) {
		// TODO Auto-generated method stub
		for(int i = 0; i < array.length; i++) {
			if(array[i] < k) {
				array[i] = array[i] + k;
			} else {
				array[i] = array[i] - k;
			}

			System.out.println("loop ele - " + array[i]);
		}
		System.out.println("=====");
		Arrays.sort(array);
		for(int ele : array) {
			System.out.println(ele);
		}
		
		
		System.out.println("Ans " + (array[array.length - 1] - array[0]));
	}

}
