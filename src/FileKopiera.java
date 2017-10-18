import java.io.*;
import java.nio.charset.Charset;


// 2017-10-04
// 14:41
public class FileKopiera {

    private static void BinaryCopy(String fil) {
        DataInputStream input;
        DataOutputStream output;
        try {
            input = new DataInputStream(new BufferedInputStream(new FileInputStream(fil)));
            output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("KopiaAv" + fil)));
        } catch (FileNotFoundException e) {
            input = null;
            output = null;
            e.printStackTrace();
        }
        try {
            while (true) {
                byte b = input.readByte();
                output.write(b);
            }
        } catch (IOException e) {
            System.out.println("Done");
        }
        try {
            output.flush();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void TextCopy(String fil,String key, int one) {
        PrintWriter utFil;
        BufferedReader inFil;
        Charset charz = Charset.forName("UTF-8");
        try {
            FileWriter fw = new FileWriter("x" + fil);
            BufferedWriter bw = new BufferedWriter(fw);
            utFil = new PrintWriter(bw);
            FileReader fr = new FileReader(fil);
            inFil = new BufferedReader(fr);

            String line = inFil.readLine();
            while (line != null) {
               line = Kryptera.kryptera(key, line,one);
                utFil.println(line);
                line = inFil.readLine();
            }
            utFil.flush();
            utFil.close();
            inFil.close();

        } catch (IOException e) {
            System.out.println("Error when opening files");
            e.printStackTrace();
        }

    }
}


