import java.util.Scanner;

public class Midpointcalculation {

	
	public static void main(String[] args) {
	System.out.println("Please enter the coordinates of the two points (x1, y1, x2, y2):");
	
	Scanner scan = new Scanner(System.in);
	
	double x1 = scan.nextDouble();
	double y1 = scan.nextDouble();
	double x2 = scan.nextDouble();
	double y2 = scan.nextDouble();
	double midPoint1; 
	double midPoint2;
	
	
	midPoint1 = (x1 + x2)/2;
	midPoint2 = (y1 + y2)/2;
	
	System.out.println("The midpoint of"+ "("+ x1 +","+ y1 +"),"+"("+ x2 +","+ y2 +") is "+ "(" + midPoint1 + ","  + midPoint2 + ")" );
	
	
	

	}

}