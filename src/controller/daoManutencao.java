
package controller;

import abstratas.Dados;
import abstratas.dao;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Query;
import model.Manutencao;
import model.Mecanico;


public class daoManutencao extends dao<Manutencao>{
    
    public List<Manutencao>read(){
        String JPQL="select m from Manutencao m order by m.datamanutencao";
        Query query = Dados.getManager().createQuery(JPQL);
        return query.getResultList();
    }
     
    public List<Manutencao>readByData(LocalDate data){
        String JPQL="select m from Manutencao m where m.datamanutencao >= ?1 order by m.datamanutencao";
        Query query = Dados.getManager().createQuery(JPQL);
        query.setParameter(1,data);
        return query.getResultList();
    }
    
    public List<Manutencao>readByMecanico(Mecanico mecanico){
        String JPQL="select m from Manutencao m where m.id_mecanico = ?1 order by m.datamanutencao";
        Query query = Dados.getManager().createQuery(JPQL);
        query.setParameter(1,mecanico);
        return query.getResultList();
    }
    
    public List<Manutencao>readByDescricao(String filtro){
        String JPQL="select m from Manutencao m where m.descricao like ?1 order by m.descricao";
        Query query = Dados.getManager().createQuery(JPQL);
        query.setParameter(1, "%" + filtro.toUpperCase() + "%");
        return query.getResultList();
    }
 
}
