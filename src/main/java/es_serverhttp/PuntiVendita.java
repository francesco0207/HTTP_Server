package es_serverhttp;

import java.util.ArrayList;

public class PuntiVendita {
    private int lungh;
    private ArrayList<PuntoVendita> arrPuntiVendita;

    public int getLungh() {
        return lungh;
    }

    public void setLungh(int lungh) {
        this.lungh = lungh;
    }

    public ArrayList<PuntoVendita> getArrPuntiVenita() {
        return arrPuntiVendita;
    }

    public void setArrPuntiVenita(ArrayList<PuntoVendita> arrPuntiVenita) {
        this.arrPuntiVendita = arrPuntiVendita;
    }
}