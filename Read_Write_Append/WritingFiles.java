import java.io.*;
public class WritingFiles {
	public static void main(String[] args) throws IOException {
		String city = "Los Angeles";
		
		PrintWriter outFile = new PrintWriter("c:\\x\\data.txt");
		outFile.println(city);
		
		System.out.println("The data has been written to a file.\n");
		outFile.close();
		
		//city = "Los Angeles";
		//outFile.println(city);
		//outFile.close();
	}

}
