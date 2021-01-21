package senerio.one;

import java.util.Scanner;


public class MealBuilder {

		   
	   public Meal burgermaker() {
		   Meal meal = new Meal();
		   String input=null;
		   Scanner scn =new Scanner(System.in);
		   System.out.println("Enter order(If done ,write No)\n");
		   while(true)
		   {
			   input=scn.nextLine();
			   if(input.equalsIgnoreCase("no"))
				   break;
			   if(input.equalsIgnoreCase("chicken patty"))
			   {
				   System.out.println("How many?\n");
		    	   int n=scn.nextInt();
		    	   for(int i=0;i<n;i++)
		    	   {
		    		   meal.addItem(new Chicken_patty());
		    	   }   
			   }
			   if(input.equalsIgnoreCase("chicken sauce"))
			   {
				   System.out.println("How many?\n");
		    	   int n=scn.nextInt();
		    	   for(int i=0;i<n;i++)
		    	   {
		    		   meal.addItem(new Chicken_sauce());
		    	   }   
			   }
			   if(input.equalsIgnoreCase("chicken cheese"))
			   {
				   System.out.println("How many?\n");
		    	   int n=scn.nextInt();
		    	   for(int i=0;i<n;i++)
		    	   {
		    		   meal.addItem(new Chicken_cheese());
		    	   }   
			   }if(input.equalsIgnoreCase("beef patty"))
			   {
				   System.out.println("How many?\n");
		    	   int n=scn.nextInt();
		    	   for(int i=0;i<n;i++)
		    	   {
		    		   meal.addItem(new Chicken_patty());
		    	   }   
			   }if(input.equalsIgnoreCase("beef sauce"))
			   {
				   System.out.println("How many?\n");
		    	   int n=scn.nextInt();
		    	   for(int i=0;i<n;i++)
		    	   {
		    		   meal.addItem(new Beef_sauce());
		    	   }   
			   }if(input.equalsIgnoreCase("beef cheese"))
			   {
				   System.out.println("How many?\n");
		    	   int n=scn.nextInt();
		    	   for(int i=0;i<n;i++)
		    	   {
		    		   meal.addItem(new Beef_cheese());
		    	   }   
			   }
		   }
		   scn.close();
		    	 
		   return meal;
	   }
	   
	}
