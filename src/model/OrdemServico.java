
package model;

import enums.Status;
import javax.persistence.*;
import java.time.LocalDate;
 
@Entity
@Table(name = "tb_ordemservico")
public class OrdemServico implements java.io.Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idOrdem",nullable = false)
    @SwingColumn(description = "Id")
    private int idOrdem;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.DETACH)
    @JoinColumn(name = "id_veiculo", nullable = false, referencedColumnName = "idVeiculo")
    @SwingColumn(description = "veiculo")
    private Veiculo veiculo;

    @Column(name = "dataentrada", nullable = false)
    @SwingColumn(description = "DataEntrada")
    private LocalDate dataentrada;
    
    @Column(name = "datasaida", nullable = false)
    @SwingColumn(description = "DataSaida")
    private LocalDate datasaida;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "Status", length = 1, nullable = false)
    @SwingColumn(description = "Status")
    private Status status;

    // Getters and Setters

    public OrdemServico() {
        this.setIdOrdem(0);
        this.setVeiculo(veiculo);
        this.setDataentrada(null);
        this.setDatasaida(null);
        this.setStatus(status);
    }

    public OrdemServico(int idOrdem, Veiculo veiculo, LocalDate dataentrada, LocalDate datasaida, Status status) {
        this.setIdOrdem(idOrdem);
        this.setVeiculo(veiculo);
        this.setDataentrada(dataentrada);
        this.setDatasaida(datasaida);
        this.setStatus(status);
    }

    public void setIdOrdem(int idOrdem) {
        this.idOrdem = idOrdem;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo == null ? new Veiculo() : veiculo;
    }

    public void setDataentrada(LocalDate dataentrada) {
        this.dataentrada = dataentrada == null ? LocalDate.now() : dataentrada;
    }

    public void setDatasaida(LocalDate datasaida) {
        this.datasaida = datasaida == null ? LocalDate.now() : datasaida;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getIdOrdem() {
        return this.idOrdem;
    }

    public Veiculo getVeiculo() {
        return this.veiculo;
    }

    public LocalDate getDataentrada() {
        return this.dataentrada;
    }

    public LocalDate getDatasaida() {
        return this.datasaida;
    }

    public Status getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return this.idOrdem + "," + veiculo + "," + this.status;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.idOrdem;
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
        final OrdemServico other = (OrdemServico) obj;
        return this.idOrdem == other.idOrdem;
    }

    
    
    
}


