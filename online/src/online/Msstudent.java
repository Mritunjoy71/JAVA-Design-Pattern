package online;

public class Msstudent {
	private float cgpa;
	public void cgcalculator(int []arra) {
		for(int i=0;i<3;i++) {
		cgpa=cgpa+arra[i]*30;
		cgpa=(float)cgpa/100;		
		}
		cgpa=cgpa*2;
		
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
