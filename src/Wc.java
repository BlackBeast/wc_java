import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class Wc {
	private static String readFile(String fileName) throws IOException{
		File file = new File(fileName);
		FileReader fr = new FileReader(file);
		char[] content = new char[(int)file.length()];
		fr.read(content);
		fr.close();
		return new String(content);
	}
	public static void main(String[] args) throws IOException{
		String fileName = args[0];
		System.out.println(fileName);
		String content = readFile(fileName);

		System.out.println(content);
		WcLib wc = new WcLib();
	}
	
}