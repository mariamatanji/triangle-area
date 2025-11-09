import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	   
	    double base = input.nextDouble();
	    double height = input.nextDouble();
	    double triangleArea;
	    triangleArea = (double)1/2*(base * height);
		System.out.println(triangleArea);
		
		
		
	}
}
