

public class BreakAndCont {
	
	
/*	public void go(){
		System.out.println("First");
		
		//break;
		//continue;
	
	}
	
	public static void main(String[] args) {
		
		BreakAndCont b = new BreakAndCont();
		b.go();
		//continue---> continue is the next cycle--->to skip the iterations
		for(int i=0; i<10;i++){
			if (i>=5 && i <=7)
				continue;
				if(i==5)
					break;
			System.out.println(i);

		}
		System.out.println("Outside the loop");

	}
*/
	
	
	public void go(){
		System.out.println("First");
	
		System.out.println("last");
	}
	public static void main(String[] args) {
		
		/*BreakAndCont b = new BreakAndCont();
		b.go();*/
		for (int i =0; i<10; i ++){
			if (i>=5 && i<=7)
				continue;
			if (i==5)
				break;
			System.out.println(i);
		}
		
		System.out.println("Outside the loop");
		
		
	}
	
	
	
}





























