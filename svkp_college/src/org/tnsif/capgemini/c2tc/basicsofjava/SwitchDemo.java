package org.tnsif.capgemini.c2tc.basicsofjava;

public class SwitchDemo {

	public static void main(String[] args) {
		String hotelMenu="saturday";
		switch(hotelMenu)
		{
		case "monday":
		case "Monday":
		    System.out.println("Today special item is Pasta Carbonara.");
		    break;
		case "tuesday":
		case "Tuesday":
			System.out.println("Today special item is Butter Panneer");
			break;
		case "wedneaday":
		case "Wednesday":
			System.out.println("Today special item is Hawailan Pizza");
			break;
		case "thursday":
		case "Thursday" :
			System.out.println("Today special item is Aloo Curry");	
			break;
		case "Friday":
		case "friday":
			System.out.println("Today special item is Tamato Pappu");
			break;
		case "Saturday":
		case "saturday":
		case "Sunday":
		case "sunday":
			System.out.println("Today special item is Chiken Biryani and Fish fry");
			break;
			default:
				System.out.println("Invalid Day.");
	}

	}

}
