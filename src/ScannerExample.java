import java.util.Scanner;

public class ScannerExample {
	
	Scanner sc = new Scanner(System.in);
	
	public void enterDeets()
	{
		while(true)
		{
			System.out.println("laughter");
			String word = sc.nextLine();
	
			System.out.println("What age?");
			int age =sc.nextInt();
					
			System.out.println("exit da loooop");
			String fish = sc.next();  //nextLine doesn't seem week
			System.out.println(fish);
			
			if (fish.equals("exit")) break;
			sc.nextLine();
		}
	}
}
