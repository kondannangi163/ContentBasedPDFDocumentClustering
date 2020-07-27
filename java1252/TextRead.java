import java.io.FileReader;
import java.io.IOException;
 

public class TextRead {
 
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("Sudeep Nagarkar.txt");
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