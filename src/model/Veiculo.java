
package model;

import javax.persistence.*;

@Entity
@Table(name = "tb_veiculo")
public class Veiculo implements java.io.Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idVeiculo",nullable = false)
    @SwingColumn(description = "Id")
    private int idVeiculo;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.DETACH)
    @JoinColumn(name = "id_cliente", nullable = false, referencedColumnName = "idCliente")
    @SwingColumn(description = "Cliente")
    private Cliente cliente;
        
    @Column(name = "marca",length = 100,nullable = false)
    @SwingColumn(description = "Marca")
    private String marca;
    
    @Column(name = "modelo",length = 100,nullable = false)
    @SwingColumn(description = "Modelo")
    private String modelo;
    
    @Column(name = "ano",nullable = false)
    @SwingColumn(description = "Ano")
    private int ano;

    @Column(name = "placa",length = 100,nullable = false)
    @SwingColumn(description = "Placa")
    private String placa;


    // Getters and Setters
    
    public Veiculo() {
        this.setIdVeiculo(0);
        this.setCliente(null);
        this.setMarca("");
        this.setModelo("");
        this.setAno(0);
        this.setPlaca("");
    }

    public Veiculo(int idVeiculo, Cliente cliente, String marca, String modelo, int ano, String placa) {
        this.setIdVeiculo(idVeiculo);
        this.setCliente(cliente);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
        this.setPlaca(placa);
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setMarca(String marca) {
        this.marca = marca.trim().isEmpty() ? "SEM MARCA" : marca.toUpperCase();
    }

    public void setModelo(String modelo) {
        this.modelo = modelo.trim().isEmpty() ? "SEM MODELO" : modelo.toUpperCase();
    }

    public void setAno(int ano) {
        this.ano = ano <= 0 ? 1 : ano;
    }

    public void setPlaca(String placa) {
        this.placa = placa.trim().isEmpty() ? "SEM PLACA" : placa.toUpperCase();
    }

    public int getIdVeiculo() {
        return this.idVeiculo;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public String toString() {
        return this.modelo + "," + this.cliente;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.idVeiculo;
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
        final Veiculo other = (Veiculo) obj;
        return this.idVeiculo == other.idVeiculo;
    }
    
    
    
} 



