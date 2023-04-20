package model;

public class IndirizzoFisico {
    private String via;
    private int numeroCivico;
    private int cap;
    private String comune;
    private String provincia;

    /**
     * crea l'indirizzo fisico con gli argumenti
     * @param via
     * @param numeroCivico
     * @param cap
     * @param comune
     * @param provincia
     */
    public IndirizzoFisico(String via, int numeroCivico, int cap, String comune, String provincia) {
        this.via = via;
        this.numeroCivico = numeroCivico;
        this.cap = cap;
        this.comune = comune;
        this.provincia = provincia;
    }

    /**
     * restituire il nome della via
     * @return
     */
    public String getVia() {
        return via;
    }

    /**
     * restituire il numero civico
     * @return
     */
    public int getNumeroCivico() {
        return numeroCivico;
    }

    /**
     * restituire il cap
     * @return
     */
    public int getCap() {
        return cap;
    }

    /**
     * restituire il nome del comune
     * @return
     */
    public String getComune() {
        return comune;
    }

    /**
     * restituire il nome della provincia
     * @return
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * settare il nome della via
     * @param via
     */
    public void setVia(String via) {
        this.via = via;
    }

    /**
     * settare il numero civico
     * @param numeroCivico
     */
    public void setNumeroCivico(int numeroCivico) {
        this.numeroCivico = numeroCivico;
    }

    /**
     * settare il cap
     * @param cap
     */
    public void setCap(int cap) {
        this.cap = cap;
    }

    /**
     *  settare il nome del comune
     * @param comune
     */
    public void setComune(String comune) {
        this.comune = comune;
    }

    /**
     * settare il nome della provincia
     * @param provincia
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
