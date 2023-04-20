package model;

import java.util.ArrayList;

public class CentroArea {
    private String nome;
    private IndirizzoFisico indirizzo;
    private ArrayList<Area> aree;


    public CentroArea() {
    }

    /**
     * crea il centro aree con gli argumenti
     * @param nome
     * @param indirizzo
     * @param aree
     */
    public CentroArea(String nome, IndirizzoFisico indirizzo, ArrayList<Area> aree) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.aree = aree;
    }

    /**
     * restituire il nome del centro
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     * settare il nome de centro
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * restituire l'indirizzo fisico
     * @return
     */
    public IndirizzoFisico getIndirizzo() {
        return indirizzo;
    }

    /**
     * settare l'indirizzo fisico
     * @param indirizzo
     */
    public void setIndirizzo(IndirizzoFisico indirizzo) {
        this.indirizzo = indirizzo;
    }

    /**
     * ristituire l'area
     * @return
     */
    public ArrayList<Area> getAree() {
        return aree;
    }

    /**
     * settare l'area
     * @param aree
     */
    public void setAree(ArrayList<Area> aree) {
        this.aree = aree;
    }
}
