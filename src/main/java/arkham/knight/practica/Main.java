package arkham.knight.practica;

import arkham.knight.practica.encapsulacion.Estudiante;
import arkham.knight.practica.encapsulacion.Profesor;

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

        Profesor profesorLista = new Profesor();

        List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();




        listaEstudiantes.add(new Estudiante(20141337,"Carlos","perez",21,"ISC",809555470));
        listaEstudiantes.add(new Estudiante(20141338,"naruto","uzumaki",22,"ISC",809555470));
        listaEstudiantes.add(new Estudiante(20141339,"ichigo","kurosaki",23,"ISC",809555470));
        listaEstudiantes.add(new Estudiante(20141340,"yugi","moto",24,"ISC",809555470));

        // eliminando elemento se puede eliminar enviando el objeto completo o mandando el numero de la posicion donde esta
        // el listaestudiantes.get me devuelve el estudiante en la posicion que le mande

        listaEstudiantes.remove(listaEstudiantes.get(2));


        for (Estudiante estudianteForeach : listaEstudiantes){

            System.out.println(estudianteForeach);
        }

        // cantidad de elementos en la lista
        System.out.println(listaEstudiantes.size());





        //como encontrar por matricula utilizando un metodo usado en la clase profesor

        Profesor profesorMetodos = new Profesor();

       profesorMetodos.encontrarPorMatricula(20141337, listaEstudiantes);



        //implementando singleton

        Estudiante estudianteSingleton = new Estudiante();

        estudianteSingleton.getInstancia().setNombre("karvin2");

        estudianteSingleton.getInstancia().setApellido("singleton");

        System.out.println(estudianteSingleton.getInstancia().getNombre());

        System.out.println(estudianteSingleton.getInstancia().getApellido());



    }
}
