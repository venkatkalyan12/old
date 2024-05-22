import java.sql.Date;

public class Member {
private String FirstName,LastName,Phno,EmailId,Address,PassWord   ;
Date DateOfBirth;
double CurrWalletBalance;


public Member() {
	super();
}


public Member(String firstName, String lastName, String phno, String emailId, String address, String passWord,
		Date dateOfBirth, double currWalletBalance) {
	super();
	FirstName = firstName;
	LastName = lastName;
	Phno = phno;
	EmailId = emailId;
	Address = address;
	PassWord = passWord;
	DateOfBirth = dateOfBirth;
	CurrWalletBalance = currWalletBalance;
}


public String getFirstName() {
	return FirstName;
}


public void setFirstName(String firstName) {
	FirstName = firstName;
}


public String getLastName() {
	return LastName;
}


public void setLastName(String lastName) {
	LastName = lastName;
}


public String getPhno() {
	return Phno;
}


public void setPhno(String phno) {
	Phno = phno;
}


public String getEmailId() {
	return EmailId;
}


public void setEmailId(String emailId) {
	EmailId = emailId;
}


public String getAddress() {
	return Address;
}


public void setAddress(String address) {
	Address = address;
}


public String getPassWord() {
	return PassWord;
}


public void setPassWord(String passWord) {
	PassWord = passWord;
}


public Date getDateOfBirth() {
	return DateOfBirth;
}


public void setDateOfBirth(Date dateOfBirth) {
	DateOfBirth = dateOfBirth;
}


public double getCurrWalletBalance() {
	return CurrWalletBalance;
}


public void setCurrWalletBalance(double currWalletBalance) {
	CurrWalletBalance = currWalletBalance;
}


}
