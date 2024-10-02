
package crud;

import enums.Status;
import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Cliente;
import model.Manutencao;
import model.Mecanico;
import model.OrdemServico;
import model.Peca;
import model.Veiculo;

public class Teste {
    /* 
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Gestao_ManutencaoPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Cliente cliente = new Cliente();
        cliente.setNome("João Silva");
        cliente.setEndereco("Rua das Flores, 123");
        cliente.setTelefone("99999-9999");
        cliente.setEmail("joao.silva@example.com");
        em.persist(cliente);

         Veiculo veiculo = new Veiculo();
        veiculo.setCliente(cliente);
        veiculo.setMarca("Toyota");
        veiculo.setModelo("Corolla");
        veiculo.setAno(2020);
        veiculo.setPlaca("ABC-1234");
        em.persist(veiculo);

         OrdemServico ordem = new OrdemServico();
        ordem.setVeiculo(veiculo);
        ordem.setDataentrada(LocalDate.now());
        ordem.setStatus(Status.R);
        em.persist(ordem);

         Mecanico mecanico = new Mecanico();
        mecanico.setNome("Carlos Souza");
        mecanico.setEspecialidade("Motor");
        em.persist(mecanico);

         Peca peca = new Peca();
        peca.setNome("Filtro de óleo");
        peca.setDescricao("Filtro de óleo para motores Toyota");
        peca.setPreco(30.0);
        em.persist(peca);

         Manutencao manutencao = new Manutencao();
        manutencao.setOrdemServico(ordem);
        manutencao.setMecanico(mecanico);
        manutencao.setPeca(peca);
        manutencao.setDescricao("Troca de filtro de óleo");
        manutencao.setCusto(50.0);
        manutencao.setDatamanutencao(LocalDate.now());
        em.persist(manutencao);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
    */
}
