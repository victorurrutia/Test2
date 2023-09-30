package org.generation.test2.services;


import org.generation.test2.models.Comentario;
import org.generation.test2.models.Tarea;

public interface TareaService {
    //Obtener
    Tarea getTareaPorId(Long id);

    //Borrar
    void deleteTareaPorId(Long id);

    //Editar
    void updateTareaPorId(Long id, Tarea tarea);

    //Create
    void createTarea(Tarea tarea);

    void asignarComentario(Long id, Comentario comentario);
}
