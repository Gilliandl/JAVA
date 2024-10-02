package model;

import enums.Status;
import java.time.LocalDate;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Veiculo;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-11T21:03:43", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(OrdemServico.class)
public class OrdemServico_ { 

    public static volatile SingularAttribute<OrdemServico, Veiculo> veiculo;
    public static volatile SingularAttribute<OrdemServico, LocalDate> datasaida;
    public static volatile SingularAttribute<OrdemServico, LocalDate> dataentrada;
    public static volatile SingularAttribute<OrdemServico, Integer> idOrdem;
    public static volatile SingularAttribute<OrdemServico, Status> status;

}