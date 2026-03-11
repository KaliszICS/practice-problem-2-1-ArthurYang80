public class PracticeProblem {

	public static void main(String args[]) {

	}
	
	public static int find(int[] array, int number) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				return i; 
			}
		}
		return -1; 
	}
	
	public static int findLast(String[] array, String string) {
		int lastIndex = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(string)) {
				lastIndex = i; 
			}
		}
		return lastIndex; 
	}
	
	public static int findSecond(char[] array, char character) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == character) {
				count++;
				if (count == 2) { 
					return i;
				}
			}
		}
		
		
		if (count == 1) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] == character) {
					return i;
				}
			}
		}
		
		return -1; 
	}
	
	public static int[] findAll(double[] array, double number) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				count++;
			}
		}
		
		if (count == 0) {
			return new int[0];
		}
		
		int[] indices = new int[count];
		int indexPos = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				indices[indexPos] = i;
				indexPos++;
			}
		}
		
		return indices;
	}
}
