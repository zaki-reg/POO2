import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {
        System.out.println("Start Reading the content from the File:");
        readFile("D:\\myfile.txt");
        System.out.println("End of reading");
        System.out.println("End of the program");
    }

    static void readFile(String src) {
        try (FileInputStream f = new FileInputStream(src)) {
            int r;
            while ((r = f.read()) != -1) {
                System.out.print((char) r);
            }
            System.out.println(); 
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found at " + src);
        } catch (IOException e) {
            System.out.println("Error while reading the file: " + e.getMessage());
        }
    }
}
