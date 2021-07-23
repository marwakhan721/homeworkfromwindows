package hw4Q3JavaVariablesConstructorAndMethod;

public class TestMyProfile {

	public static void main(String[] args) {
		MyProfile marwa = new MyProfile(); // Constructor initialized
		marwa.MyName = "Marwa";
		marwa.mySex = 'F';
		marwa.myAge = 26;
		marwa.usCitizen = true;
		marwa.yearswork = 5;
		marwa.myHouseRent = 400;
		marwa.mySalary = 122000;
		marwa.myClassGrade = 3.620f;
		marwa.myHight = 1.5206123;
		marwa.myProfile();

		MyProfile maria = new MyProfile(); // Constructor initialized
		maria.MyName = "Maria";
		maria.mySex = 'F';
		maria.myAge = 26;
		maria.usCitizen = true;
		maria.yearswork = 5;
		maria.myHouseRent = 400;
		maria.mySalary = 122000;
		maria.myClassGrade = 3.620f;
		maria.myHight = 1.5206123;
		maria.myProfile();

	}

}
