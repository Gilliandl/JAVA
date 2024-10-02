
package controller;

import abstratas.Dados;
import abstratas.dao;
import enums.Status;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Query;
import model.OrdemServico;


public class daoOrdemServico extends dao<OrdemServico> {
    public List<OrdemServico>read(){
        String JPQL="select o from OrdemServico o order by o.dataentrada";
        Query query = Dados.getManager().createQuery(JPQL);
        return query.getResultList();
    }
    
    
    public List<OrdemServico>readByData(LocalDate data){
        String JPQL="select o from OrdemServico o where o.dataentrada >= ?1 order by o.dataentrada";
        Query query = Dados.getManager().createQuery(JPQL);
        query.setParameter(1,data);
        return query.getResultList();
    }
    
    
    public List<OrdemServico> readByStatus(Status s){
        String JPQL="select o from OrdemServico o where o.status = ?1 order by o.dataentrada";
        Query query = Dados.getManager().createQuery(JPQL);
        query.setParameter(1,s);
        return query.getResultList();
    }
    
}
