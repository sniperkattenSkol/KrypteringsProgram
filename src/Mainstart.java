// Nils E Lindfors TE15 
// 2017-10-04
// 14:30
public class Mainstart {
    public static void main(String[] args) {
         GUIDesign enkryptView = new GUIDesign();
         kryptModel enkryptModel = new kryptModel();
         kryptController enkryptControll = new kryptController(enkryptModel, enkryptView);

         enkryptView.setVisible(true);
    }
}
