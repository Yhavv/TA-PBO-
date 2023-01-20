package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class guilogin {
    JFrame LogReg = new JFrame();
    JLabel top,login;
    JTextField textID;
    JLabel labelnpmlogin, labelpasswordlogin;
    JPasswordField passwordlogin;
    JButton buttonlogin, buttonexit;

    public guilogin() {
        LogReg.setSize(700, 700);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.BLUE);
        top = new JLabel("<<< APOTEK ITATS >>>");
        top.setBounds(100, 50, 500, 50);
        top.setFont(new Font("Times New Roman", Font.BOLD, 40));
        LogReg.add(top);
        login = new JLabel("LOGIN");
        login.setBounds(275, 100, 400, 200);
        login.setFont(new Font("Times New Roman", Font.BOLD, 40));
        LogReg.add(login);


        labelnpmlogin = new JLabel("ID");
        labelnpmlogin.setBounds(250, 240, 30, 30);
        LogReg.add(labelnpmlogin);
        textID = new JTextField();
        textID.setBounds(250, 270, 200, 36);
        LogReg.add(textID);
        labelpasswordlogin = new JLabel("Password");
        labelpasswordlogin.setBounds(250, 320, 100, 30);
        LogReg.add(labelpasswordlogin);
        passwordlogin = new JPasswordField();
        passwordlogin.setBounds(250, 350, 200, 36);
        LogReg.add(passwordlogin);

        buttonlogin = new JButton("MASOOK");
        buttonlogin.setBounds(290, 410, 100, 40);
        buttonlogin.setBackground(Color.GREEN);
        LogReg.add(buttonlogin);

        buttonexit = new JButton("EXIT");
        buttonexit.setBounds(290, 460, 100, 40);
        buttonexit.setBackground(Color.GREEN);
        LogReg.add(buttonexit);

        buttonexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                LogReg.dispose();
            }
        });

        buttonlogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    allObject all = new allObject();
                    all.admin.dataadmin();
                    all.admin.cekPetugas(textID.getText(), passwordlogin.getText());
                    JOptionPane.showMessageDialog(null,"Selamat Datang di Apotek","information",JOptionPane.INFORMATION_MESSAGE);
                    guimenu objmenu = new guimenu();
                    objmenu.LogReg.setVisible(true);
                    LogReg.dispose();
                } catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"ID atau password salah","information",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });


    }

    public static void main(String[] args) {
        guilogin objek = new guilogin();
        objek.LogReg.setVisible(true);
    }
    
}
