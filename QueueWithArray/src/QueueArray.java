import java.util.Scanner;




public class QueueArray {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Please enter the size of the Array: ");
		
		int arrsize = input.nextInt(); 
		
		int arr[] = new int[arrsize]; 
		
		while(true) {
			
		 
			System.out.println("1. Add elements in the array");

			System.out.println("2. Delete Elements from the array");
	
			System.out.println("3. View All Elements in the array");
			
			
			
			int option = input.nextInt(); 
			
			switch(option) {
			case 1: 
				System.out.println("Add elements in the array");
				
				for(int i = 0; i <arr.length; i++) {
					System.out.println("Please enter the " + i + " Element");
					int arrayElements = input.nextInt(); 
					
					arr[i] = arrayElements; 
					
					
				}
				
				System.out.println("Arrays Overflow");
				
				System.out.println();
				
				
				
				break; 
			case 2: 
				System.out.println("Delete Elements from the array");
				
				for(int i = 0; i < arr.length-1; i++) {
					
					arr[i] = arr[i+1]; 
				}
				
				arr[arrsize - 1] = 0; 
				
				
				break; 
			case 3: 
				System.out.println("View All Elements in the array");
				
				
				if(arr[0] != 0) {
				for(int i = 0; i < arr.length; i++) {
					System.out.print (arr[i] + ", "); 
					
				}
				
				
				
				} else {
					System.out.println("Array is Empty underflow");
				}
				System.out.println();
				
				break; 
				
				}
			
				
			}
		
			
		}
		
		
		
		
		
	}


