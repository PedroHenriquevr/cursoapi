package br.com.etec.pedro.cursoapi.resource;

import br.com.etec.pedro.cursoapi.model.Cidade;
import br.com.etec.pedro.cursoapi.repository.CidadeRepository;
import br.com.etec.pedro.cursoapi.repository.filter.CidadeFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cidade")
public class CidadeResource {

    @Autowired
    CidadeRepository cidadeRepository;

    @GetMapping()
    public Page<Cidade> pesquisar(CidadeFilter cidadeFilter, Pageable pageable) {
        return cidadeRepository.filtrar(cidadeFilter, pageable);
    }

    @GetMapping("/todos")
    public List<Cidade> listarTodos() {
        return cidadeRepository.findAll();
    }
}
