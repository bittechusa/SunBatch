package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Assert;

//import junit.framework.Assert;

public class MySQLJDBC 
{
	 public static void main(String[] args) throws ClassNotFoundException 
	 {

	        Connection con = null;
	        Statement st = null;
	        ResultSet rs = null;

	        String url = "jdbc:mysql://localhost:3306/testdb";
	        String user = "root";
	        String password = "";

	        try {
	        	Class.forName("com.mysql.jdbc.Driver");
	            con = DriverManager.getConnection(url, user, password);
	            st = con.createStatement();
	            
	            String fname = "Asad";
	            String city = "Bronx";
	            
	            rs = st.executeQuery("select * from info");

	            while(rs.next()) 
	            {
	            	System.out.println(rs.getString("name"));
	            	System.out.println(rs.getString("city"));
	            	//Assert.assertTrue(rs.getString("name").contains(fname));
	            	     
	             }

	        } 
	        catch (SQLException ex) 
	        {
	            Logger lgr = Logger.getLogger(MySQLJDBC.class.getName());
	            lgr.log(Level.SEVERE, ex.getMessage(), ex);

	        } 
	        finally 
	        {
	            try {
	                if (rs != null) {
	                    rs.close();
	                }
	                if (st != null) {
	                    st.close();
	                }
	                if (con != null) {
	                    con.close();
	                }

	            } 
	            catch (SQLException ex)
	            {
	                Logger lgr = Logger.getLogger(MySQLJDBC.class.getName());
	                lgr.log(Level.WARNING, ex.getMessage(), ex);
	            }
	        }
	    }

}
