import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.net.*;


public class lineSearcher {
    public lineSearcher(int lineNumber) {

    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int l = scan.nextInt();
        BufferedReader br = new BufferedReader(new FileReader("src/hamlet.txt"));
        int startLine = l - 2;
        int endLine = l + 2;
        String line;
        int lineIndex = 0;
        boolean found = false;
        while ((line = br.readLine()) != null) {
            if (lineIndex >= startLine && lineIndex <= endLine) {
                System.out.println(line);
            }
            if (lineIndex == l) {
                found = true;
            }
            lineIndex++;
        }
        if (!found) {
            System.out.println("Sorry! Line " + l + " does not exist.");
        }
    }
}
