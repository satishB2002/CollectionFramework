package LamdaExpression;

interface functionalinterface
{
    void disp(String a1);
}
public class Reverse_String_Buffer {
public static void main(String[] args) {
	functionalinterface ab=(a1)->
			{
			StringBuffer ss=new StringBuffer(a1);
			//ss.append(a1);
			ss.reverse();
			
			System.out.print(ss+" ");
};
ab.disp("etaraB hsitaS ");

}
}
