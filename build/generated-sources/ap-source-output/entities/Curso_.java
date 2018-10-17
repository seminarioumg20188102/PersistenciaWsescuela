package entities;

import entities.Asignacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-16T21:58:20")
@StaticMetamodel(Curso.class)
public class Curso_ { 

    public static volatile SingularAttribute<Curso, String> tipo;
    public static volatile CollectionAttribute<Curso, Asignacion> asignacionCollection;
    public static volatile SingularAttribute<Curso, Integer> idcurso;
    public static volatile SingularAttribute<Curso, String> nombre;

}