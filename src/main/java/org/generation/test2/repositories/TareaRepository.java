package org.generation.test2.repositories;


import org.generation.test2.models.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaRepository extends JpaRepository<Tarea,Long> {
}
