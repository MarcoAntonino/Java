/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author antoninom
 */
public class Cliente {
    
    private String nome;
    private String cognome;
    private String ragioneSociale;
    private String indirizzo;
    private String cap;
    private String citta;
    private String provincia;
    private String telefono;
    private String cellulare;
    private String email;
    private String codiceFiscale;
    private String partitaIva; 

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCellulare() {
        return cellulare;
    }

    public void setCellulare(String cellulare) {
        this.cellulare = cellulare;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getPartitaIva() {
        return partitaIva;
    }

    public void setPartitaIva(String partitaIva) {
        this.partitaIva = partitaIva;
    }

    @Override
    public String toString() {
        return "Cliente: " + (nome != null ? "nome= " + nome + "\n" : "")
                           + (cognome != null ? "cognome= " + cognome + "\n" : "")
                           + (ragioneSociale != null ? "ragioneSociale= " + ragioneSociale + "\n" : "")
                           + (indirizzo != null ? "indirizzo= " + indirizzo + "\n" : "")
                           + (cap != null ? "cap= " + cap + "\n" : "")
                           + (citta != null ? "cap= " + citta + "\n" : "")
                           + (provincia != null ? "provincia= " + provincia + "\n" : "")
                           + (telefono != null ? "telefono= " + provincia + "\n" : "")
                           + (cellulare != null ? "cellulare= " + cellulare + "\n" : "")
                           + (email != null ? "email= " + email + "\n" : "")
                           + (codiceFiscale != null ? "codiceFiscale= " + codiceFiscale + "\n" : "")
                           + (partitaIva != null ? "partitaIva= " + partitaIva + "\n" : "")
                
                ;
    }

    
    
    
}
