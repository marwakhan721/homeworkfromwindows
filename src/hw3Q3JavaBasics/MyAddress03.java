package hw3Q3JavaBasics;

public class MyAddress03 {

	public static void main(String[] args) {
		  String MyName = "Marwa Khan";
		  int houseNumber = 2920;
		  String HouseStreet = "Hone Avenue";
		  String CityName = "Bronx";
          String state = "New York";
		  int zipcode = 10469;
		  boolean inUSA = true;
		  
		  System.out.println(MyName +" "+ houseNumber +" "+ HouseStreet +" "+ CityName +" "+ state +" "+ zipcode +" "
		          + inUSA);
		  System.out.println("\n\t" + MyName +"\n\t"+ houseNumber +"\n\t"+ HouseStreet +"\n\t"+ CityName +"\n\t"+ state + "\n\t"
		          + zipcode +"\n\t" + inUSA);
		  System.out.println( "\n\t"+ MyName +"\n\t "+ houseNumber+","+ HouseStreet+","+CityName+","+state+"\n\t "
		          +zipcode+"\n\t "+inUSA);
		  System.out.println( "\n\t"+ MyName +"\n\t "+ houseNumber+","+ HouseStreet+"\n\t "+CityName+","+state+","
		          +zipcode+"\n\t "+inUSA);
		

	}

}
