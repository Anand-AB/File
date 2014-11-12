import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//import com.sun.java.util.jar.pack.Package.File;


public class ShowFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		FileInputStream fin;
		
		if(args.length!=1)
		{
			System.out.println("Show Filename");
			return;
		}
		
		try{
			fin=new FileInputStream(args[0]);
			
		}catch(FileNotFoundException e){
			System.out.println("Cannot open File");
			return;
		}
		try{
			do{
				i=fin.read();
				if(i !=-1) System.out.print((char) i);
			} while(i!=-1);
		}catch (IOException e) {
			System.out.println("Error Reading File");
		}
		try{
			fin.close();
		}catch(IOException e){
			System.out.println("Error Closing File");
		}
	}

}
