import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math.*;
import java.lang.Math;
/** This <code> Calculator class  </code> application to show calculator works, handles double type input
 * Takes + for addition, - for subtraction, * for multiplication, / for division, % for remainder, ^ for power, ~ for any root
 * Also displays Pi value when you type pi using Math.PI function
 * Maths class is called to perform all operation
 * @author Banasree
 * @Vesion 1.0
 * @date May 2nd 2018
 * @param args[]
 * @throws no error
 */
public class Calculator {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		boolean isCalculator = true;
		while(isCalculator) {
			showCalculator();
			System.out.print("Press Enter to continue or type pi to see value of Pi and exit : ");
			String input = userinput.next();
						if (input.toLowerCase().equals("pi")) {
				isCalculator = false;
			}
			else {

				continue;
			}
			System.out.println("Pi " + Math.PI);
		}

		System.out.println("Exited from Calculator!!!!");

	}

	public static void showCalculator() {

		try {
			// Creating instance of Maths() class
			Maths math = new Maths();
			Scanner userinput = new Scanner(System.in);
			System.out.println("Welcome to Java Calculator");
			System.out.println("===========================");
			System.out.println("HELP ::: Input first number, operator mentioned below, second number \n +: for addition \n -:  for subtraction \n *: for multiplication \n /: for division \n %: for remainder \n ^: for power \n ~: for root ");
			System.out.println("==============================");
			System.out.print("Enter First Number:");
			double num1 = userinput.nextDouble();
			System.out.print("Enter operation to perform (+,-,*,/,%,^,~):");
			String operation= userinput.next();
			operation = operation.toLowerCase();
			System.out.print("Enter Second Number:");
			double num2= userinput.nextDouble();

			if (operation.equals("+"))

				System.out.println("\n" + num1 + " + " +  num2 +  " = " + math.add(num1, num2));

			else if (operation.equals("-"))

				System.out.println("\n" + num1 + " - " +  num2 +  " = " + math.subtract(num1, num2));

			else if (operation.equals("*"))

				System.out.println("\n" + num1 + " * " +  num2 +  " = " + math.multiply(num1, num2));

			else if (operation.equals("/"))

				System.out.println("\n" + num1 + " / " +  num2 +  " = " + math.divide(num1, num2));


			else if (operation.equals("%"))

				System.out.println("\n" + num1 + " % " +  num2 +  " = " + math.modulo(num1, num2));

			else if (operation.equals("^"))

				System.out.println("\n" + num1 + " ^ " +  num2 +  " = " + math.power(num1, num2));

			else if (operation.equals("~"))

				System.out.println("\n" + num1 + " ~ " +  num2 +  " = " + math.root(num1, num2));

			else

				System.out.println(" Sorry other operators not implemented!!");

		}
		catch (InputMismatchException ex) {
			System.out.println("InputMismatchException " + ex.getMessage());

		}
		catch(NumberFormatException ex) {
			System.out.println("Numberformat exception" + ex.getMessage());
		}
		catch(Exception e) {

			System.out.println("Unexpected error :" + e.getMessage());

		}
		finally {
			System.out.println("End of the calculation!");
			System.out.println("==============================");

		}
	}

}






