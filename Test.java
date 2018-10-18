import java.io.*;

public class Test{
	public static void main(String[] args){
		
		String fileName = "test.txt";
		String line = null;
		
		// Access to file system
		FileReader fileReader = new FileReader(fileName);
		
		// Buffer our reader
		BufferReader bufferReader = new BufferReader(fileReader);
		
		while((line = bufferReader.readLine()) != null){
			System.out.println(line);
		}
		bufferReader.close();
	}
}