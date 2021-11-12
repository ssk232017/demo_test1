import java.util.Scanner;
public class welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Java:");
	
		Scanner ip1= new Scanner(System.in);
		System.out.println("Enter your name :");
		String name = ip1.next();
		
		System.out.println(name);
		System.out.println(name.length());
		
		System.out.println("Enter your age:");
		int i= ip1.nextInt();
		
		if (i > 20)
			System.out.println("You are not a Teenager.");
	
	
	verify v = new verify();
	v.a= 10;
	v.b= 20;
	v.add();
		int i= new ip.nextInt();
		System.out.println("Enter factorial no. ");
		fact f = new fact();
		f.n= i;
		
		
		
	ip1.close();
		
		
		}

}
