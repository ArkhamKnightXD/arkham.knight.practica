package arkham.knight.practica.implement;

import arkham.knight.practica.encapsulacion.Persona;
import arkham.knight.practica.interfaces.PersonaDAO;

import java.util.ArrayList;
import java.util.List;

public class PersonaDAOImpl implements PersonaDAO { // en esta clase se programaran todos los metodos ya descritos en la interfaz

    List<Persona> listarPersonas = new ArrayList<>();


    @Override
    public void mostrarPersonas(){

        for (Persona persona: listarPersonas) {

            System.out.println(persona.toString());

        }
    }

    @Override
    public Persona buscarPersonaPorId(int id) {
        for (Persona persona: listarPersonas) {
            if (persona.getId() == id){
                return persona;
            }

        }

        return null;
    }

    @Override
    public void agregarNuevaPersona(Persona persona) {

        listarPersonas.add(persona);

    }

    @Override
    public void actualizarPersona(Persona persona) {

        for (int i = 0; i < listarPersonas.size() ; i++ ){
            if(listarPersonas.get(i).getId() == persona.getId()){
                listarPersonas.get(i).setNombre(persona.getNombre());
                listarPersonas.get(i).setApellido(persona.getApellido());
                listarPersonas.get(i).setDireccion(persona.getDireccion());
                listarPersonas.get(i).setTelefono(persona.getTelefono());
                listarPersonas.get(i).setEdad(persona.getEdad());

            }

        }
    }

    @Override
    public void eliminarPersona(Persona persona) {

        listarPersonas.remove(persona);

    }
}
