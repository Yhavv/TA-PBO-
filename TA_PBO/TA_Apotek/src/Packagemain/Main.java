package Packagemain;

import controller.*;
import entity.*;
import java.util.Scanner;
import view.*;

public class Main {
    public static void main(String[] args) {
//        menu objmenu = new menu();
//        objmenu.pilihmenu();
        guilogin g_login = new guilogin();
    }
}

class classadmin {
    //    controller_admin admin = new controller_admin();
//    Scanner input = new Scanner(System.in);
//    void create(){
//        admin.create(new entity_admin("WAHYU","sda", "101"));
//        admin.create(new entity_admin("ROMADHON", "sby", "102"));
//    }
//
//    void read() {
//        if (admin.objadmin.getdata_admin().size() > 0) {
//            int nomorurut = 0;
//            System.out.println("<<<<< DATA ADMIN >>>>>");
//            for (int i = 0; i < admin.objadmin.getdata_admin().size(); i++) {
//                nomorurut++;
//                System.out.println("index ke "+nomorurut);
//                System.out.println("Nama = "+ admin.objadmin.getdata_admin().get(i).getNama());
//                System.out.println("Password = "+ admin.objadmin.getdata_admin().get(i).getPassword());
//                System.out.println("ID = " + admin.objadmin.getdata_admin().get(i).getId());
//                System.out.println("=======================");
//                System.out.println(" ");
//            }
//        } else {
//            System.out.println("Data tidak ada");
//        }
//    }
//    void update() {
//        if(admin.objadmin.getdata_admin().size()>0)
//        {
//            int nomor;
//            read();
//            System.out.println("Pilih index admin yang ingin diubah : ");
//            nomor = input.nextInt();
//            System.out.print("Masukkan nama baru : ");
//            String Nama = input.next();
//            System.out.print("Masukkan password baru : ");
//            String Password = input.next();
//            System.out.print("Masukkan id baru : ");
//            String id = input.nextLine();
//            input.nextLine();
//
//            admin.update(nomor-1, new entity_admin(Nama,Password,id));
//            System.out.println("Data Admin pada index tersebut telah diubah");
//        } else {
//            System.out.println("Data kosong");
//        }
//    }
//    void delete(){
//        if(admin.objadmin.getdata_admin().size()>0)
//        {
//            read();
//            int nomor;
//            System.out.println("pilih index admin yang ingin dihapus ");
//            nomor = input.nextInt();
//
//            admin.delete(nomor-1);
//            System.out.println("Data berhasil dihapus ");
//        } else {
//            System.out.println("Data kosong");
//        }
//    }
//
//    void login() {
//        classobat objobat = new classobat();
//        System.out.println("Input Id : ");
//        String id = input.nextLine();
//        System.out.println("Input Pass : ");
//        String password = input.next();
//        boolean cekLogin = false;
//        for (int i = 0; i < admin.objadmin.getdata_admin().size(); i++) {
//            if (id.equals(admin.objadmin.getdata_admin().get(i).getId()) && password.equals(admin.objadmin.getdata_admin().get(i).getPassword()))
//            {
//                cekLogin = true;
//            }
//        }
//        if (cekLogin) {
//            System.out.println("Haloooo ADMIN");
//            int pilih;
//            do {
//                System.out.println();
//                System.out.println("<<< USER LOGGED IN >>>");
//                System.out.println("1. Lihat admin");
//                System.out.println("2. Update admin");
//                System.out.println("3. Hapus admin");
//                System.out.println("4. Menu Obat");
//                System.out.println("0. Back");
//                System.out.println("Pilih: ");
//                pilih = input.nextInt();
//
//                switch (pilih) {
//                    case 1 -> read();
//                    case 2 -> update();
//                    case 3 -> delete();
//                    case 4 -> objobat.menuobat();
//                }
//            } while (pilih != 0);
//        }
//    }
//}
//class classobat {
//    controller_obat obat = new controller_obat();
//    Scanner input = new Scanner(System.in);
//    void createobat() {
//
//        System.out.print("Masukkan nama obat: ");
//        String nama_obat = input.next();
//        System.out.print("Harga : ");
//        int Harga = input.nextInt();
//        input.nextLine();
//        System.out.print("Jenis obat : ");
//        String Jenis = input.next();
//        input.nextLine();
//
//        obat.create(new entity_obat(nama_obat,Harga,Jenis));
//        System.out.println("Data obat disimpan");
//    }
//    void readobat() {
//        if (obat.objobat.getData_obat().size() > 0) {
//            int nomorurut = 0;
//            System.out.println("<<<<< DATA OBAT >>>>>");
//            for (int i = 0; i < obat.objobat.getData_obat().size(); i++) {
//                nomorurut++;
//                System.out.println("index ke "+nomorurut);
//                System.out.println("Nama obat = "+obat.objobat.getData_obat().get(i).getNama());
//                System.out.println("harga = "+obat.objobat.getData_obat().get(i).getHarga());
//                System.out.println("Jenis obat = " +obat.objobat.getData_obat().get(i).getJenis());
//                System.out.println("=======================");
//                System.out.println(" ");
//            }
//        } else {
//            System.out.println("Data tidak ada");
//        }
//    }
//    void updateobat() {
//        if(obat.objobat.getData_obat().size()>0)
//        {
//            int nomor;
//            readobat();
//            System.out.println("Pilih index obat yang ingin diubah : ");
//            nomor = input.nextInt();
//            System.out.print("Masukkan nama obat baru : ");
//            String nama_obat = input.next();
//            System.out.print("Masukkan harga obat baru : ");
//            int Harga = input.nextInt();
//            input.nextLine();
//            System.out.print("Masukkan Jenis obat baru : ");
//            String Jenis = input.next();
//            input.nextLine();
//
//            obat.update(nomor-1, new entity_obat(nama_obat, Harga,Jenis));
//            System.out.println("Data obat telah diubah");
//        } else {
//            System.out.println("Data kosong");
//        }
//    }
//    void deleteobat(){
//        if(obat.objobat.getData_obat().size()>0)
//        {
//            readobat();
//            int nomor;
//
//            System.out.println("pilih index obat yang ingin dihapus ");
//            nomor = input.nextInt();
//
//            obat.delete(nomor-1);
//            System.out.println("Data berhasil dihapus ");
//        } else {
//            System.out.println("Data kosong");
//        }
//    }
//    void menuobat() {
//        int pilih;
//        do {
//            System.out.println("CRUD OBAT");
//            System.out.println("1. Tambah obat ");
//            System.out.println("2. Lihat obat");
//            System.out.println("3. Update obat");
//            System.out.println("4. Hapus obat");
//            System.out.println("Pilih: ");
//            pilih = input.nextInt();
//
//            switch (pilih) {
//                case 1:
//                    createobat();
//                    break;
//                case 2:
//                    readobat();
//                    break;
//                case 3:
//                    updateobat();
//                    break;
//                case 4:
//                    deleteobat();
//                    break;
//            }
//        } while (pilih != 5);
//    }
//}
//class menu {
//        Scanner input = new Scanner(System.in);
//        void pilihmenu() {
//            classadmin admin = new classadmin();
//            admin.create();
//
//            int pilihan;
//            do {
//                System.out.println("============");
//                System.out.println("1. LOGIN ");
//                System.out.println("0. Exit");
//                System.out.println("Pilih : ");
//                pilihan = input.nextInt();
//                input.nextLine();
//                System.out.println();
//
//                switch (pilihan) {
//                    case 1 -> admin.login();
//                }
//            } while (pilihan != 0);
//        }
//}
//

}