package entity;

public class orang {
    protected String nama, password;
    protected String id;

    public orang(String nama, String password, String id)
    {
        this.nama=nama;
        this.password = password;
        this.id=id;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setId(String id) {
        this.id=id;
    }
    public String getId() {
        return id;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
}