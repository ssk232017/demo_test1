import java.util.Scanner;
public class welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Java:");
	//while(true)
	//{
		Scanner ip1= new Scanner(System.in);
		System.out.println("Enter your name :");
		String name = ip1.next();
		
		System.out.println(name);
		System.out.println(name.length());
		//String s=name;
		
		/*if ("shivamkalbande"==s){
		ss	System.out.println("Verified");
			break;
			}else{
			System.out.println("Not Verified"); 		
			}*/
	ip1.close();
		return ;}

}
