
import java.util.*;
import java.sql.*;

public class AddIntoDatabase{
	private static  Scanner keyboard = new Scanner(System.in);

	final static String CONN= "jdbc:mysql://localhost/XCOM";
	final static String USER = "root";
	final static String PASSWORD = "";


	public void  addIntoXcom(){

		try

		(

		Connection conn = DriverManager.getConnection(CONN,USER,PASSWORD);

		PreparedStatement stmt = conn.prepareStatement("INSERT INTO xcom(Rank,Fname,Lname,Alive,Class)values(?,?,?,?,?) ");

		)

		{

		System.out.println("Välj en Rank");
		stmt.setString(1,keyboard.nextLine() );
		
		System.out.println("Välj en Fname");
		stmt.setString(2,keyboard.nextLine() );
		
		System.out.println("Välj en Lname");
		stmt.setString(3,keyboard.nextLine() );
		
		System.out.println("LEVER sankt eller falsk");
		stmt.setBoolean(4,keyboard.nextBoolean());
		
		System.out.println("Välj en class mellan 1,2,3,4");
		stmt.setInt(5,keyboard.nextInt());
		
		stmt.executeUpdate();

		}

		catch (SQLException e)

		{

			System.out.println(e.getMessage());

		}

	

	}
	
	public void  addIntoItems(){

		try

		(

		Connection conn = DriverManager.getConnection(CONN,USER,PASSWORD);

		PreparedStatement stmt = conn.prepareStatement("INSERT INTO Items(Name,Owner)values(?,?) ");

		)

		{

		System.out.println("Välj en Name");
		stmt.setString(1,keyboard.nextLine() );
		
		System.out.println("Välj hur många owner");
		stmt.setInt(2,keyboard.nextInt() );
	
		
		stmt.executeUpdate();

		}

		catch (SQLException e)

		{

			System.out.println(e.getMessage());

		}

	

	}
	
	public void  addIntoClass(){

		try

		(

		Connection conn = DriverManager.getConnection(CONN,USER,PASSWORD);

		PreparedStatement stmt = conn.prepareStatement("INSERT INTO Class(Name)values(?) ");

		)

		{

		System.out.println("Välj en Name");
		stmt.setString(1,keyboard.nextLine() );
		
	
		stmt.executeUpdate();

		}

		catch (SQLException e)

		{

			System.out.println(e.getMessage());

		}

	

	}
	


}


