package com.mycompany.login1.logica;

<<<<<<< HEAD
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-10-10T18:08:42", comments="EclipseLink-2.7.10.v20211216-rNA")
=======
import com.mycompany.login1.logica.Usuario;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-02T17:36:55", comments="EclipseLink-2.7.10.v20211216-rNA")
>>>>>>> 14eac0bc0ec47ae365081b0c27d68ace2b518c32
@StaticMetamodel(Rol.class)
public class Rol_ { 

    public static volatile SingularAttribute<Rol, String> descripcion;
<<<<<<< HEAD
=======
    public static volatile ListAttribute<Rol, Usuario> listaUsuarios;
>>>>>>> 14eac0bc0ec47ae365081b0c27d68ace2b518c32
    public static volatile SingularAttribute<Rol, String> nombreRol;
    public static volatile SingularAttribute<Rol, Integer> id;

}