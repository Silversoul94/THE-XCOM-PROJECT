import java.sql.*;

public class ShowData {
	final static String PATH= "jdbc:mysql://localhost/XCOM";
	final static String USER="root";
	final static String PASSWORD ="";

	public void showDataOfXcom(){
try(
		Connection conn = DriverManager.getConnection(PATH, USER, PASSWORD);
		
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
        ResultSet rs = stmt.executeQuery("SELECT * from XCOM" );

    )   

    {   

        while(rs.next())

            {
        	int id = rs.getInt("id");
        	String rank = rs.getString("Rank");
            String fname = rs.getString("Fname");
            String lname =rs.getString("Lname");
            boolean alive =rs.getBoolean("Alive");
            String classes = rs.getString("Class");

            System.out.println(id+"|"+rank+"|"+fname+"|"+lname+"|"+alive+"|"+classes);

            }

    }

catch (SQLException e)

{

    System.out.println(e.getMessage());

		}
	}
	public void showDataOfClass(){
		try(
				Connection conn = DriverManager.getConnection(PATH, USER, PASSWORD);
				
		        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				
		        ResultSet rs = stmt.executeQuery("SELECT * from class" );

		    )   

		    {   

		        while(rs.next())

		            {
		        	int id = rs.getInt("id");
		            String name = rs.getString("name");
		            System.out.println(id+"|"+name);

		            }

		    }

		catch (SQLException e)

		{

		    System.out.println(e.getMessage());

				}
			}
	public void showDataOfItems(){
		try(
				Connection conn = DriverManager.getConnection(PATH, USER, PASSWORD);
				
		        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				
		        ResultSet rs = stmt.executeQuery("SELECT * from items" );

		    )   

		    {   

		        while(rs.next())

		            {
		        	int id = rs.getInt("id");
		        	String name = rs.getString("name");
		            String owner = rs.getString("owner");
		            System.out.println("id|name|owner");
		            System.out.println(id+"|"+name+"|"+owner);

		            }

		    }

		catch (SQLException e)

		{

		    System.out.println(e.getMessage());

				}
			}
}