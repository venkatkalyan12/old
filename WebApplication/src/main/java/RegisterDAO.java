import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDAO {

    private String dburl = "jdbc:mysql://localhost:3306/webapp";
    private String dbuname = "root";
    private String dbpassword = "9490";
    private String dbdriver = "com.mysql.jdbc.Driver";

    public void loadDriver(String dbDriver) {
        try {
            Class.forName(dbDriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(dburl, dbuname, dbpassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public String insert(Member member) {
        loadDriver(dbdriver);
        Connection con = getConnection();
        String result = "Data entered successfully";
        String sql = "INSERT INTO usersdb (firstName, lastName, phno, emailId, address, dateOfBirth, password, currWalletBalance) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, member.getFirstName());
            ps.setString(2, member.getLastName());
            ps.setString(3, member.getPhno());
            ps.setString(4, member.getEmailId());
            ps.setString(5, member.getAddress());
            ps.setDate(6, member.getDateOfBirth());
            ps.setString(7, member.getPassword());
            ps.setDouble(8, member.getCurrWalletBalance());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            result = "Data not entered";
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
