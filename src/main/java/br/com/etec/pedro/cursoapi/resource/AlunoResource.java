package br.com.etec.pedro.cursoapi.resource;

import br.com.etec.pedro.cursoapi.model.Aluno;
import br.com.etec.pedro.cursoapi.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Aluno> listarTodos(){
        return alunoRepository.findAll();
    }
}
