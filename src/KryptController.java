import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Nils E Lindfors TE15
// 2017-09-06
// 21:38
class kryptController {
    private GUIDesign enkryptView;
    private kryptModel enkryptModel;

    public kryptController(kryptModel enkryptModel, GUIDesign enkryptView){
        this.enkryptView = enkryptView;
        this.enkryptModel = enkryptModel;

        this.enkryptView.knappEnkrypta(new EnkryptaKnappLyssnare());
        this.enkryptView.knappDEkrypta(new DEkryptaKnappLyssnare());
        this.enkryptView.knappNyckel(new NyckelKnappLyssnare());
        this.enkryptView.knappPath(new PathKnappLyssnare());
    }

    private class EnkryptaKnappLyssnare implements ActionListener{
        public void actionPerformed(ActionEvent arg0) {
            enkryptModel.Enkrypta();
        }
    }

    private class DEkryptaKnappLyssnare implements ActionListener{
        public void actionPerformed(ActionEvent arg0) {
            enkryptModel.Dekrypta();
        }
    }
    private class NyckelKnappLyssnare implements ActionListener{
        public void actionPerformed(ActionEvent arg0) {
            enkryptModel.nyckelGet();
        }
    }
    private class PathKnappLyssnare implements ActionListener{
        public void actionPerformed(ActionEvent arg0) {
            enkryptModel.pathGet();
        }
    }
}

