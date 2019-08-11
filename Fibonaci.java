
public class Fibonaci {
	int x=0;
	int y=1;
	int z;
	int i;

	
	

	void Sona()
           {
		System.out.println(x);
		System.out.println(y);
for (i=2;i<=5;i++) 
        	  {

			z=x+y ;
			System.out.println(z);
			x=y;
			y=z;
		}
           }
}
class TestCase {
	public static void main(String[] args) {
		
		Fibonaci f=new Fibonaci();
		f.Sona();
	}

}
