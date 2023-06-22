package br.com.etec.pedro.cursoapi.resource;

import br.com.etec.pedro.cursoapi.model.Aluno;
import br.com.etec.pedro.cursoapi.repository.AlunoRepository;
import br.com.etec.pedro.cursoapi.repository.filter.AlunoFilter;
import br.com.etec.pedro.cursoapi.repository.projections.AlunoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/alunos")
public class AlunoResource {

    @Autowired
    AlunoRepository alunoRepository;

    @GetMapping()
    public Page<AlunoDTO> pesquisar(AlunoFilter alunoFilter, Pageable pageable) {
        return alunoRepository.filtrar(alunoFilter, pageable);
    }

    @GetMapping("/todos")
    public List<Aluno> listarTodos(){
        return alunoRepository.findAll();
    }
}
