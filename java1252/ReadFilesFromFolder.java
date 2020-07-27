import java.io.File;
import java.io.FileReader;
import java.io.IOException;
 


public class ReadFilesFromFolder {
  public static File folder = new File("E:/Novels");
  static String temp = "";

  public static void main(String[] args) {
    
    System.out.println("Reading files under the folder "+ folder.getAbsolutePath());
    listFilesForFolder(folder);
   
  }

  public static void listFilesForFolder(final File folder) {

    for (final File fileEntry : folder.listFiles()) {
      if (fileEntry.isDirectory()) {
        // System.out.println("Reading files under the folder "+folder.getAbsolutePath());
        listFilesForFolder(fileEntry);
      } else {
        if (fileEntry.isFile()) {
          temp = fileEntry.getName();
          if ((temp.substring(temp.lastIndexOf('.') + 1, temp.length()).toLowerCase()).equals("txt"))
            System.out.println("File= " + folder.getAbsolutePath()+ "\\" + fileEntry.getName());
          String s=fileEntry.getName();
          
        try {
            FileReader reader = new FileReader("s.txt");
            int character;
 
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
        }

      }
    }

  }
}