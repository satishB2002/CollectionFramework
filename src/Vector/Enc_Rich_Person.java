package Vector;

public class Enc_Rich_Person {
private String Name;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
private String Country;
public String getCountry() {
	return Country;
}
public void setCountry(String country) {
	Country = country;
}
public Enc_Rich_Person(String name, String country) {
	super();
	Name = name;
	Country = country;
}
@Override
public String toString() {
	return Name   +"     "+ Country ;
}

}
