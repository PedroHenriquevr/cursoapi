package br.com.etec.pedro.cursoapi.repository.curso;

import br.com.etec.pedro.cursoapi.model.Curso;
import br.com.etec.pedro.cursoapi.repository.filter.CursoFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class CursoRepositoryImpl implements CursoRepositoryQuery {
    @Override
    public Page<Curso> filtar(CursoFilter cursoFilter, Pageable pageable) {
        return null;
    }
}
 