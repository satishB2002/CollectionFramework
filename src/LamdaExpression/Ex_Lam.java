package LamdaExpression;
interface xyz
{
	void input();
}
public class Ex_Lam {
public static void main(String[] args) {
	xyz print=()->
	{
		System.out.println("Printing Lamda Ex..");
	};
	xyz ab=()->System.out.println("Printing Single Expression");
	print.input();
	ab.input();
}
}

