package LamdaExpression;
interface pqr
{
	int Satish(String name);
}
public class Parameter_Lamda_Ex {
public static void main(String[] args) {
	pqr pq=(name)->
	{
		return name.length();
	};
	System.out.println("Length of String ="+pq.Satish("Satish Barate"));
}
}
