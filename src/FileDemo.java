import java.io.File;

public class FileDemo {

	static void p(String s){
		System.out.println(s);
	}

	public static void main(String[] args) {
		File f1=new File("one.txt");
		p("File Name: "+f1.getName());
		p("Path: "+f1.getPath());
		p("Abs Path: "+f1.getAbsolutePath());
		p("Parent: "+f1.getParent());
		p((f1.exists()?"exists":"Does not exists"));
		p((f1.canWrite()?"Writable":"not writable"));
		p((f1.canRead()?"Readable":"Does not Redable "));
		p("is "+(f1.isDirectory()?"":"not a directory"));
		p((f1.isFile()?"normal File":"Does not file"));
		p((f1.isAbsolute()?"Absolute":"Does not absolute"));
		p("File size: "+f1.length()+" Bytes");
	}

}
