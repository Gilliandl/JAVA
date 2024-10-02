package model;

import java.time.LocalDate;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Mecanico;
import model.OrdemServico;
import model.Peca;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-11T21:03:43", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Manutencao.class)
public class Manutencao_ { 

    public static volatile SingularAttribute<Manutencao, Mecanico> mecanico;
    public static volatile SingularAttribute<Manutencao, Double> custo;
    public static volatile SingularAttribute<Manutencao, Peca> peca;
    public static volatile SingularAttribute<Manutencao, LocalDate> datamanutencao;
    public static volatile SingularAttribute<Manutencao, OrdemServico> ordemServico;
    public static volatile SingularAttribute<Manutencao, Integer> idManutencao;
    public static volatile SingularAttribute<Manutencao, String> descricao;

}