import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class filereadScan {

    public static void main(String[] args) throws IOException {
        File f = new File("./sample.txt");
        if (!f.exists()) {
            f.createNewFile();
        }
        Scanner sc = new Scanner(f);
        // Scanner sc = new Scanner(new FileInputStream(f));
        String text = "";
        // while (sc.hasNext()) {
        // text += sc.next();
        // text += " ";
        // }
        while (sc.hasNextLine()) {
            text += sc.nextLine() + "\n";

        }

        System.out.print(text);
        sc.close();
    }
}
