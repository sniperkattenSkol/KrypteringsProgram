import sun.nio.cs.UTF_32;

import java.nio.charset.Charset;

// Nils E Lindfors TE15
// 2017-10-04
// 13:15
public class Kryptera {


    public static String kryptera(String key, String Msg, int one){
        Charset charz = Charset.forName("UTF-8");
        while (key.length() < Msg.length()){
            key += key;
        }
        byte [] lineInbyte = Msg.getBytes(charz);
        byte [] keyInbyte = key.getBytes(charz);
        byte [] bitz = new byte[lineInbyte.length];
            for (int i = 0; i < lineInbyte.length; i++) {
                bitz[i] = (byte) (lineInbyte[i] ^ keyInbyte[i % keyInbyte.length]);
            }

            System.out.println(new String(bitz, charz));
            Msg = new String(bitz, charz);

            for (int i = 0; i < bitz.length; i++) {
                 lineInbyte[i] = (byte) (bitz[i] ^ keyInbyte[i % keyInbyte.length]);
            }

            System.out.println(new String(lineInbyte, charz));
            Msg = new String(lineInbyte, charz) + "    <- dekrypt,, enkrypt ->    " +Msg;


        //Problemet är när jag ska skriva ut med FileKopiera, för när jag dekryptar den direkt efter jag har enkryptat den så fungerar det.
        //Behöver fixa inkodningen i filekopiera

        return Msg;
       /* for (int i=0; i < Msg.length(); i++)
            result += (char)(Msg.charAt(i)^key.charAt(i));
*/
    }


}
