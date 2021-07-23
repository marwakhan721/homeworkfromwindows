package hw5Q4Constructor;
/*
 * 04) Create a package name "hw5Q4Constructor" in your HW project. Inside the package, a) Create a class "Computer". Declare some variable -- Brand, Model, Operating system, price, madeInUSA, grade (grade as char). Declare default constructor and multiple parameterized constructor. Use only one System.out.println() in each constructor. b) Create another class TestComputer. Create object as many as you want under main method. Initialize all the constructors. I want in console, the first outcome as --> This is from default Constructor of Computer class. Second outcome as-- > My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$, Grade: C and Made in USA? : false. I want the third outcome in console for your configuration. Fourth outcome for 1 variable, 5th outcome for 3 variable, 6th outcome for 5 variable. Organize your code. Push in the github. Paste your github link below. (Please paste the whole question inside the multiple line comments between package and class)
*
 * **/

public class Computer {
	public String MyBrand;
	public String Model;
	public String OperatingSystem;
	public int price;
	public boolean madeInUSA;
	public char grade;

	public Computer() {
		System.out.println("This is from default Constructor of Computer Class");
	}

	public Computer(String myBrand, String model, String operatingSystem, int price, boolean madeInUSA, char grade) {
		this.MyBrand = myBrand;
		this.Model = model;
		this.OperatingSystem = operatingSystem;
		this.price = price;
		this.madeInUSA = madeInUSA;
		this.grade = grade;
		System.out.println(" My Computer Brand Is:" + MyBrand + "\n My Computer Model Is: + Model"
				+ "\n My Computer Operating System Is:" + OperatingSystem + "\n My Computer Price Is:" + price
				+ "\n Is My Computer Made In USA?" + madeInUSA + "\n My Computer Grade Is:" + grade);

	}

	public Computer(String myBrand) {
		this.MyBrand = myBrand;
		System.out.println("My Computer Brand Is:" + MyBrand);
	}

	public Computer(String myBrand, String model, int price) {
		this.MyBrand = myBrand;
		this.Model = model;
		this.price = price;
		System.out.println(" My Computer Brand Is: " + MyBrand + " My Computer Model Is:" + Model
				+ " My Computer Price Is:" + price);
	}
	
	public Computer(String myBrand, String model, String operatingSystem, int price, boolean madeInUSA) {
		this.MyBrand = myBrand;
		this.Model = model;
		this.OperatingSystem = operatingSystem;
		this.price = price;
		this.madeInUSA = madeInUSA;
		System.out.println(" My Computer Brand Is:" + MyBrand + "/n My Computer Model Is:" + Model + "/n My Computer Operating System Is:" + OperatingSystem + "/n My Computer Price Is:" + price + "/n Is My Computer Made In USA?" + madeInUSA);
	
	}
	

	}
