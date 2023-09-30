package org.generation.test2.services;


import org.generation.test2.models.Comentario;

public interface ComentarioService {
    //Obtener
    Comentario getComentarioPorId(Long id);

    //Borrar
    void deleteComentarioPorId(Long id);

    //Editar
    void updateComentarioPorId(Long id, Comentario comentario);

    //Create
    void createComentario(Comentario comentario);

}
