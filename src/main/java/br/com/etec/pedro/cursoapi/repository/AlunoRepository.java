package br.com.etec.pedro.cursoapi.repository;

import br.com.etec.pedro.cursoapi.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
