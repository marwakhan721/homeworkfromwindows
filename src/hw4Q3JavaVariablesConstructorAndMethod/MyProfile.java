package hw4Q3JavaVariablesConstructorAndMethod;

public class MyProfile {
	public String MyName;
	public char mySex;
	public int myAge;
	public boolean usCitizen;
	public byte yearswork;
	public short myHouseRent;
	public long mySalary;
	public float myClassGrade;
	public double myHight;

	public MyProfile() {
		System.out.println();
	}

	public void myProfile() {
		System.out.println("My Name Is:" + MyName + "\t\n" + "My Sex Is:" + mySex + "\t\n" + "My Age IS:" + myAge
				+ "\t\n" + "I Am A US Citizen:" + "\t\n" + usCitizen + "I Worked:" + yearswork + "\t\n"
				+ "My House Rent Is:" + myHouseRent + "\t\n" + "My Yearly Salary Is:" + mySalary + "\t\n"
				+ "My College Grade Is:" + myClassGrade + "\t\n" + "My Hight Is :" + myHight);

	}

}
