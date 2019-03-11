package arkham.knight.practica.encapsulacion;


public class Estudiante {

    private int matricula;
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private int telefono;

    // implementando el patron de diseño singleton que basicamente es crear una instacia que se usara siempre que queramos trabajar con la clase desde otra clase

    private static Estudiante instancia;

    public static Estudiante getInstancia(){

        if (instancia==null){
            instancia = new Estudiante();
        }

        return instancia;
    }


    public Estudiante() {
    }

    public Estudiante(int matricula, String nombre, String apellido, int edad, String carrera, int telefono) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "matricula=" + matricula +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", carrera='" + carrera + '\'' +
                ", telefono=" + telefono +
                '}';
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }



    // Metodos




}
