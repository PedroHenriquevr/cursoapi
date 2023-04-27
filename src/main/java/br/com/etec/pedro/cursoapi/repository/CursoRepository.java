package br.com.etec.pedro.cursoapi.repository;

import br.com.etec.pedro.cursoapi.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
