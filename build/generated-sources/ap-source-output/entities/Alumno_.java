package entities;

import entities.Asignacion;
import entities.Expediente;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-16T21:58:20")
@StaticMetamodel(Alumno.class)
public class Alumno_ { 

    public static volatile SingularAttribute<Alumno, String> apellidos;
    public static volatile SingularAttribute<Alumno, String> direccionalumno;
    public static volatile CollectionAttribute<Alumno, Expediente> expedienteCollection;
    public static volatile SingularAttribute<Alumno, Date> fechanacimiento;
    public static volatile SingularAttribute<Alumno, Integer> idalumno;
    public static volatile CollectionAttribute<Alumno, Asignacion> asignacionCollection;
    public static volatile SingularAttribute<Alumno, Date> fechaingreso;
    public static volatile SingularAttribute<Alumno, String> sexo;
    public static volatile SingularAttribute<Alumno, String> dpi;
    public static volatile SingularAttribute<Alumno, String> yearcursado;
    public static volatile SingularAttribute<Alumno, String> nombres;

}