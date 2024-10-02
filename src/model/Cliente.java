
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente implements java.io.Serializable{
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCliente",nullable = false)
    @SwingColumn(description = "Id")
    private int idCliente;
   
    @Column(name = "nome",length = 100,nullable = false)
    @SwingColumn(description = "Nome")
    private String nome;

    @Column(name = "endereco",length = 100,nullable = false)
    @SwingColumn(description = "Endereco")
    private String endereco;
    
    @Column(name = "telefone",length = 50,nullable = false)
    @SwingColumn(description = "Telefone")
    private String telefone;
    
    @Column(name = "email",length = 50,nullable = false)
    @SwingColumn(description = "Email")
    private String email;
    

    // Getters and Setters
    
    public Cliente() {
        this.setIdCliente(0);
        this.setNome("");
        this.setEndereco("");
        this.setTelefone("");
        this.setEmail("");
    }

    public Cliente(int idCliente, String nome, String endereco, String telefone, String email) {
        this.setIdCliente(idCliente);
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
        this.setEmail(email);
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty() ? "SEM NOME" : nome.toUpperCase();
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco.trim().isEmpty() ? "SEM ENDEREÇO" : endereco.toUpperCase();
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone.trim().isEmpty() ? "(00)00000-0000": telefone;
    }

    public void setEmail(String email) {
        this.email = email.trim().isEmpty() ? "SEM EMAIL" : email.toLowerCase();
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return this.nome; /* "Cliente{" + "idCliente=" + idCliente + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + '}'; */
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.idCliente;
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
        final Cliente other = (Cliente) obj;
        return this.idCliente == other.idCliente;
    }
    
    
    
    
}


