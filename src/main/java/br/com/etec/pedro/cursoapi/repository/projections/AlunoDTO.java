package br.com.etec.pedro.cursoapi.repository.projections;

public class AlunoDTO {
    private Long idaluno;

    private String nomealuno;

    private String nomecidade;

    private String uf;

    private String nomecurso;

    public AlunoDTO(Long idaluno, String nomealuno, String nomecidade, String uf, String nomecurso) {
        this.idaluno = idaluno;
        this.nomealuno = nomealuno;
        this.nomecidade = nomecidade;
        this.uf = uf;
        this.nomecurso = nomecurso;
    }

    public Long getId() {
        return idaluno;
    }

    public void setId(Long id) {
        this.idaluno = id;
    }

    public String getNomealuno() {
        return nomealuno;
    }

    public void setNomealuno(String nomealuno) {
        this.nomealuno = nomealuno;
    }

    public String getCidade() {
        return nomecidade;
    }

    public void setCidade(String cidade) {
        this.nomecidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNomecurso() {
        return nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }
}
