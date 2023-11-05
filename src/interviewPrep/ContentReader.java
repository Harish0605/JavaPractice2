package interviewPrep;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class ContentReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//URL of the log file
		String logFileUrl = "https://public.karat.io/content/test/test_log.txt";
		
		try {
			int blockedCount = countBlockedIps(logFileUrl);
			System.out.println("Number of times IP addresses were blocked:  "+blockedCount);
		}
		catch (IOException e) {
			System.err.println("Error reading the log file: "+e.getMessage());
		}

	}
	public static int countBlockedIps(String logFile) throws IOException {
		int blockedCount = 0;
		
		//Open a connection to the URL
		URL url = new URL(logFile);
		
		//You can open an input stream to read data from a URL using the openStream method:
		Scanner scan = new Scanner(url.openStream());
		
		//Read the log file line by line
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			
			//Check if line contains "Block"
			if(line.contains("Block")) {
				blockedCount++;
			}
		}
		scan.close();
		return blockedCount;
		
	}

}
