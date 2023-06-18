package MyPkg;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++)
		{
			if(i%2==0) {
				continue;
			}
			else
			{
				System.out.println(i);
			}
		}
		System.out.println("outside loop");
	}

}
