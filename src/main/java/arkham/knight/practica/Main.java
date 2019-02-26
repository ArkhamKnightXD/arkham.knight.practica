package arkham.knight.practica;

import arkham.knight.practica.encapsulacion.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // funcionamiento de los getters and setters de la clase

        Estudiante estudiante = new Estudiante();

        estudiante.setNombre("Karvin");

        System.out.println(estudiante.getNombre());

        // funcionamiento del constructor y del metodo tostring

        new Estudiante(20141336,"Karvin2","Jimenez",22,"ISC",809582470);


        System.out.println(estudiante.toString());

        // funcionamiento de la lista y como agregar objetos

        List<Estudiante> listaEstudiante = new ArrayList<Estudiante>();

    }
}
