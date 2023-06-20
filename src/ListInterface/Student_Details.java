package ListInterface;
/*WAP to store students details of JU university
Field should be: 
id,name,email,username,password,city,state,zip-code, country

Use ArrayList to store the data of students, make encapsulate class for students.*/
public class Student_Details {
private int Id;
private String Email;
private String Username;
private int Password;
private String City;
private String State;
private int ZipCode;
private String Country;
public Student_Details(int id, String email, String username, int password, String city, String state, int zipCode,
		String country) {
	super();
	Id = id;
	Email = email;
	Username = username;
	Password = password;
	City = city;
	State = state;
	ZipCode = zipCode;
	Country = country;
}
@Override
public String toString() {
	return "Student_Details [Id=" + Id + ", Email=" + Email + ", Username=" + Username + ", Password=" + Password
			+ ", City=" + City + ", State=" + State + ", ZipCode=" + ZipCode + ", Country=" + Country + "]";
}


}
