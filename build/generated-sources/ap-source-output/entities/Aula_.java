package entities;

import entities.Asignacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-16T21:58:20")
@StaticMetamodel(Aula.class)
public class Aula_ { 

    public static volatile SingularAttribute<Aula, String> descripcionaula;
    public static volatile CollectionAttribute<Aula, Asignacion> asignacionCollection;
    public static volatile SingularAttribute<Aula, Integer> capacidadaula;
    public static volatile SingularAttribute<Aula, Integer> idaula;

}