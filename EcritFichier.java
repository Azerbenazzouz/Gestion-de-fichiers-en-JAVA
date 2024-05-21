import java.io.*;

public class EcritFichier {
    static public void main(String args[]) {
        String Chaine = "Bonjour";
        try {
            FileOutputStream f = new FileOutputStream("FichierTest.txt");
            f.write(Chaine.getBytes());
            f.close();
        } catch (IOException e) {
            System.err.println("Erreur ecriture");
        }
    }
}
