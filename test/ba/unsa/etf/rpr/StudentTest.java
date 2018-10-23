package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testKonstruktoraSaIspisom() {
        Student s = new Student("Sven", "Hrbenic", 17901);
        assertEquals("Hrbenic Sven (17901)", s.toString());
    }
    @Test
    void getIme() {
        Student s = new Student ("Sven", "Hrbenic", 17901);
        assertEquals("Sven", s.getIme());
    }

    @Test
    void getPrezime() {
        Student s = new Student ("Sven", "Hrbenic", 17901);
        assertEquals("Hrbenic", s.getPrezime());
    }

    @Test
    void getBrojIndexa() {
        Student s = new Student ("Sven", "Hrbenic", 17901);
        assertEquals(17901, s.getBrojIndexa());
    }

    @Test
    void setIme() {
        Student s = new Student ("", "Hrbenic", 17901);
        s.setIme("Sven");
        assertEquals("Sven", s.getIme());
    }

    @Test
    void setPrezime() {
        Student s = new Student ("Sven", "", 17901);
        s.setPrezime("Hrbenic");
        assertEquals("Hrbenic", s.getPrezime());
    }

    @Test
    void setBrojIndexa() {
        Student s = new Student ("Sven", "Hrbenic", 0);
        s.setBrojIndexa(17901);
        assertEquals(17901, s.getBrojIndexa());
    }
}