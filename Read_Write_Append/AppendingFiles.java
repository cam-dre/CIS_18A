import java.io.*;

public class AppendingFiles {

	public static void main(String[] args) throws IOException {
		String city = "Phoenix";
		
		FileWriter fw = new FileWriter("c:\\x\\data.txt", true);
		PrintWriter outFile = new PrintWriter(fw);
		
		outFile.println(city);
		
		System.out.println("The data has been written to a file.\n");
		outFile.close();

	}

}
