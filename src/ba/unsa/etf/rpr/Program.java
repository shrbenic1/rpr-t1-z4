package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Student s1 = new Student("A", "B", 456);
        Student s2 = new Student("C", "D", 678);
        Predmet p = new Predmet("RPR", 99, 3);
        p.upisi(s1);
        p.upisi(s2);
        System.out.println(s1);
        System.out.println(p);
        p.ispisi(s1);
        System.out.println(p);
    }
}
