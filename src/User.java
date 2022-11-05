public class User {
    protected String nama;
    protected String email;
    protected String no_hp;

    public String getNama() {
        return this.nama;
    }

    public String getEmail() {
        return email;
    }

    public String getNo_hp() {
        return this.no_hp;
    }

    public void setNama(String a) {
        this.nama = a;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNo_hp(String c) {
        this.no_hp = c;
    }
}
