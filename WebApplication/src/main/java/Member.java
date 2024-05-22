import java.sql.Date;

public class Member {
    private String firstName, lastName, phno, emailId, address, password;
    private Date dateOfBirth;
    private double currWalletBalance;

    public Member() {
        super();
    }

    public Member(String firstName, String lastName, String phno, String emailId, String address, String password, Date dateOfBirth, double currWalletBalance) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.phno = phno;
        this.emailId = emailId;
        this.address = address;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.currWalletBalance = currWalletBalance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getCurrWalletBalance() {
        return currWalletBalance;
    }

    public void setCurrWalletBalance(double currWalletBalance) {
        this.currWalletBalance = currWalletBalance;
    }
}
