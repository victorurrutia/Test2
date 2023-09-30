package org.generation.test2.services;


import org.generation.test2.models.Tarea;
import org.generation.test2.models.Usuario;

public interface UsuarioService {

    //Obtener
    Usuario getUsuarioPorId(Long id);

    //Borrar
    void deleteUsuarioPorId(Long id);

    //Editar
    void updateUsuarioPorId(Long id, Usuario usuario);

    //Create
    void createUsuario(Usuario usuario);

    void asignarTarea(Long id, Tarea tarea);
}
