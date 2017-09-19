
public class Condizione2 {

	public static void main(String[] args) {

		int a = 10;
		
		if(a<10)
			a += 10;
		else if((a>10)&&(a<20))
			a -= 10;
		else
			a -= 20;
		
		System.out.println(a);

	}

}
