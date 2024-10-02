
package model;

import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name = "tb_manutencao")
public class Manutencao implements java.io.Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idManutencao",nullable = false)
    @SwingColumn(description = "Id")
    private int idManutencao;
        

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.DETACH)
    @JoinColumn(name = "id_ordem", nullable = false, referencedColumnName = "idOrdem")
    @SwingColumn(description = "OrdemServico")
    private OrdemServico ordemServico;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.DETACH)
    @JoinColumn(name = "id_mecanico", nullable = false, referencedColumnName = "idMecanico")
    @SwingColumn(description = "Mecanico")
    private Mecanico mecanico;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.DETACH)
    @JoinColumn(name = "id_peca",referencedColumnName = "idPeca")
    @SwingColumn(description = "Peca")
    private Peca peca;
    
    @Column(name = "descricao",length = 100,nullable = false)
    @SwingColumn(description = "Descricao")
    private String descricao;
    
    @Column(name = "custo",nullable = false,precision = 2)
    @SwingColumn(description = "Custo")
    private double custo;
    
    @Column(name = "datamanutencao", nullable = false)
    @SwingColumn(description = "datamanutencao")
    private LocalDate datamanutencao;

    // Getters and Setters

    public Manutencao() {
        this.setIdManutencao(0);
        this.setOrdemServico(ordemServico);
        this.setMecanico(mecanico);
        this.setPeca(peca);
        this.setDescricao("");
        this.setCusto(0);
        this.setDatamanutencao(null);
    }

    public Manutencao(int idManutencao, OrdemServico ordemServico, Mecanico mecanico, Peca peca, String descricao, double custo, LocalDate datamanutencao) {
        this.setIdManutencao(idManutencao);
        this.setOrdemServico(ordemServico);
        this.setMecanico(mecanico);
        this.setPeca(peca);
        this.setDescricao(descricao);
        this.setCusto(custo);
        this.setDatamanutencao(datamanutencao);
    }

    public void setIdManutencao(int idManutencao) {
        this.idManutencao = idManutencao;
    }

    public void setOrdemServico(OrdemServico ordemServico) {
        this.ordemServico = ordemServico == null ? new OrdemServico() : ordemServico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico == null ? new Mecanico() : mecanico;
    }

    public void setPeca(Peca peca) {
        this.peca = peca == null ? new Peca() : peca;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao.trim().isEmpty() ? "SEM DESCRICAO" : descricao.toUpperCase();;
    }

    public void setCusto(double custo) {
        this.custo = custo < 0 ? 0 : custo;
    }

    public void setDatamanutencao(LocalDate datamanutencao) {
        this.datamanutencao = datamanutencao == null ? LocalDate.now() : datamanutencao;
    }

    public int getIdManutencao() {
        return this.idManutencao;
    }

    public OrdemServico getOrdemServico() {
        return this.ordemServico;
    }

    public Mecanico getMecanico() {
        return this.mecanico;
    }

    public Peca getPeca() {
        return this.peca;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public double getCusto() {
        return this.custo;
    }

    public LocalDate getDatamanutencao() {
        return this.datamanutencao;
    }

    @Override
    public String toString() {
        return "Manutencao{" + "idManutencao=" + idManutencao + ", ordemServico=" + ordemServico + ", mecanico=" + mecanico + ", peca=" + peca + ", descricao=" + descricao + ", custo=" + custo + ", datamanutencao=" + datamanutencao + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.idManutencao;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Manutencao other = (Manutencao) obj;
        return this.idManutencao == other.idManutencao;
    }
    
    
}
