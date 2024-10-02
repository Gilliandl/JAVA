
package enums;

public enum Status {
    C("CONCLUIDO"),
    E("EM ANDAMENTO)"),
    R("RECEBIDO");
    
    
    
    String descricao;

    private Status(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
    
    
    
    
}
