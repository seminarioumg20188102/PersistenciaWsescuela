package entities;

import entities.Alumno;
import entities.Aula;
import entities.Catedratico;
import entities.Curso;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-16T21:58:20")
@StaticMetamodel(Asignacion.class)
public class Asignacion_ { 

    public static volatile SingularAttribute<Asignacion, Date> fechaasignacion;
    public static volatile SingularAttribute<Asignacion, Alumno> idalumno;
    public static volatile SingularAttribute<Asignacion, Curso> idcurso;
    public static volatile SingularAttribute<Asignacion, Integer> idasignacion;
    public static volatile SingularAttribute<Asignacion, Aula> idaula;
    public static volatile SingularAttribute<Asignacion, Catedratico> idcatedratico;

}