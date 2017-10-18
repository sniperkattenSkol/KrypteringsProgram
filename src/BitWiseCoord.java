// Nils E Lindfors TE15 
// 2017-09-20
// 13:22
public class BitWiseCoord {
//BitWiseCoord och innehålla en short, en konstruktor som tar två tal som argument (x och y-
 /*   koordinaten) och fyra metoder: setHigh(int), setLow(int), getHigh() och getLow(). GetHigh()

    returnerar x koordinaten och getLow() returnerar y-koordinaten. Du kan också lägga till en
    toString()-metod så att datatypen kan skrivas ut på ett bra sätt, t.ex. (x, y). */

         short coord = 0;

         public BitWiseCoord(int xcord, int ycord) {


             System.out.println(Integer.toBinaryString(xcord));
             System.out.println(Integer.toBinaryString(ycord));
             xcord = xcord<<8;
             xcord = xcord|ycord;
             coord = (short)xcord;
           System.out.println(coord);
           System.out.println(Integer.toBinaryString(xcord));

         }

    public static void main(String[] args) {
        BitWiseCoord skord = new BitWiseCoord(199, 199);
    }

        public void setHigh(int x) {


         }

        public void setLow(int y) {

            }


/*        public int  getHigh() {

            }

        public int getLow() {


            }

        public String toString(){

        }
*/
}
