package Collection;
import java.sql.*;

public class jdbctest
{
 public static final String driverName  ="com.mysql.cj.jdbc.Driver";
 public static final String url= "jdbc:mysql://localhost:3306/empolyee";
 public static final String userName= "root";
 public static final String passWord= "priya";
 
 
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Connection con= null;
		PreparedStatement ps = null;
		ResultSet rs= null;
		
		try
		{
			Class.forName(driverName);
			con = DriverManager.getConnection(url,userName,passWord);
		    ps = con.prepareStatement("select *from employee"); 
			rs = ps.executeQuery();
			System.out.println(con);
			while(rs.next())
			{
				
				System.out.println(rs.getInt("emp_id")+"\t");
				System.out.println(rs.getString("emp_Name")+"\t");
				System.out.println(rs.getString("gander")+"\t");
				System.out.println(rs.getInt("salary")+"\t");
				System.out.println(rs.getString("mail")+"\t");
				System.out.println(rs.getString("adress")+"\t");

				
			
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(rs != null)
				{
					ps.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}

	}

}
