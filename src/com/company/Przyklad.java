package com.company;

public class Przyklad {

    private static int ilosc = 0;
    public Przyklad() {
        ilosc++;
    }
    public int getIlosc() {
        return ilosc;
    }
    public final String dajString() {
        return "FINAL";
    }
}
