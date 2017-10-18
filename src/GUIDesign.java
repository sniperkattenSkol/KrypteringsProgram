// Nils E Lindfors TE15 
// 2017-09-06
// 19:05

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

public class GUIDesign extends JFrame{
    private JButton enkrpyta = new JButton("Enkrpyta");
    private JButton dekrpyta = new JButton("Dekrpyta");
    private JButton nyckel = new JButton("Välj nyckel");
    private JButton path = new JButton("Pathen till filen, .txt behöves ej, C:/...testfile.txt");


    GUIDesign() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 250);

        JPanel panelEtt = new JPanel();
        panelEtt.setLayout(new GridLayout(2, 2, 0, 0));
        panelEtt.add(enkrpyta);
        panelEtt.add(dekrpyta);
        panelEtt.add(nyckel);
        panelEtt.add(path);

        this.add(panelEtt);
    }

    void knappEnkrypta(ActionListener lyssnaEnkrypta) {
             enkrpyta.addActionListener(lyssnaEnkrypta);
     }
    void knappDEkrypta(ActionListener lyssnaDEkrypta) {
        dekrpyta.addActionListener(lyssnaDEkrypta);
    }
    void knappNyckel(ActionListener lyssnaNyckel) {
        nyckel.addActionListener(lyssnaNyckel);
    }
    void knappPath(ActionListener lyssnaPath) {
        path.addActionListener(lyssnaPath);
    }

}

