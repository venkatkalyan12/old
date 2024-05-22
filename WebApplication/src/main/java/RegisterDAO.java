import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDAO {

private String dburl="jdbc:mysql://localhost:3306/webapp";
private String dbuname="root";
private String dbpassword="9490";
private String dbdriver="com.mysql.jdbc.Driver";

public void loadDriver(String dbDriver) {
	try {
		Class.forName(dbDriver);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public Connection getConnection()
{
	Connection con=null;
	try {
		con=DriverManager.getConnection(dburl,dbuname,dbpassword);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
}
public String insert(Member member) 
{
	loadDriver(dbdriver);
	Connection con=getConnection();
	String result="data entered successfully";
	String sql="insert into userd.member values(?,?,?,?,?,?,?)";
	try {
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, member.getFirstName());
		ps.setString(2, member.getLastName());
		ps.setString(3, member.getPhno());
		ps.setString(4, member.getEmailId());
		ps.setString(5, member.getAddress());
		ps.setDate(7, member.getDateOfBirth());
		ps.setString(8, member.getPassWord());
        ps.setDouble(9, member.getCurrWalletBalance());
        ps.executeUpdate();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		result="data not entered";
	}
	return null;
	
}
}
