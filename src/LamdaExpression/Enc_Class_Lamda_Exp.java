package LamdaExpression;

public class Enc_Class_Lamda_Exp {
private String name ,id;
private Integer Sal;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public Integer getSal() {
	return Sal;
}
public void setSal(Integer sal) {
	Sal = sal;
}
public Enc_Class_Lamda_Exp(String name, String id, Integer sal) {
	super();
	this.name = name;
	this.id = id;
	Sal = sal;
}

}
