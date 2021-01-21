package online;

public class Ugrad {
	private float cgpa;
	public void cgcalculator(int []arra,int att,int term) {
		for(int i=0;i<3;i++) {
		cgpa=cgpa+arra[i]	;	
		}
		cgpa=cgpa+att*3;
		cgpa=cgpa+term;
		cgpa=cgpa/3;
		
		if(cgpa>=80)
			System.out.println("A+");
		else if(cgpa<80 && cgpa>=70)
			System.out.println("A");
		else if(cgpa<70 && cgpa>=60)
			System.out.println("B");
		else if(cgpa<60 && cgpa>=50)
			System.out.println("C");
		else 
			System.out.println("F");
		
	
		
		
	}

}
