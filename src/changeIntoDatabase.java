import java.util.*;
import java.sql.*;
public class changeIntoDatabase {


	private static  Scanner keyboard = new Scanner(System.in);

	final static String CONN= "jdbc:mysql://localhost/XCOM";
	final static String USER = "root";
	final static String PASSWORD = "";


	public void changeXcom(){

		try

		(

		Connection conn = DriverManager.getConnection(CONN,USER,PASSWORD);

		PreparedStatement stmt = conn.prepareStatement("update xcom set Rank=?,Fname=?,Lname=?,Alive=?,Class=? where id= ? ");

		)

		{

		System.out.println("V�lj en Rank");
		stmt.setString(1,keyboard.nextLine() );
		
		System.out.println("V�lj en Fname");
		stmt.setString(2,keyboard.nextLine() );
		
		System.out.println("V�lj en Lname");
		stmt.setString(3,keyboard.nextLine() );
		
		System.out.println("LEVER sankt eller falsk");
		stmt.setBoolean(4,keyboard.nextBoolean());
		
		System.out.println("V�lj en class");
		stmt.setInt(5,keyboard.nextInt());
		
		System.out.println("vilken ID ska du �ndra p�");
		stmt.setInt(6,keyboard.nextInt());
		
		stmt.executeUpdate();

		}

		catch (SQLException e)

		{

			System.out.println(e.getMessage());

		}
		
	}
		
		public void changeItems(){

			try

			(

			Connection conn = DriverManager.getConnection(CONN,USER,PASSWORD);

			PreparedStatement stmt = conn.prepareStatement("update Items set Name=?,owner=? where id= ? ");

			)

			{

			System.out.println("V�lj en Name");
			stmt.setString(1,keyboard.nextLine() );
			
		
			System.out.println("V�lj hur m�nga �gare");
			stmt.setInt(2,keyboard.nextInt());
			
			System.out.println("vilken ID ska du �ndra p�");
			stmt.setInt(3,keyboard.nextInt());
			
			stmt.executeUpdate();

			}

			catch (SQLException e)

			{

				System.out.println(e.getMessage());

			}
		}
			
			public void changeClass(){

				try

				(

				Connection conn = DriverManager.getConnection(CONN,USER,PASSWORD);

				PreparedStatement stmt = conn.prepareStatement("update Class set Name=? where id= ? ");

				)

				{

				System.out.println("V�lj en Name");
				stmt.setString(1,keyboard.nextLine() );
				
				
				System.out.println("vilken ID ska du �ndra p�");
				stmt.setInt(2,keyboard.nextInt());
				
				stmt.executeUpdate();

				}

				catch (SQLException e)

				{

					System.out.println(e.getMessage());

				}

	}
	
	


}


