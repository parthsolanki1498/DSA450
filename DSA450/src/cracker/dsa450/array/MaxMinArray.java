package cracker.dsa450.array;

public class MaxMinArray {
	
	public static void main(String[] args) {
		int array[] = {1,10,20,100,400,-2};
		SingleLinearSearch(array);
	}

	private static void SingleLinearSearch(int[] array) {
		// TODO Auto-generated method stub
		int max = array[0];
		int min = array[0];
		for(int i : array) {
			if(i > max) {
				max = i;
			}
			if(i < min) {
				min = i;
			}
		}
		System.out.println("Min:" + min);
		System.out.println("Max:" + max);
	}

}
