package Encapsulation_Program;

public class Vector_Lamda_Ex_Enc {
private Character FirstL;
private Integer Id;
private Float SSS;
public Character getFirstL() {
	return FirstL;
}
public void setFirstL(Character firstL) {
	FirstL = firstL;
}
public Integer getId() {
	return Id;
}
public void setId(Integer id) {
	Id = id;
}
public Float getSSS() {
	return SSS;
}
public void setSSS(Float sSS) {
	SSS = sSS;
}
public Vector_Lamda_Ex_Enc(Character firstL, Integer id, Float sSS) {
	super();
	FirstL = firstL;
	Id = id;
	SSS = sSS;
}
}
