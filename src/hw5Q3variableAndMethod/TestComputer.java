package hw5Q3variableAndMethod;

/*
*03) Create a package name "hw5Q3variableAndMethod" in your HW project. Inside the package, a) Create a class "Computer". Declare some variable -- Brand, Model, Operating system, price, madeInUSA, grade (as char). Implement a method inside the class -- "configuration" and use only one System.out.println(). Use the variables inside sysout. Create another class TestComputer. Create object from Computer class under main method. Initialize object and configuration method. I want the first outcome in console as --> My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$ and Made in USA? : false. I want second outcome in console for your configuration. So, Total 2 outcome is expecting from the test class. Organize your code. Push in the github. Paste your github link below. (Please paste the whole question inside the multiple line comments between package and class)

 * **/
public class TestComputer {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.MyBrand = "Apple";
		computer.Model = "Macbookpro";
		computer.OperatingSystem = "Macos";
		computer.price = 800;
		computer.madeInUsa = false;
		computer.grade = 'A';
		computer.computer();

		Computer computer2 = new Computer();
		computer2.MyBrand = "Windows";
		computer2.Model = "SurfacePro";
		computer2.OperatingSystem = "Macos";
		computer2.price = 800;
		computer2.madeInUsa = false;
		computer2.grade = 'A';
		computer2.computer();
	}

}
