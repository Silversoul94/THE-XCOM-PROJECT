
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
			System.out.println("v�lj en tabel som du vill anv�nda");
			System.out.println("Tabell XCOM �R 1");
			System.out.println("Tabell Items �r 2");
			System.out.println("Tabell Class �r 3");
			System.out.println("EXIT 4");
		choice = keyboard.nextInt();
		switch (choice) {
		//xcom
		case 1:
		System.out.println("anv�dner Xcom");
		useXcom();
		break;
		//items
		case 2:
		System.out.println("anv�dner items");
		useItems();
		break;
		//class
		case 3:
		System.out.println("anv�dner class");	
		useClass();
		break;
		default:
			break;
		}
		} while (choice !=4);
		
	}

public void innerMenu() {
	System.out.println("L�gga till i databasen 1");
	System.out.println("�ndra i databasen 2");
	System.out.println("Ta bort fr�n databasen 3");
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
			System.out.println("L�gger till nu!");
			add.addIntoXcom();
			break;
			
		case 2:
			System.out.println("�ndrar i databasen!");
			change.changeXcom();
			break;
			
		case 3:
			System.out.println("Ta bort n�t fr�n databasen!");
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
			System.out.println("L�gger till nu!");
			add.addIntoItems();
			break;
			
		case 2:
			System.out.println("�ndrar i databasen!");
			change.changeItems();
			break;
			
		case 3:
			System.out.println("Ta bort n�t fr�n databasen!");
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
			System.out.println("L�gger till nu!");
			add.addIntoClass();
			break;
			
		case 2:
			System.out.println("�ndrar i databasen!");
			change.changeClass();
			break;
			
		case 3:
			System.out.println("Ta bort n�t fr�n databasen!");
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
