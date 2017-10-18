import javax.swing.*;

// Nils E Lindfors TE15
// 2017-09-06
// 21:37
public class kryptModel {


    static String pathST = "No Path has been inserted";
    static String nyckelST = "No key has been inserted";

    public static void Enkrypta() {

        FileKopiera.TextCopy(pathST,nyckelST,1);
       // Kryptera.kryptera(nyckelST,FileKopiera.TextCopy(pathST));

    }

    public static void Dekrypta() {

        FileKopiera.TextCopy(pathST,nyckelST,0);

    }

    public static void nyckelGet() {

        nyckelST = JOptionPane.showInputDialog("Insert key");
    }

    public static void pathGet() {
        pathST = JOptionPane.showInputDialog("Insert path") + ".txt";


    }
}
