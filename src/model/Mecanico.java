
package model;

import javax.persistence.*;

@Entity
@Table(name = "tb_mecanico")
public class Mecanico implements java.io.Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMecanico",nullable = false)
    @SwingColumn(description = "Id")
    private int idMecanico;
       
    @Column(name = "nome",length = 100,nullable = false)
    @SwingColumn(description = "Nome")
    private String nome;
    
    @Column(name = "especialidade",length = 100,nullable = false)
    @SwingColumn(description = "Especialidade")
    private String especialidade;

    // Getters and Setters

    public Mecanico() {
        this.setIdMecanico(0);
        this.setNome("");
        this.setEspecialidade("");
    }

    public Mecanico(int idMecanico, String nome, String especialidade) {
        this.setIdMecanico(idMecanico);
        this.setNome(nome);
        this.setEspecialidade(especialidade);
    }

    public void setIdMecanico(int idMecanico) {
        this.idMecanico = idMecanico;
    }

    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty() ? "SEM NOME" : nome.toUpperCase();
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade.trim().isEmpty() ? "SEM ESPECIALIDADE" : especialidade.toUpperCase();
    }

    public int getIdMecanico() {
        return this.idMecanico;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    @Override
    public String toString() {
        return this.nome + "," + this.especialidade;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.idMecanico;
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
        final Mecanico other = (Mecanico) obj;
        return this.idMecanico == other.idMecanico;
    }
    
    
    
}



