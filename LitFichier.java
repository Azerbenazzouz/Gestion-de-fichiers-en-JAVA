import java.io.*;

public class LitFichier {
    public static void main(String args[]) {
        try {
            InputStream s = new FileInputStream("FichierTest.txt");
            byte buffer[] = new byte[s.available()];
            s.read(buffer);
            for (int i = 0; i != buffer.length; i++)
                System.out.print((char) buffer[i] + "\t");
            s.close();
        } catch (IOException e) {
            System.err.println("Erreur lecture");
        }
    }
}
