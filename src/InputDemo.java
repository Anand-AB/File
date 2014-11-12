import java.io.FileInputStream;
import java.io.IOException;


public class InputDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int size;
		try { FileInputStream f=new FileInputStream("src/InputDemo.java");
			System.out.println("Total available bytes "+(size=f.available()));
			int n=size/40;
			System.out.println("First "+n +" bytes of the file one read() at a time ");
			for (int i = 0; i < n; i++) {
				System.out.print((char) f.read());
			}
			System.out.println("Still Available "+f.available());
			System.out.println("Reading the text "+n+" with one read(b[])");
			byte b[]=new byte[n];
			if(f.read(b)!=n){
				System.err.println("couldn't read "+n+" bytes.");
			}
			System.out.println(new String(b,0,n));
			System.out.println("\nStill Available: "+(size=f.available()));
			System.out.println("Skipping half of remaining bytes with skip()");
			f.skip(size/2);
			System.out.println("Still Available: "+f.available());
			System.out.println("Reading "+n/2+" into the end of Array");
			if(f.read(b,n/2,n/2)!=n/2){
				System.err.println("couldn't read "+n/2+" bytes.");
			}
			System.out.println(new String(b,0,b.length));
			System.out.println("\nStill Available: "+f.available());
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println("I/o Error: "+e);
		}

	}

}
