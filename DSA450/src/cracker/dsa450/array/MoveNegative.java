package cracker.dsa450.array;

public class MoveNegative {
	
	public static void main(String[] args) {
		
		int array[] = {1,2,3,4,5,-6,-7,-8,-9,-10,11,12,13,-14,-15,-16};
		moveNegative(array);
	}

	private static void moveNegative(int[] array) {
		// TODO Auto-generated method stub
		int flag = 0;
		
		int temp;
		for(int i = 0; i < array.length; i++) {
			if(array[i] < 0) {
				temp = array[flag];
				array[flag] = array[i];
				array[i] = temp;
				flag++;
			}
		}
		
		for(int i : array) {
			System.out.println(i);
		}
	}

}
