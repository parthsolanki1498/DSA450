package cracker.dsa450.array;

public class MaxSubarraySum {
	


	
	public static void main(String[] args) {
		//int array[] = {1,2,3,4,5};
		//int array[] = {5,-4,-2,6,-1};
		int array[] = {-2,1,-3,4,-1,2,1,-5,4};
		//int array[] = {-3,-5};
		int n = array.length;
		//maxSubararySum(array,n);
		kadaneAlgorithm(array,n);
	}
	
	/*
	 * Time Complexity : O(n)
	 * Kadane's Algorithm makes it easy to find the largest sum in
	 * a continues sub array. It suggests to discard all the values
	 * which will give us negative sum. We can achieve it by resting
	 * current sum to 0 each time it gets below zero
	 */
	private static void kadaneAlgorithm(int[] array, int n) {
		// TODO Auto-generated method stub
		int curr_sum = 0;
		int max_sum = 0;
		
		for(int i = 0; i < n; i++) {
			curr_sum = curr_sum + array[i];
			
			if(curr_sum > max_sum) {
				max_sum = curr_sum;
			}
			
			if(curr_sum < 0) {
				curr_sum = 0;
			}
		}
		
		System.out.println("Largest sum of sub array is: "  + max_sum);
	}

	/*
	 * Time Complexity : O(n^2)
	 */
	private static void maxSubararySum(int array[], int n) {
		// TODO Auto-generated method stub
		int smallest_negative = Integer.MIN_VALUE;
		int max_sum = 0;
		for(int i = 0; i < n; i++) {
			int sum = 0;
			for(int j = i; j < n; j++) {
				sum = sum + array[j];
				if(sum > max_sum) {
					max_sum = sum;
				}
				//System.out.println("Sum : " + sum);
			}
			
			if(max_sum == 0) {
				if(smallest_negative < array[i]) {
					smallest_negative = array[i];
				}
				max_sum = smallest_negative;
			}
		}
		System.out.println("Largest sum of sub array is: "  + max_sum);
	}

}
