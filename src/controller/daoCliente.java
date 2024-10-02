
package controller;

import abstratas.Dados;
import abstratas.dao;
import java.util.List;
import javax.persistence.Query;
import model.Cliente;

public class daoCliente extends dao<Cliente> {
    public List<Cliente> read(){
        String JPQL="select c from Cliente c order by c.nome";
        Query query = Dados.getManager().createQuery(JPQL);
        return query.getResultList();
    }
    public List<Cliente> readByNome(String filtroNome){
        String JPQL="select c from Cliente c where c.nome like ?1 order by c.nome";
        Query query = Dados.getManager().createQuery(JPQL);
        query.setParameter(1,"%"+filtroNome.toUpperCase()+"%");
        return query.getResultList();
    }
    
}
