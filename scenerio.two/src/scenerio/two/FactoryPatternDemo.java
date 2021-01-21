package scenerio.two;
import java.util.Scanner;

public class FactoryPatternDemo {
	public static void main(String[] args) {
	      CoffeeFactory coffeeFactory = CoffeeFactory.getinstance();
	      System.out.println("Menu:\n1. Coffee Master\t2. Coffee Shake(sugar free)\t3. Coffee king\n");
	      
	      String input=null;
	      Scanner scn =new Scanner(System.in);
	      float  total=0;
	      System.out.println("Enter order(If done ,write No)\n");
	      while(true)
	      {
	    	  input=scn.nextLine();
	    	  if(input.equalsIgnoreCase("no"))
	    		  break;
	          if(input.equalsIgnoreCase("master"))
	    	  {
	    		  Coffee A=coffeeFactory.getCoffee("coffeeA");
	    		  System.out.println("How many?\n");
	    	      int n=scn.nextInt();
	    		  System.out.println(A.coffee_ingridients()+ "\t" + "Price" + (float)n*A.price());
	    		  total=total+(float)n*A.price();	    	  
	    	  } 
	    	  
	    	  if(input.equalsIgnoreCase("shake"))
	    	  {
	    		  Coffee A=coffeeFactory.getCoffee("coffeeA");
	    		  System.out.println("How many?\n");
	    	      int n=scn.nextInt();
	    		  System.out.println(A.coffee_ingridients()+ "\t" + "Price" + (float)n*A.price());
	    		  total=total+(float)n*A.price();	    	  
	    	  } 
	    	  if(input.equalsIgnoreCase("king"))
	    	  {
	    		  Coffee A=coffeeFactory.getCoffee("coffeeA");
	    		  System.out.println("How many?\n");
	    	      int n=scn.nextInt();
	    		  System.out.println(A.coffee_ingridients()+ "\t" + "Price" + (float)n*A.price());
	    		  total=total+(float)n*A.price();	    	  
	    	  }
	    	  
	    	  
	      }
	      
	      
	      System.out.println("Total Price:\t\t\t"+total);
	      
	      
	      
	    
	      
	   }

}
