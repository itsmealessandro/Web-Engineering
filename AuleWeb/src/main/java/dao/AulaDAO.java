/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import data.domain.Attrezzatura;
import data.domain.Aula;
import data.domain.Evento;
import data.domain.Gruppo;
import data.domain.Posizione;
import framework.data.DataException;
import java.util.List;

/**
 *
 * @author emanu
 */
public interface AulaDAO {
    
    // Crea e restituisce una nuova aula
    Aula creaNuovaAula() throws DataException;

    // Restituisce l'aula corrente
    Aula ottieniAulaCorrente();

    // Restituisce tutte le aule disponibili
    List<Aula> ottieniTutteLeAule();

    // Restituisce tutte le aule che contengono una specifica attrezzatura
    List<Aula> ottieniAulePerAttrezzatura(Attrezzatura attrezzatura);

    // Restituisce tutte le aule in base alla posizione geografica
    List<Aula> ottieniAulePerPosizione(Posizione posizione);

    // Restituisce tutte le aule associate a un gruppo specifico
    List<Aula> ottieniAulePerGruppo(Gruppo gruppo);

    // Restituisce tutte le aule associate a un evento specifico
    List<Aula> ottieniAulePerEvento(Evento evento);

    // Salva l'aula corrente
    void salvaAulaCorrente();

    // Elimina l'aula corrente
    void eliminaAulaCorrente();    
}
