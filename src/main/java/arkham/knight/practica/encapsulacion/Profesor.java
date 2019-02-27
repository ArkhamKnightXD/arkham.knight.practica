package arkham.knight.practica.encapsulacion;

import java.util.List;

public class Profesor {

    private int id;
    private String nombre;
    private String apellido;
    private String carrera;
    private List<Estudiante> listaEstudiantes;

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

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public Profesor(int id, String nombre, String apellido, String carrera, List<Estudiante> listaEstudiantes) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.listaEstudiantes = listaEstudiantes;


    }

    //metodos



}
