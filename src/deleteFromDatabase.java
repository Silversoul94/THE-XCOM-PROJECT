import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class deleteFromDatabase {

	private static  Scanner keyboard = new Scanner(System.in);

	final static String CONN= "jdbc:mysql://localhost/XCOM";
	final static String USER = "root";
	final static String PASSWORD = "";


	public void deletXcom(){

		try

		(

		Connection conn = DriverManager.getConnection(CONN,USER,PASSWORD);

		PreparedStatement stmt = conn.prepareStatement("DELETE FROM xcom where id= ? ");

		)

		{
		
		System.out.println("vart vill du ta bort");
		stmt.setInt(1,keyboard.nextInt());
		
		stmt.executeUpdate();

		}

		catch (SQLException e)

		{

			System.out.println(e.getMessage());

		}

	}
	public void deletItems(){

		try

		(

		Connection conn = DriverManager.getConnection(CONN,USER,PASSWORD);

		PreparedStatement stmt = conn.prepareStatement("DELETE FROM Items where id= ? ");

		)

		{
		
		System.out.println("vart vill du ta bort");
		stmt.setInt(1,keyboard.nextInt());
		
		stmt.executeUpdate();

		}

		catch (SQLException e)

		{

			System.out.println(e.getMessage());

		}

	}
	public void deletClass(){

		try

		(

		Connection conn = DriverManager.getConnection(CONN,USER,PASSWORD);

		PreparedStatement stmt = conn.prepareStatement("DELETE FROM Class where id= ? ");

		)

		{
		
		System.out.println("vart vill du ta bort");
		stmt.setInt(1,keyboard.nextInt());
		
		stmt.executeUpdate();

		}

		catch (SQLException e)

		{

			System.out.println(e.getMessage());

		}

	}
	
}

