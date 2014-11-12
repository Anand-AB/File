import java.io.FileOutputStream;
import java.io.IOException;


public class OutputDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String source="Anand Ab Ktda@ gmail. com \n "+" mobile: 8086691243 \n"+" Kattakad Trivandrum.";
		byte buf[]=source.getBytes();
		FileOutputStream f0=null;
		FileOutputStream f1=null;
		FileOutputStream f2=null;
		try{
			f0=new FileOutputStream("File1.txt");
			f1=new FileOutputStream("File2.txt");
			f2=new FileOutputStream("File3.txt");
			for(int i=0;i<buf.length;i+=2) f0.write(buf[i]);
			f1.write(buf);
			f2.write(buf,buf.length/4,buf.length/4);
		}catch(IOException e){
			System.out.println("An i/o error occured ");
		}finally{
			try{
				if(f0!=null) f0.close();
			}catch(IOException e){
				System.out.println("Error closing file1.txt");
			}
			try{
				if(f1!=null) f0.close();
			}catch(IOException e){
				System.out.println("Error closing file2.txt");
			}
			try{
				if(f2!=null) f0.close();
			}catch(IOException e){
				System.out.println("Error closing file3.txt");
			}
		}
	}

}
