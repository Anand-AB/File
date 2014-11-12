import java.io.FileOutputStream;
import java.io.IOException;


public class Output {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String source="All Indian Mohanlal Fans Association ";
		byte buf[]=source.getBytes();
		FileOutputStream f0=null;
		try{
			f0=new FileOutputStream("FileOriginal.txt");
			f0.write(buf);
		}catch(IOException e){
			System.out.println("An i/o error occured ");
		}finally{
			try{
				if(f0!=null) f0.close();
			}catch(IOException e){
				System.out.println("Error closing file1.txt");
			}
		}
	}

}