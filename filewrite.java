import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filewrite {
    public static void main(String[] args) throws IOException {
        File f = new File("./sample.txt");
        if (!f.exists()) {
            f.createNewFile();
        }
        String existText = new String();
        // String line ="";
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {
            existText += sc.nextLine() + "\n";
        }
        String s = "Hello Anvesh ! Its GOod To see you here.";
        // FileOutputStream fo = new FileOutputStream(f);
        // fo.write(null) ; // Write method of FileInputStream class only takes byte and
        // byte array and int format only.
        FileWriter fw = new FileWriter(f);
        fw.write(existText + s);
        fw.close();

    }
}
