package br.com.etec.pedro.cursoapi.repository.aluno;

import br.com.etec.pedro.cursoapi.repository.filter.AlunoFilter;
import br.com.etec.pedro.cursoapi.repository.projections.AlunoDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AlunoRepositoryQuery {
    public Page<AlunoDTO> filtrar(AlunoFilter alunoFilter, Pageable pageable);
}
