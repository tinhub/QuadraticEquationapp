	/* Quadratic Equation
	The Quadratic Equation formular is given as:
	Where A,B & C are constants.
	The solution of the equation comprises of two roots:
		R1 = (-B + sqrt(B*B-4*A*C))/2*A
		R1 = (-B - sqrt(B*B-4*A*C))/2*A 
	here B*B-4*A*C is known as discriminant(D)
	IfD=0, then roots are equal
	IfD>0, then the 2 roots are unequal
	IfD<0, then roots are imaginary
	*/
import java.util.Scanner;
public class QuadraticEquation {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value of A");
		double a = scanner.nextDouble();
		System.out.println("Enter value of B");
		double b = scanner.nextDouble();
		System.out.println("Enter value of C");
		double c = scanner.nextDouble();
		double root1 = 0;
		double root2 = 0;
		
		double discriminant = b*b-4*a*c;
		
		if(discriminant == 0){
			System.out.println("Roots are imaginary ... ");
		}
		else if(discriminant == 0){
			System.out.println("Roots are equal ... ");
			root1 = -b /(2*a);
			root2 = -b /(2*a);
		}
		if(discriminant > 0){
			System.out.println("Roots are unequal ... ");
			
			root1 = (-b + Math.sqrt(discriminant)) /(2*a);
			root2 = (-b - Math.sqrt(discriminant)) /(2*a);
		}
		System.out.println("Roots of the quadratic equations are: ");
		System.out.println("Root 1: " + root1);
		System.out.println("Root 1: " + root2);
	}
}