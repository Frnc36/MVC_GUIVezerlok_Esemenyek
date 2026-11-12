package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Action;
import javax.swing.JButton;
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

        chb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    nezet.megjelenit("Kiválasztva");
                }else{
                    nezet.megjelenit("Nincs Kiválasztva");
                }
            }
        });

        JButton btn = nezet.getBtn();
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nezet.checkBoxAktiv();
            }
        });

    }

}
