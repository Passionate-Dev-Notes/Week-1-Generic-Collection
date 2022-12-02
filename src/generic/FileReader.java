package generic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
	public MapData readFile(String fileLoc) {
		MapData mapObj=new MapData();
		try {  
            // Create f1 object of the file to read data  
            File f1 = new File(fileLoc);    
            Scanner dataReader = new Scanner(f1);
            while (dataReader.hasNextLine()) {  
                String fileData = dataReader.nextLine();  
                String[] array=fileData.split("\t");
                UserLogData usrData=new UserLogData(array[0],array[1],array[2]);
                
                mapObj.createMap(usrData.getName(), usrData);
                  
            }  
           
            dataReader.close();  
        } catch (FileNotFoundException exception) {  
            System.out.println("Unexcpected error occurred!");  
            exception.printStackTrace();  
        } 
		return mapObj;
	}

}
