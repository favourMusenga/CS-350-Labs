/*
*	name: Favour Musenga
*	SID: 19139116
*	description: This program gets an array of words as input and
* 				 output an array of the longest words from input
*				 array.
*/

class Question3 {
	public static void main(String[] args) {
		String[] words1 = {"w3resource", "country","green"};
		String[] words2 = {"cat", "dog","red", "is", "am"};
		String [] output1 = getLongest(words1);
		String [] output2 = getLongest(words2);


		// display the results
		System.out.println("result1 is: ");
		for(String x : output1){
			if (x == null) break;
			System.out.println(x + ", ");
		}

		System.out.println("result2 is: ");
		for(String y : output2){
			if (y == null) break;
			System.out.print(y + ", ");
		}
		System.out.println();
	}

	/*
	*	this method checks for the longest words in an array
	*	and returns the longest word as an array.
	*/
	public static String[] getLongest(String [] words) {

		String[] result = new String[words.length]; // storing the results
		
		// this store the index of elements whose length is the longest 
		int[] positions = new int[words.length];

		int numberOfPostion = 0; // used to keep track of the number of elements that are the longest

		// we assume that the longest word is the first element
		int currentlongestWordLength = words[0].length();

		for (int i = 0; i < words.length; i++ ) {

			/*
			*	checking if the current longest word is less than the word  
			*	on the current index. if true, empty the postions because a 
			*	new element is now the longest.
			*/
			if(currentlongestWordLength < words[i].length()) {
				numberOfPostion = 1;
				positions = null;
				positions = new int[words.length];
				positions[numberOfPostion - 1] = i;
			}

			/*
			*	if the current longest word is equals to the word  
			*	on the current index. if true, add it to the array
			*/
			else if(currentlongestWordLength == words[i].length()){
				numberOfPostion++;
				positions[numberOfPostion - 1] = i;
			}
		}
		
		for (int j = 0; j < numberOfPostion; j++ ) {
			result[j] = words[positions[j]];
		}
		return result;
	}
}