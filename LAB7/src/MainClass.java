import java.util.Scanner;


public class MainClass {
	public static void main(String[] args){
		System.out.println("Enter the number of elements");
		Scanner sc = new Scanner(System.in);
		int noOfElements = sc.nextInt();
		int intArray[] = new int[noOfElements];
		System.out.println("Enter all elements");
		for(int i=0 ; i<intArray.length ; i++){
			intArray[i] = sc.nextInt();
		}
		
		
	}
}
