package model;
import java.util.ArrayList;
import entity.entity_obat;
public class model_obat implements model_interface {
    private ArrayList<entity_obat> data_obat;
    public model_obat () {
        data_obat= new ArrayList<>();
    }
    public ArrayList<entity_obat> getData_obat(){
        return data_obat;
    }
    public void  read()
    {

    }
    public void create(Object x ) {
        data_obat.add((entity_obat) x);
    }
    public void update(int index, Object x) {

        data_obat.set(index, (entity_obat) x);
    }
    public void delete(int index) {
        data_obat.remove(index);
    }

}