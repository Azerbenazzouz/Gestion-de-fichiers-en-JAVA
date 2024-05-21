import java.io.*;

class Ecrire {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("essai.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Ceci est mon fichier \n");
            bw.newLine();
            bw.write("Il est à moi...");
            bw.close();
        } catch (Exception e) {
            System.out.println("Erreur " + e);
        }
    }
}
