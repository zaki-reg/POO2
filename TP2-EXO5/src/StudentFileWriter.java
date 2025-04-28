import java.io.FileOutputStream;
import java.io.IOException;

public class StudentFileWriter {
    public static void main(String[] args) {

        Student s1 = new Student("zakaeia", "algiers", "computer science");
        Student s2 = new Student("hachem", "oran", "mathematics");
        Student s3 = new Student("rami", "constantine", "biology");
        Student s4 = new Student("lina", "annaba", "physics");
        Student s5 = new Student("yacine", "tlemcen", "chemistry");

        String home = System.getProperty("user.home");
        String filePath = home + "/Documents/students.txt";

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            s1.writeInFile(fos);
            s2.writeInFile(fos);
            s3.writeInFile(fos);
            s4.writeInFile(fos);
            s5.writeInFile(fos);
            System.out.println("Data successfully written to " + filePath + "!");
        } catch (IOException e) {
            System.err.println("An error occurred during file writing: " + e.getMessage());
            e.printStackTrace();
        }
    }
}