package algorithim;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class CountRowsInCsvAndIncrementNumbers {

public static void main(String[] args) {
    	
    	String fl="/home/harishankar/Downloads/ExportPartyCsv.csv";
    	
    	
    	try {
			System.out.println(count(fl));
			int it=count(fl) - 1;
			System.out.println(it);
			
			String incrementNumber = "";
			// This will make automatic increment numbers
	        for(int i=1; i<=it; i++){
	            if(i==0)
	                incrementNumber = String.valueOf(i);
	            else
	                incrementNumber = incrementNumber +", "+i;
	        }
	        System.out.println("Automatically Increment :"+incrementNumber);
		} catch (IOException e) {
			e.printStackTrace();
		}
     }

    public static int count(String filename) throws IOException {
        InputStream is = new BufferedInputStream(new FileInputStream(filename));
        try {
        byte[] c = new byte[1024];
        int count = 0;
        int readChars = 0;
        boolean empty = true;
        while ((readChars = is.read(c)) != -1) {
            empty = false;
            for (int i = 0; i < readChars; ++i) {
                if (c[i] == '\n') {
                    ++count;
                }
            }
        }
        return (count == 0 && !empty) ? 1 : count;
        } finally {
        is.close();
       }
    }
}
