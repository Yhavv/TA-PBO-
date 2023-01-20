package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guimenu {
    JFrame LogReg = new JFrame();
    JFrame logreg = new JFrame();
    JLabel top;
    JButton btnadmin,btnobat;

    public guimenu() {
        LogReg.setSize(900,600);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.pink);
        top = new JLabel("<<< MENU >>>");
        top.setBounds(270,30,700,40);
        top.setFont(new Font("Times New Roman", Font.BOLD,40));
        LogReg.add(top);

        btnadmin = new JButton("Data Admin");
        btnadmin.setBounds(270,150,300,50);
        btnadmin.setBackground(Color.GREEN);
        LogReg.add(btnadmin);

        btnobat = new JButton("Data OBAT");
        btnobat.setBounds(270,250,300,50);
        btnobat.setBackground(Color.GREEN);
        LogReg.add(btnobat);

        btnobat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LogReg.dispose();
                guiobat g_obat = new guiobat();
            }
        });
    }



}
