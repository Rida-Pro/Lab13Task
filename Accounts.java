package ADT;
import java.util.*;

	public class Accounts implements Bank {

	private List<String> account = new ArrayList<String>(); 
	private String age, fullName, userName, password;
	
	public String getFullName() {

	return fullName;

	 }

	public void setFullName(String fullName) {

	this.fullName= fullName;
	}

	public String getUserName(){

	return userName;

	}

	public void setUserName(String userName) { 

	this.userName = userName;

	}

	private String getPassword() {

	return password;
	}

	public void setPassword(String password) {

	this.password = password;

	}

	public String getAge() {

	return age;

	}

	public void setAge(String age) {

	this.age = age;
	}

	@Override

	public void createNewAccount() {

	// TODO Auto-generated method stub

	account.add(getFullName());

	account.add(getAge());

	account.add(getUserName());

	account.add(getPassword());
	}
    public void viewAccountDetails(){ 

	System.out.println("\nAccount Details:\n");

	String[] fields = {"Name", "Age", "Username"};

	int i = 0;

	for(var field:fields) {

	System.out.println(field+": "+account.get(i));
	i++;

	}

	}

	@Override

	public void recieveBillPayments() {

	// TODO Auto-generated method stub
	}

	@Override
	public void displayExpiredLoanTakers(Object loanArr[]) {
	//TODO Auto-generated method stub
	}
	}