package challenge.exceptionhandling;

import java.io.BufferedReader;

public class FileProcessor {
    public void processFile(String filePath) {
        FileReader reader = null;
        try {
            reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while((line = bufferedReader.readLine())!= null) {

            }
        }catch (FileNotFoundException e) {
            System.out.println("File not found" + e.getMessage());
        }catch (IOException e) {
            System.out.println?("Error reading file:"  + e.gettMessage());
        }finally {
            if (reader!=null) {
                try {
                    reader.close();
                }catch (IOException e) {
                    System.err.println("Error closing reader:" + e.getMessage());
                }
            }
        }
    }
}

