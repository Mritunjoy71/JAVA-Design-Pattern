package online;

import java.util.Arrays;
import java.util.Scanner;

public class cgmaker {
	public void cgcounter() {
		String std=null;
		Scanner scn =new Scanner(System.in);
		std=scn.nextLine();
		if(std.equalsIgnoreCase("ms"))
		{ 
			int []arra=new int[3];
			for(int i=0;i<3;i++) {
				int n=scn.nextInt();
				arra[i]=n;
			}
			Msstudent mstd=new Msstudent();
			mstd.cgcalculator(arra);
		}
		
		if(std.equalsIgnoreCase("ug"))
		{
			int []arra=new int[5];
			
			for(int i=0;i<5;i++)
			{
				int n=scn.nextInt();
				arra[i]=n;
				
			}
			Arrays.sort(arra);
			int att;
			att=scn.nextInt();
			int term;
			term=scn.nextInt();
			Ugrad ug=new Ugrad();
			ug.cgcalculator(arra, att, term);
			
		}
		scn.close();
		
		
		
	}

}
