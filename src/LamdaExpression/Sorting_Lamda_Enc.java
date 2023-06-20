package LamdaExpression;

public class Sorting_Lamda_Enc {
private String Name;
private Character Id;
private Double saL;
public Sorting_Lamda_Enc(String name, Character id, Double saL) {
	super();
	Name = name;
	Id = id;
	this.saL = saL;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public Character getId() {
	return Id;
}
public void setId(Character id) {
	Id = id;
}
public Double getSaL() {
	return saL;
}
public void setSaL(Double saL) {
	this.saL = saL;
}
}
