package controller;
import entity.entity_obat;
import model.model_obat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import view.allObject;


public class controller_obat {
    public model_obat objobat = new model_obat();
    public controller_obat() {

    }

    public ArrayList<entity_obat> read() {
        return  objobat.getData_obat();
    }
    public void create(String nama_obat, int harga, String jenis ) {
        entity_obat obat = new entity_obat();
        obat.setNama(nama_obat);
        obat.setHarga(harga);
        obat.setJenis(jenis);

        objobat.create(obat);
    }
    public void delete(int index) {
        objobat.delete(index);
    }
    public void update(int index, String nama_obat, int harga, String jenis) {
        entity_obat obat = new entity_obat();
        obat.setNama(nama_obat);
        obat.setHarga(harga);
        obat.setJenis(jenis);

        objobat.update(index, obat);
    }


    public DefaultTableModel listobat() {
        DefaultTableModel dtmlistobat = new DefaultTableModel();
        Object[] kolom = {"Nama obat" , "Harga ", "Jenis"};
        dtmlistobat.setColumnIdentifiers(kolom);
        controller_obat c_obat = new controller_obat();
        int size = c_obat.read().size();
        for(int i=0; i<size; i++)
        {
            Object [] obat = new Object[10];
            obat[0] = c_obat.read().get(i).getNama();
            obat[1] = c_obat.read().get(i).getHarga();
            obat[2] = c_obat.read().get(i).getJenis();
            dtmlistobat.addRow(obat);
        }
        return  dtmlistobat;
    }
}
