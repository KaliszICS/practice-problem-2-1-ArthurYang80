
class Notes {
	public static void main(String[] args) {

		int[] numArray = {1, 5, 8, 2, 5, 8, 5, 4, 8};

		int num = 5; //number we're looking for
		int index = -1; //number we're looking for index

		int occurances = 0; //number of occurances in an array of our number
		//This will get us the LAST occurance of a number	
		//This loop will ALWAYS go through an array one by one
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] == num) { //true when we have found the number
				occurances++; //increase for each number we fine
				index = i; //save the index of the number we found
				i = numArray.length; //Does first occurance ONLY
				//return i;
			}
		}

		// return index;
		// return -1;
		System.out.println(index);
		
	}
}
