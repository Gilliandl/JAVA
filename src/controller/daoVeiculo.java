
package controller;

import abstratas.Dados;
import abstratas.dao;
import java.util.List;
import javax.persistence.Query;
import model.Cliente;
import model.Veiculo;


public class daoVeiculo extends dao<Veiculo> {
    public List<Veiculo>read(){
        String JPQL="select v from Veiculo v order by v.marca";
        Query query = Dados.getManager().createQuery(JPQL);
        return query.getResultList();
    }
    public List<Veiculo> readByPlaca(String filtroPlaca){
        String JPQL="select v from Veiculo v where v.placa like ?1 order by v.placa";
        Query query = Dados.getManager().createQuery(JPQL);
        query.setParameter(1,"%"+filtroPlaca.toUpperCase()+"%");
        return query.getResultList();
        
    }
    public List<Veiculo> readByCliente(Cliente c){
        String JPQL="select v from Veiculo v where v.idCliente like ?1 order by v.id_cliente";
        Query query = Dados.getManager().createQuery(JPQL);
        query.setParameter(1,c);
        return query.getResultList();
    }
}
