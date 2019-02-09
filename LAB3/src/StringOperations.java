import java.util.Scanner;


public class StringOperations {
	public static void main(String[] args)
	{
		String str;
		int swcase;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string ");
		str= sc.nextLine();
		System.out.println("Please enter your choice :");
		System.out.println("1. Add a string to itself");
		System.out.println("2. Replace odd positions with #");
		System.out.println("3. Remove duplicate characters of string");
		System.out.println("4. Change odd characters to uppercase");
		swcase = sc.nextInt();
		switch(swcase)
		{
		case 1:
			String doubleStr = str + " " +  str; 
			System.out.println( doubleStr);
			break;
		case 2:
			char[] strCharArray = str.toCharArray();
			for(int i=0;i<strCharArray.length;i=i+2)
			{
				strCharArray[i] = '#';
			}
			String hashStr = new String(strCharArray);
			System.out.println(hashStr);
			break;
		case 3:
			strCharArray = str.toCharArray();
			int length = strCharArray.length;
			for (int i = 0; i < length; i++) 
			{
				for (int j = i + 1; j < length; j++) 
				{
				   if (strCharArray[i] == strCharArray[j]) {
				            int temp = j;//set duplicate element index
				            //delete the duplicate element by shifting the elements to left
				            for (int k = temp; k < length - 1; k++)
				            {
				            	strCharArray[k] = strCharArray[k + 1];
				            }
				            j--;
				            length--;//reduce char array length
				 
				   }
				}
			} 	
			String stringWithOutDuplicates = new String(strCharArray);
			stringWithOutDuplicates = stringWithOutDuplicates.substring(0, length);
			System.out.println("String after duplicates removed : \n " + stringWithOutDuplicates);
			break;
		case 4:
			strCharArray = str.toCharArray();
			for(int i=0;i<strCharArray.length;i=i+2)
			{
				strCharArray[i] = Character.toUpperCase(strCharArray[i]);
			}
			String capitalStr = new String(strCharArray);
			System.out.println(capitalStr);
			break;
		default:
			System.out.println("INVALID OPTION");
			break;
		}
		sc.close();
	}
}
