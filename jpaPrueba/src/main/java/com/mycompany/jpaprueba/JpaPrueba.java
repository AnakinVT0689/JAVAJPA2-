package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.Controladora;
import com.mycompany.jpaprueba.logica.Materia;
import java.util.Date;
import java.util.LinkedList;

public class JpaPrueba {

    public static void main(String[] args) {

        Controladora control = new Controladora();

        //creamos lista de materias y las agregamos
        LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
        //Creacion Carrera con lista de materias
        Carrera carre = new Carrera(25, "Tecnicatura en Programacion", listaMaterias);
        
        //Guardado de BD
        control.crearCarrera(carre);

        //Creacion Materias
        Materia mate1 = new Materia(58, "Programacion I", "Cuatrimestral", carre);
        Materia mate2 = new Materia(59, "Programacion II", "Cuatrimestral", carre);
        Materia mate3 = new Materia(60, "Programacion Avanzada", "Anual", carre);

        //Guardado Materias en BD
        control.crearMateria(mate1);
        control.crearMateria(mate2);
        control.crearMateria(mate3);

        //agregar a la lista de materias
        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);

        carre.setListaMaterias(listaMaterias);
        control.editarCarrera(carre);

        //Creacion Alumno (con carrera)
        Alumno al = new Alumno(23, "Ibra", "The Yorkie", new Date(), carre);

        //guardamos el alumno en la Bd
        control.crearAlumno(al);

        //vemos el resultado
        System.out.println("--------------------------");
        System.out.println("   ------------Datos Alumno----------- ");
        Alumno alu = control.traerAlumno(23);
        System.out.println("Alumno: " + alu.getNombre() + "" + alu.getApellido());
        System.out.println("Cursa la carrera de: " + alu.getCarre().getNombre());
    }

}
