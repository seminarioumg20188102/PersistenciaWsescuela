package entities;

import entities.Asignacion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-16T21:58:20")
@StaticMetamodel(Catedratico.class)
public class Catedratico_ { 

    public static volatile SingularAttribute<Catedratico, String> direccioncatedratico;
    public static volatile SingularAttribute<Catedratico, Date> fechanacimiento;
    public static volatile CollectionAttribute<Catedratico, Asignacion> asignacionCollection;
    public static volatile SingularAttribute<Catedratico, String> apellidocatedratico;
    public static volatile SingularAttribute<Catedratico, String> sexo;
    public static volatile SingularAttribute<Catedratico, String> dpi;
    public static volatile SingularAttribute<Catedratico, Integer> telefono;
    public static volatile SingularAttribute<Catedratico, String> nombrecatedratico;
    public static volatile SingularAttribute<Catedratico, Integer> idcatedratico;

}