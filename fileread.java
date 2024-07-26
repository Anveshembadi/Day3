import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class fileread {
    public static void main(String[] args) throws IOException {
        File f = new File("./sample.txt");
        if (!f.exists()) {
            f.createNewFile();
        }
        FileInputStream fi = new FileInputStream(f);
        int ascii;
        String text = "";

        while ((ascii = fi.read()) != -1) {
            text += String.valueOf((char) ascii);

        }
        System.out.print(text);
        fi.close();
    }
}
