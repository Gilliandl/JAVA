
package model;

import javax.persistence.*;

@Entity
@Table(name = "tb_peca")
public class Peca implements java.io.Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPeca",nullable = false)
    @SwingColumn(description = "Id")
    private int idPeca;
        

    @Column(name = "nome",length = 100,nullable = false)
    @SwingColumn(description = "Nome")
    private String nome;
    
    @Column(name = "descricao",length = 100,nullable = false)
    @SwingColumn(description = "Descricao")
    private String descricao;
        
    @Column(name = "preco",nullable = false,precision = 2)
    @SwingColumn(description = "Preco")
    private double preco;

    // Getters and Setters

    public Peca() {
        this.setIdPeca(0);
        this.setNome("");
        this.setDescricao("");
        this.setPreco(0);
    }

    public Peca(int idPeca, String nome, String descricao, double preco) {
        this.setIdPeca(idPeca);
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setPreco(preco);
    }

    public void setIdPeca(int idPeca) {
        this.idPeca = idPeca;
    }

    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty() ? "SEM NOME" : nome.toUpperCase();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao.trim().isEmpty() ? "SEM DESCRICAO" : descricao.toUpperCase();
    }

    public void setPreco(double preco) {
        this.preco = preco < 0 ? 0 : preco;
    }

    public int getIdPeca() {
        return this.idPeca;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public double getPreco() {
        return this.preco;
    }

    @Override
    public String toString() {
        return this.nome + "," + this.descricao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.idPeca;
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
        final Peca other = (Peca) obj;
        return this.idPeca == other.idPeca;
    }
    
    
    
}



