
public class NewYear {

	public static void printChristmasTree(String str) {

		for (int i = 0; i < str.length(); i++) 
		{
			
			
			for (int k = 0; k < str.length() - i; k++) 
			{
				System.out.print(" ");
			}
			
			
			for (int j = 0; j < i * 2 + 1; j++) 
			{
				System.out.print(str.charAt(i));
			}
			System.out.println("");
		}
		for (int i=0;i<3;i++) {
			for (int k=0;k<10;k++){
				System.out.print(" ");
				
				}for (int j=0;j<4;j++){
					System.out.print("!");
			}
			System.out.println(""); 
		}

	}
	  

	public static void main(String[] args) {

		printChristmasTree("HappyNewYear");

	}
}