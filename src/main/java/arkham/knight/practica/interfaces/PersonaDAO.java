package arkham.knight.practica.interfaces;

import arkham.knight.practica.encapsulacion.Persona;


public interface PersonaDAO { // en esta interfaz se especifican todos los metodos que tendra persona


    void mostrarPersonas();

    Persona buscarPersonaPorId(int id);

    void agregarNuevaPersona(Persona persona);

    void actualizarPersona(Persona persona);

    void eliminarPersona(Persona persona);
}
