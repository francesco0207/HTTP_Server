package es_serverhttp;

public class PuntoVendita {
    private long idPuntoVendita;
    private long cap;
    private long idEsercente;
    private String denominazione;
    private String indirizzo;
    private String comune;
    private String codProvincia;
    private String urlSito;
    private String telefonoPrincipale;
    private String telefonoSecondario;
    private String email;
    private String latitudine;
    private String longitudine;
    private String ragioneSociale;
    private boolean flagFisicoOnline; 
    
    public PuntoVendita() {
        
    }
    
    public long getIdPuntoVendita() {
        return idPuntoVendita;
    }

    public void setIdPuntoVendita(long idPuntoVendita) {
        this.idPuntoVendita = idPuntoVendita;
    }

    public long getCap() {
        return cap;
    }

    public void setCap(long cap) {
        this.cap = cap;
    }

    public long getIdEsercente() {
        return idEsercente;
    }

    public void setIdEsercente(long idEsercente) {
        this.idEsercente = idEsercente;
    }

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizo) {
        this.indirizzo = indirizo;
    }

    public String getComune() {
        return comune;
    }

    public void setComune(String comune) {
        this.comune = comune;
    }

    public String getCodProvincia() {
        return codProvincia;
    }

    public void setCodProvincia(String codProvincia) {
        this.codProvincia = codProvincia;
    }

    public String getUrlSito() {
        return urlSito;
    }

    public void setUrlSito(String urlSito) {
        this.urlSito = urlSito;
    }

    public String getTelefonoPrincipale() {
        return telefonoPrincipale;
    }

    public void setTelefonoPrincipale(String telefonoPrincipale) {
        this.telefonoPrincipale = telefonoPrincipale;
    }

    public String getTelefonoSecondario() {
        return telefonoSecondario;
    }

    public void setTelefonoSecondario(String telefonoSecondario) {
        this.telefonoSecondario = telefonoSecondario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLatitudine() {
        return latitudine;
    }

    public void setLatitudine(String latitudine) {
        this.latitudine = latitudine;
    }

    public String getLongitudine() {
        return longitudine;
    }

    public void setLongitudine(String longitudine) {
        this.longitudine = longitudine;
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    public boolean isFlagFisicoOnline() {
        return flagFisicoOnline;
    }

    public void setFlagFisicoOnline(boolean flagFisicoOnline) {
        this.flagFisicoOnline = flagFisicoOnline;
    }   
}
