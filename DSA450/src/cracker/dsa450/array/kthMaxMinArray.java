package cracker.dsa450.array;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthMaxMinArray {
	
	public static void main(String[] args) {
		int array[] = {100,25,101,24,99,102,32,43};
		int k = 3;		
		
		//Sorting(array,k);
		MaxHeap(array,k);
		MinHeap(array,k);
	
	}

	/*
	 * Use Max heap when we need k-th smallest
	 * Use Min heap when we need k-th largest
	 */
	private static void MinHeap(int[] array, int k) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i = 0; i < k; i++) {
			pq.add(array[i]);
		}
				
		for(int i = k; i < array.length; i++) {
			if(pq.peek() < array[i]) {
				pq.poll();
				pq.add(array[i]);
			}
		}
		System.out.println("Kth largest element is " + pq.peek());
	}
	
	private static void MaxHeap(int[] array, int k) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i = 0; i < k; i++) {
			pq.add(array[i]);
		}
		
		for(int i = k; i < array.length; i++) {
			if(pq.peek() > array[i]) {
				pq.poll();
				pq.add(array[i]);
			}
		}
		System.out.println("Kth smallest element is " + pq.peek());
		
	}

	private static void Sorting(int[] array, int k) {
		// TODO Auto-generated method stub
		// Sort in ascending order for max	
		for(int i = 0; i < array.length; i++) {
			for(int j = i + 1; j < array.length; j ++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			//System.out.println(array[i]);
			
		}
		System.out.println("Kth Smallest element is " + array[k - 1]);
		System.out.println("Kth Largest element is " + array[array.length - k]);
	}

}
