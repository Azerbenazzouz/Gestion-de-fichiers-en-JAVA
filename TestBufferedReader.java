import java.io.*;

public class TestBufferedReader {
    public static void main(String args[]) {
        try {
            String ligne;
            BufferedReader bfr = new BufferedReader(new FileReader("FichierTest.txt"));
            while ((ligne = bfr.readLine()) != null) {
                System.out.println(ligne);
            }
            bfr.close();
        } catch (IOException e) {
            System.err.println("Erreur lecture");
        }
    }
}
