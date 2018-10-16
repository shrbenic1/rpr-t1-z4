package ba.unsa.etf.rpr;

public class Student {
    private String ime, prezime;
    private int brojIndexa;

    public Student (String ime, String prezime, int brojIndexa) {
        this.ime=ime;
        this.prezime=prezime;
        this.brojIndexa=brojIndexa;
    }
    public String getIme() {
        return ime;
    }
    public String getPrezime() {
        return prezime;
    }
    public int getBrojIndexa() {
        return brojIndexa;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    public void setBrojIndexa(int brojIndexa) {
        this.brojIndexa = brojIndexa;
    }
    public String toString() {
        String s = "";
        System.out.println(prezime + " " + ime + " (" + brojIndexa + ")");
        return s;
    }
}
