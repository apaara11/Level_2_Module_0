package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] roomItems = {"bed","blanket","sister","book","pictures"};
		//2. print the third element in the array
		System.out.println(roomItems[2]);
		//3. set the third element to a different value
		roomItems [2] = "brother";
		//4. print the third element again
		System.out.println(roomItems[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for( int i=0; i<roomItems.length; i++) {
			System.out.println(roomItems[i]);
		}
		
		//6. make an array of 50 integers
		int [] fifty= new int [50];
		//7. use a for loop to make every value of the integer array a random number
	Random r= new Random();
		
		for(int i=0; i<fifty.length; i++) {
			fifty[i]=r.nextInt(50);
		}
	
		//8. without printing the entire array, print only the smallest number in the array
		int smallest= 50;
for(int i=0; i<fifty.length; i++) { 
	if(smallest>fifty[i]) {
		smallest = fifty[i];
	}
}
System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
for(int i=0; i<fifty.length; i++) {
		System.out.println(fifty[i]);
}
		//10. print the largest number in the array.
int biggest= 0;
for(int i=0; i<fifty.length; i++) {
	if(biggest<fifty[i]) {
		biggest = fifty[i];
	}
}
for(int i=0; i<fifty.length; i++) {
System.out.println(fifty[i]);
	}
}
}

