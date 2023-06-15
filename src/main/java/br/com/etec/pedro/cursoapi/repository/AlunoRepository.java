package br.com.etec.pedro.cursoapi.repository;

import br.com.etec.pedro.cursoapi.model.Aluno;
import br.com.etec.pedro.cursoapi.repository.aluno.AlunoRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>, AlunoRepositoryQuery {

}
