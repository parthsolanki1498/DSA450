package cracker.dsa450.array;


public class ReverseArray {
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		reverseArray(a);
	}

	static void reverseArray(int[] a) {
		// TODO Auto-generated method stub
		int start = 0;
		int temp = 0;
		int end = a.length - 1;
		while(start < end) {
			temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		for(int i : a) {
			System.out.print(i);
		}
	}

}
