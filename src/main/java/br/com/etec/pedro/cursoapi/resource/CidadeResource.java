package br.com.etec.pedro.cursoapi.resource;

import br.com.etec.pedro.cursoapi.model.Cidade;
import br.com.etec.pedro.cursoapi.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Cidade> listarTodos() {
        return cidadeRepository.findAll();
    }

}
