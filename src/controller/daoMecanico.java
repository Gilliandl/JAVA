
package controller;

import abstratas.Dados;
import abstratas.dao;
import java.util.List;
import javax.persistence.Query;
import model.Mecanico;


public class daoMecanico  extends dao<Mecanico>  {
    public List<Mecanico> read(){
        String JPQL="select m from Mecanico m order by m.nome";
        Query query = Dados.getManager().createQuery(JPQL);
        return query.getResultList();
    }
    public List<Mecanico> readByNome(String filtroNome){
        String JPQL="select m from Mecanico m where m.nome like ?1 order by m.nome";
        Query query = Dados.getManager().createQuery(JPQL);
        query.setParameter(1,"%"+filtroNome.toUpperCase()+"%");
        return query.getResultList();
    }
    
}
