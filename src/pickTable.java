
import java.util.*;

public class pickTable {
private static  Scanner keyboard = new Scanner(System.in);
	
ShowData data = new ShowData();
AddIntoDatabase add = new AddIntoDatabase();
changeIntoDatabase change = new changeIntoDatabase();
deleteFromDatabase delete = new deleteFromDatabase();



public void menu(){	
	
	int choice;
		do {
			System.out.println("välj en tabel som du vill använda");
			System.out.println("Tabell XCOM ÄR 1");
			System.out.println("Tabell Items är 2");
			System.out.println("Tabell Class är 3");
			System.out.println("EXIT 4");
		choice = keyboard.nextInt();
		switch (choice) {
		//xcom
		case 1:
		System.out.println("anvädner Xcom");
		useXcom();
		break;
		//items
		case 2:
		System.out.println("anvädner items");
		useItems();
		break;
		//class
		case 3:
		System.out.println("anvädner class");	
		useClass();
		break;
		default:
			break;
		}
		} while (choice !=4);
		
	}

public void innerMenu() {
	System.out.println("Lägga till i databasen 1");
	System.out.println("Ändra i databasen 2");
	System.out.println("Ta bort från databasen 3");
	System.out.println("Visa data 4");
	System.out.println("EXIT 5");
	
}

public void useXcom() {
	
	int innerChoice;
	innerMenu();
	do {
	innerChoice = keyboard.nextInt();
		switch (innerChoice) {
		case 1:
			System.out.println("Lägger till nu!");
			add.addIntoXcom();
			break;
			
		case 2:
			System.out.println("Ändrar i databasen!");
			change.changeXcom();
			break;
			
		case 3:
			System.out.println("Ta bort nåt från databasen!");
			delete.deletXcom();
			break;
			
		case 4:
		
			data.showDataOfXcom();
			break;

		default:
			break;
			
		}
	} while (innerChoice != 5);
	
}

public void useItems() {
	
	innerMenu();
	int innerChoice;
do {
	
	innerChoice = keyboard.nextInt();
		switch (innerChoice) {
		case 1:
			System.out.println("Lägger till nu!");
			add.addIntoItems();
			break;
			
		case 2:
			System.out.println("Ändrar i databasen!");
			change.changeItems();
			break;
			
		case 3:
			System.out.println("Ta bort nåt från databasen!");
			delete.deletItems();
			break;
			
		case 4:
		
			data.showDataOfItems();

		default:
			break;
		}

} while (innerChoice !=5);

}


public void useClass() {
	
	innerMenu();
	int innerChoice;

	do {
		

	
	innerChoice = keyboard.nextInt();
		switch (innerChoice) {
		case 1:
			System.out.println("Lägger till nu!");
			add.addIntoClass();
			break;
			
		case 2:
			System.out.println("Ändrar i databasen!");
			change.changeClass();
			break;
			
		case 3:
			System.out.println("Ta bort nåt från databasen!");
			delete.deletClass();
			break;
			
		case 4:
		
			data.showDataOfClass();

		default:
			break;
		}
	} while (innerChoice !=5);
	
}


}
