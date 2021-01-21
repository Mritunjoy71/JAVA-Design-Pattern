package java;

import java.awt.List;
import java.util.ArrayList;

public class main {
	 public static void print(ArrayList<Object> lst) {  // accept List of Objects only,
         // not List of subclasses of object
         for (Object o : lst) {
             System.out.println(o);
         }
 }
	 public static void main(String[] args) {
         ArrayList<Object> objLst = new ArrayList<Object>();
         objLst.add(new Integer(55));
         print(objLst);   // matches

         
      }

}
