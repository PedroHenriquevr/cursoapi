package br.com.etec.pedro.cursoapi.repository.cidade;

import br.com.etec.pedro.cursoapi.model.Cidade;
import br.com.etec.pedro.cursoapi.repository.filter.CidadeFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CidadeRepositoryQuery {

    public Page<Cidade> filtrar(CidadeFilter cidadeFilter, Pageable pageable);
}
