
package controller;

import abstratas.Dados;
import abstratas.dao;
import java.util.List;
import javax.persistence.Query;
import model.Peca;


public class daoPeca extends dao<Peca> {
    public List<Peca> read(){
        String JPQL="select p from Peca p order by p.nome";
        Query query = Dados.getManager().createQuery(JPQL);
        return query.getResultList();
    }
    public List<Peca> readByNome(String filtroNome){
        String JPQL="select p from Peca p where p.nome like ?1 order by p.nome";
        Query query = Dados.getManager().createQuery(JPQL);
        query.setParameter(1,"%"+filtroNome.toUpperCase()+"%");
        return query.getResultList();
    }
    
}
