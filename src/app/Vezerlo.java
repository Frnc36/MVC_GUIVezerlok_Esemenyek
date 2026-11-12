package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class Vezerlo {

    private Nezet nezet;

    public Vezerlo(Nezet nezet) {
        this.nezet = nezet;

        JCheckBox chb = nezet.getChB();
        chb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Kattintás!: actionPerformed");
                nezet.megjelenit("Kattintás!: actionPerformed");
            }
        });

    }

}
