package com.company;

import java.util.Objects;

public class Produkt {
    private String name,SKU;
    private int preis,initialeAnzahl;

    public Produkt(String name, String SKU, int preis, int initialeAnzahl) {
        this.name = name;
        this.SKU = SKU;
        this.preis = preis;
        this.initialeAnzahl = initialeAnzahl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public int getInitialeAnzahl() {
        return initialeAnzahl;
    }

    public void setInitialeAnzahl(int initialeAnzahl) {
        this.initialeAnzahl = initialeAnzahl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produkt produkt = (Produkt) o;
        return name.equals(produkt.name) && SKU.equals(produkt.SKU);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, SKU);
    }
}