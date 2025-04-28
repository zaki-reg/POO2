import java.io.FileOutputStream;
import java.io.IOException;

class Student {
    private String name;
    private String address;
    private String specialty;

    public Student(String name, String address, String specialty) {
        this.name = name;
        this.address = address;
        this.specialty = specialty;
    }
    
    public void writeInFile(FileOutputStream fos) throws IOException {
        String data = this.name + "," + this.address + "," + this.specialty + "\n";
        fos.write(data.getBytes());
    }
}