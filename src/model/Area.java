package model;

public class Area {
    // campi
    private int longitudine;
    private  int latitudine;
    private String denominazioneUfficiale;
    private String stato;

    /**
     * crea l'area con gli argumenti longitudine ,latitudine, denominazione ufficiale e lo stato
     * @param longitudine
     * @param latitudine
     * @param denominazioneUfficiale
     * @param stato
     */
    public Area(int longitudine, int latitudine, String denominazioneUfficiale, String stato) {
        this.longitudine = longitudine;
        this.latitudine = latitudine;
        this.denominazioneUfficiale = denominazioneUfficiale;
        this.stato = stato;
    }

    /**
     *
     * restitiure la longitudine
     */
    public int getLongitudine() {
        return longitudine;
    }

    /**
     * restitiure la latitudine
     * @return
     */
    public int getLatitudine() {
        return latitudine;
    }

    /**
     * restitiure la denominazione ufficiale
     * @return
     */
    public String getDenominazioneUfficiale() {
        return denominazioneUfficiale;
    }

    /**
     * restitiure lo stato
     * @return
     */
    public String getStato() {
        return stato;
    }

    /**
     * settare la longitudine
     * @param longitudine
     */
    public void setLongitudine(int longitudine) {
        this.longitudine = longitudine;
    }

    /**
     * settare la latitudine
     * @param latitudine
     */
    public void setLatitudine(int latitudine) {
        this.latitudine = latitudine;
    }

    /**
     * settare la denominazione ufficiale
     * @param denominazioneUfficiale
     */
    public void setDenominazioneUfficiale(String denominazioneUfficiale) {
        this.denominazioneUfficiale = denominazioneUfficiale;
    }

    /**
     * settare il nome dello stato
     * @param stato
     */
    public void setStato(String stato) {
        this.stato = stato;
    }
}
