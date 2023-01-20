package entity;

public class entity_obat {
    public String nama_obat;
    public int harga;
    public String jenis;
    public entity_obat(String nama_obat,int harga, String jenis){
        this.nama_obat=nama_obat;
        this.harga=harga;
        this.jenis=jenis;
    }
    public entity_obat() {
    }
    public String getNama() {
            return nama_obat;
        }
        public int getHarga() {
            return harga;
        }
        public String getJenis() {
            return jenis;
        }
        public void setNama(String nama_obat) {
            this.nama_obat = nama_obat;
        }
        public void setHarga(int harga) {
            this.harga = harga;
        }
        public void setJenis(String jenis) {
            this.jenis = jenis;
        }
}