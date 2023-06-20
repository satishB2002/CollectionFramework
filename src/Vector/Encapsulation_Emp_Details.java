package Vector;

public class Encapsulation_Emp_Details {
private Integer Id;
@Override
public String toString() {
	return  Id + "            "+ Name + "          " + City ;
}
private String Name;
private String City ;
public Integer getId() {
	return Id;
}
public void setId(Integer id) {
	Id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public Encapsulation_Emp_Details(Integer id, String name, String city) {
	super();
	Id = id;
	Name = name;
	City = city;
}
}