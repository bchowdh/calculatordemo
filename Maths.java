// Maths class for all operations 

public class Maths {
	public double add (double num1, double num2) 
	
	{

		return num1 + num2;

	}

	public double subtract ( double num1, double num2)

	{

		return num1 - num2;

	}

	public double multiply (double num1, double num2)

	{

		return num1 * num2;

	}

	public double divide (double num1, double num2)

	{

		return num1 / num2;

	}
	public double modulo (double num1, double num2)

	{

		return num1 % num2;

	}
	public double power (double num1, double num2)

	{

		return Math.pow (num1,num2);

	}
	public double root (double num1, double num2)

	{
		return Math.pow(Math.E, Math.log(num1)/num2);


	}

}


