package controller;
import java.util.ArrayList;
import model.model_admin;
import entity.entity_admin;
import view.*;


public class controller_admin {
    public model_admin objadmin = new model_admin();
    public ArrayList<entity_admin> read() {
        return  objadmin.getdata_admin();
    }
    public void create(entity_admin admin) {
        objadmin.create(admin);
    }
    public void delete(int index) {
        objadmin.delete(index);
    }
    public void update(int index, entity_admin admin) {
        objadmin.update(index, admin);
    }
    public int cekPetugas(String id, String password){
        int loop = 0;
        for(entity_admin petugasEntity : objadmin.getdata_admin())
            if (petugasEntity.getId().equals(id) && petugasEntity.getPassword().equals(password)) {
                break;
            } else {
                loop++;
            }
        return loop;
    };

    public void dataadmin(){
        objadmin.create(new entity_admin("yhaw","123", "01"));
    }

}