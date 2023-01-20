package view;

import controller.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class guiobat {
    public static controller_obat c_obat = new controller_obat();
    allObject objall = new allObject();
    JFrame Obat = new JFrame();
    JLabel top,tambahbuku,labelnama_obat,labelharga,labeljenis,labeltahun,labeljumlah,labelKodebuku;
    JTextField textnama_obat,textharga,textjenis,texttahun,textjumlah,hapustext;
    JButton btnubahobat,btnhapus,btnback,btntambahobat;
    JTable tabelobat = new JTable();
    JScrollPane scrolobat = new JScrollPane(tabelobat);
    int index;
    public guiobat () {
        Obat.setSize(900,700);
        Obat.setLayout(null);
        Obat.getContentPane().setBackground(Color.blue);
        top = new JLabel("DATA OBAT");
        top.setBounds(130,10,600,50);
        top.setFont(new Font("Times New Roman", Font.BOLD,40));
        Obat.add(top);

        scrolobat.setBounds(300,180,500,270);
        tabelobat.setModel(objall.obat_c.listobat());
        Obat.add(scrolobat);

        labelnama_obat = new JLabel("NAMA OBAT");
        labelnama_obat.setBounds(30,150,100,30);
        Obat.add(labelnama_obat);

        textnama_obat = new JTextField();
        textnama_obat.setBounds(30,180,200,30);
        Obat.add(textnama_obat);

        labelharga = new JLabel("HARGA OBAT");
        labelharga.setBounds(30,210,100,30);
        Obat.add(labelharga);

        textharga = new JTextField();
        textharga.setBounds(30,240,200,30);
        Obat.add(textharga);

        labeljenis = new JLabel("JENIS OBAT");
        labeljenis.setBounds(30,270,100,30);
        Obat.add(labeljenis);

        textjenis = new JTextField();
        textjenis.setBounds(30,300,200,30);
        Obat.add(textjenis);

        btntambahobat = new JButton("Tambah Obat");
        btntambahobat.setBounds(50,470,150,30);
        Obat.add(btntambahobat);

        btnubahobat = new JButton("Ubah Obat");
        btnubahobat.setBounds(50,510,150,30);
        Obat.add(btnubahobat);

        btnhapus = new JButton("Hapus Obat");
        btnhapus.setBounds(50,550,150,30);
        Obat.add(btnhapus);

        btnback = new JButton("back");
        btnback.setBounds(30, 600, 100, 30);
        btnback.setBackground(Color.red);
        Obat.add(btnback);

        Obat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Obat.setVisible(true);
        Obat.setLocationRelativeTo(null);

        btnback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Obat.dispose();
                guimenu g_menu = new guimenu();
                g_menu.LogReg.setVisible(true);
            }
        });

        btntambahobat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    String nama_obat = textnama_obat.getText();
                    int harga =  Integer.valueOf(textharga.getText());
                    String jenis = textjenis.getText();

                    objall.obat_c.create(nama_obat,harga,jenis);
                    JOptionPane.showMessageDialog(null,"Input Obat Sukses","Information", JOptionPane.INFORMATION_MESSAGE);
                    reset();
                    tabelobat.setModel(objall.obat_c.listobat());

                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Fomat penulisan salah","Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } );


        btnubahobat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String nama_obat = textnama_obat.getText();
                    int harga =  Integer.valueOf(textharga.getText());
                    String jenis = textjenis.getText();
                    objall.obat_c.update(index, nama_obat, harga, jenis);
                    JOptionPane.showMessageDialog(null,"Ubah Obat Sukses","Information", JOptionPane.INFORMATION_MESSAGE);
                    reset();
                    tabelobat.setModel(objall.obat_c.listobat());

                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Fomat penulisan salah","Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } );

        tabelobat.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelobat.getSelectedRow();
                index=i;
                textnama_obat.setText(objall.obat_c.listobat().getValueAt(i, 0).toString());
                textharga.setText(objall.obat_c.listobat().getValueAt(i, 1).toString());
                textjenis.setText(objall.obat_c.listobat().getValueAt(i, 2).toString());
            }
        });

        btnhapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{

                    objall.obat_c.delete(index);
                    JOptionPane.showMessageDialog(null,"Hapus Obat Sukses","Information", JOptionPane.INFORMATION_MESSAGE);
                    tabelobat.setModel(objall.obat_c.listobat());
                    reset();
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Fomat penulisan salah","Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

    }
    void reset(){
        textnama_obat.setText(null);
        textharga.setText(null);
        textjenis.setText(null);
    }

    public static void main(String[] args) {
        guiobat g_obat = new guiobat();
        g_obat.Obat.setVisible(true);
    }

}
