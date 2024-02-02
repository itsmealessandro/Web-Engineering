package data.proxy;

import data.domainImpl.EventoImpl;
import data.domainImpl.Ricorrenza;
import data.domainImpl.TipologiaEvento;
import framework.data.DataItemProxy;
import framework.data.DataLayer;
import java.sql.Date;
import java.sql.Time;

public class EventoProxy extends EventoImpl implements DataItemProxy {

    protected boolean modified;
    protected int aula_key = 0;
    protected int responsabile_key = 0;
    protected int corso_key = 0;

    protected DataLayer dataLayer;

    public EventoProxy(DataLayer d) {
        super();
        this.dataLayer = d;
        this.modified = false;
        this.aula_key = 0;
        this.responsabile_key = 0;
        this.corso_key = 0;
    }

    @Override
    public void setKey(Integer key) {
        super.setKey(key);
        this.modified = true;
    }

    @Override
    public void setIDMaster(int IDMaster) {
        super.setIDMaster(IDMaster);
        this.modified = true;
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
        this.modified = true;
    }

    @Override
    public void setOraInizio(Time oraInizio) {
        super.setOraInizio(oraInizio);
        this.modified = true;
    }

    @Override
    public void setOraFine(Time oraFine) {
        super.setOraFine(oraFine);
        this.modified = true;
    }

    @Override
    public void setDescrizione(String descrizione) {
        super.setDescrizione(descrizione);
        this.modified = true;
    }

    public void setAulaKey(int aula_key) {
        this.aula_key = aula_key;
        super.setAula(null);
    }

    @Override
    public void setRicorrenza(Ricorrenza ricorrenza) {
        super.setRicorrenza(ricorrenza);
        this.modified = true;
    }

    @Override
    public void setTipologiaEvento(TipologiaEvento tipologiaEvento) {
        super.setTipologiaEvento(tipologiaEvento);
        this.modified = true;
    }

    public void setData(Date data) {
        super.setData(data);
        this.modified = true;
    }

    public void setResponsabileKey(int responsabile_key) {
        this.responsabile_key = responsabile_key;
        super.setResponsabile(null);
    }

    public void setCorsoKey(int corso_key) {
        this.corso_key = corso_key;
        super.setCorso(null);
    }

    // METODI DEL PROXY
    // PROXY-ONLY METHODS
    @Override
    public void setModified(boolean dirty) {
        this.modified = dirty;
    }

    @Override
    public boolean isModified() {
        return modified;
    }

}
