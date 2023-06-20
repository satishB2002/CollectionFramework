package ListInterface;

public class Encapsu_Construct_ArrauList {
private Integer ID;
private String Name;
private Double Sal;
public Encapsu_Construct_ArrauList(Integer iD, String name, int i) {
	super();
	ID = iD;
	Name = name;
	Sal = Sal;
}
@Override
public String toString() {
	return "Encapsu_Construct_ArrauList [ID=" + ID + ", Name=" + Name + ", Sal=" + Sal + "]";
}
public Integer getID() {
	return ID;
}
public void setID(Integer iD) {
	ID = iD;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public Double getSal() {
	return Sal;
}
public void setSal(Double sal) {
	Sal = sal;
}
 
}