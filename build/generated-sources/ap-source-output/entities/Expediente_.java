package entities;

import entities.Alumno;
import entities.Imagen;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-16T21:58:20")
@StaticMetamodel(Expediente.class)
public class Expediente_ { 

    public static volatile SingularAttribute<Expediente, String> estado;
    public static volatile CollectionAttribute<Expediente, Imagen> imagenCollection;
    public static volatile SingularAttribute<Expediente, Date> fechacreacion;
    public static volatile SingularAttribute<Expediente, Alumno> idalumno;
    public static volatile SingularAttribute<Expediente, Integer> idexpediente;
    public static volatile SingularAttribute<Expediente, String> memo;

}