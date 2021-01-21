import java.io.File;
import java.io.IOException;

public class FileExample {
	 public static void main(String[] args) throws IOException { 
		 String workingDir = System.getProperty("user.dir");
		    File dir = new File(workingDir); 

		    //dir.mkdir(); 

		    String dirPath = dir.getPath(); 
		    System.out.println("Diectory Path: " + dirPath); 

		    // lets create a new file 
		    String fileName = "hello.txt"; 
		    File file = new File(dirPath + File.separator + fileName); 
		    file.createNewFile(); 

		    String filePath = file.getPath(); 
		    System.out.println("File Path: "+ filePath);
		  } 
}