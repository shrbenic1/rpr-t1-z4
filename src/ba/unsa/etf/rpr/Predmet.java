package ba.unsa.etf.rpr;

public class Predmet {
    private Student[] niz;
    private String nazivPredmeta;
    private int sifraPredmeta;
    private int maxBrojStudenata;

    public Predmet(String nazivPredmeta, int sifraPredmeta, int maxBrStudenata) {
        this.nazivPredmeta = nazivPredmeta;
        this.sifraPredmeta = sifraPredmeta;
        this.maxBrojStudenata = maxBrStudenata;
        niz = new Student [maxBrStudenata];
    }
    public void upisi(Student s) {
        for(int i = 0; i< maxBrojStudenata; i++) {
            if(niz[i]==null) {
                niz[i]=s;
                break;
            }
        }
    }
    public void ispisi(Student s) {
        for(int i = 0; i< maxBrojStudenata; i++) {
            if(niz[i].equals(s)) {
                niz[i]=null;
                break;
            }
        }
    }
    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }
    public void setSifraPredmeta(int sifraPredmeta) {
        this.sifraPredmeta = sifraPredmeta;
    }
    public String getNazivPredmeta() {
        return nazivPredmeta;
    }
    public int getSifraPredmeta() {
        return sifraPredmeta;
    }
    public int getMaxBrojStudenata() {
        return maxBrojStudenata;
    }
    public String toString() {
        String s = "";
        boolean a = false;
        for(int i = 0; i< maxBrojStudenata; i++) {
            if(niz[i]==null) {
                a = true;
                continue;
            }
            if(a) {
                System.out.print(i + ".");
            }
            else {
                System.out.print(i+1 + ".");
            }
            System.out.println(niz[i]);
        }
        return s;
    }
}
