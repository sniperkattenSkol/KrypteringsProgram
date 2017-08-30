// Nils E Lindfors TE15 
// 2017-08-30
// 13:26
public class CMDInput {

    public static void argCMD(String [] argu) {
        if (argu.length == 0) {
            System.out.println("Programmet vet inte vad det ska göra! Avbryter...");
        } else if (argu.length == 1) {
            System.out.println("Så du säger " + argu[0]);
        } else if (argu.length == 2) {
            int z = 0;
            int i = 0;
            for (; i < argu.length; i++) {
                try {
                    z += Integer.parseInt(argu[i]);
                } catch (NumberFormatException e)  {
                    //Gör inget
                }
            }
            //Om inget av ARGS är ett tal så skriver den ut att ARGS måste vara ett tal.
            if (z > 0) {
                System.out.println("Summan: " + z);
            } else {
                System.out.println("Arg/Args must be A number");
            }
        } else if (argu.length == 3) {
            System.out.print(argu[2] + " " + argu[1] + " " + argu[0]);
            //Om 4 eller mer ARGS finns så skriver den ut detta.
        } else if (argu.length >= 4) {
            System.out.print("Jag orkar inte, jag stänger ner");
        }
    }

    public static void main(String[] args) {
        argCMD(args);
    }


}


