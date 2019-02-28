package arkham.knight.practica.encapsulacion;

import java.util.List;

public class Profesor {

    private int id;
    private String nombre;
    private String apellido;
    private String carrera;
    public List<Estudiante> listaEstudiantes;

    public Profesor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }


    public Profesor(int id, String nombre, String apellido, String carrera, List<Estudiante> listaEstudiantes) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.listaEstudiantes = listaEstudiantes;


    }


    //metodos

    public Estudiante encontrarPorMatricula(int matricula, List<Estudiante> listaEstudiantes) { // va recorriendo en un foreach los objetos estudiantes y va iterando uno por uno en la variable estudiante, mientras lo va comparando con el parametro matricula cuando sea igual ahi retornara el estudiante
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getMatricula() == matricula) {
                return estudiante;
            }
        }

        return null;
    }

}
