/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugarden;

import java.util.Scanner;
import java.awt.Toolkit;

/**
 *
 * @author hp431
 */
public class UGarden {

    private String namaTanaman;
    private int statusTumbuh;
    private int statusPenyiraman;
    private int statusPemupukan;
    private int jumlahAir;
    private int jumlahPupuk;
    private String pertumbuhan[] = {"Benih", "Tunas", "Tumbuhan Kecil", "Tumbuhan Besar", "Berbunga"};

    public void setNamaTanaman(String newNamaTanaman) {
        namaTanaman = newNamaTanaman;
    }

    public String getNamaTanaman() {
        return namaTanaman;
    }

    public void setStatusTumbuh(int newStatusTumbuh) {
        statusTumbuh = newStatusTumbuh;
    }

    public String getStatusTumbuh() {
        if(statusTumbuh>4)
            return "Berbunga";
        else
            return pertumbuhan[statusTumbuh];
    }
    public int getStatusTumbuhInteger()
    {
        return statusTumbuh;
    }
    public void setStatusPemupukan(int newStatusPemupukan) {
        statusPemupukan = newStatusPemupukan;
    }

    public int getStatusPemupukan() {
        return statusPemupukan;
    }

    public void setStatusPenyiraman(int newStatusPenyiraman) {
        statusPenyiraman = newStatusPenyiraman;
    }

    public int getStatusPenyiraman() {
        return statusPenyiraman;
    }
    public int getJumlahAir()
    {
        return jumlahAir;
    }
    public int getJumlahPupuk()
    {
        return jumlahPupuk;
    }
    public void tambahAir()
    {
        jumlahAir++;
    }
    public void tambahPupuk()
    {
        jumlahPupuk++;
    }

    public boolean isTumbuh() {
        if (getStatusPemupukan() >= 1 && getStatusPenyiraman() >= 4) {
            return true;
        } else {
            return false;
        }
    }

    public void bertumbuh() {
        setStatusPemupukan((getStatusPemupukan() - 1));
        setStatusPenyiraman((getStatusPenyiraman() - 4));
        statusTumbuh++;
    }

    public void siramAir() {
        statusPenyiraman++;
        jumlahAir--;
    }

    public void beriPupuk() {
        statusPemupukan++;
        jumlahPupuk--;
    }

    public UGarden() {
        setNamaTanaman("");
        setStatusTumbuh(0);
        setStatusPemupukan(1);
        setStatusPenyiraman(1);
        jumlahAir = 3;
        jumlahPupuk = 1;
    }
}
