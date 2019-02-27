package arkham.knight.practica;

import arkham.knight.practica.encapsulacion.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // funcionamiento de los getters and setters de la clase

        Estudiante estudiante = new Estudiante();

        estudiante.setNombre("Karvin");
        estudiante.setApellido("Jimenez");
        estudiante.setEdad(15);
        estudiante.setCarrera("ADH");
        estudiante.setTelefono(444555);



        System.out.println(estudiante.getNombre());
        System.out.println(estudiante.getApellido());
        System.out.println(estudiante.getTelefono());
        System.out.println(estudiante.getCarrera());
        System.out.println(estudiante.getEdad());

        // funcionamiento del constructor y del metodo tostring

       Estudiante estudiante1 = new Estudiante(20141336,"Carlos","Jimenez",22,"ISC",809582470);


        System.out.println(estudiante1.toString());



        // funcionamiento de las lista con sus respectivos metodos y el uso de los foreach para recorrer esta coleccion

        List<Estudiante> listaEstudiante = new ArrayList<Estudiante>();

        listaEstudiante.add(new Estudiante(20141337,"Carlos","perez",21,"ISC",809555470));
        listaEstudiante.add(new Estudiante(20141337,"Carlos","perez",22,"ISC",809555470));
        listaEstudiante.add(new Estudiante(20141337,"Carlos","perez",23,"ISC",809555470));
        listaEstudiante.add(new Estudiante(20141337,"Carlos","perez",24,"ISC",809555470));


        for (Estudiante estudianteForeach : listaEstudiante){

            System.out.println(estudianteForeach);
        }


        // como encontrar por matricula




    }
}
