package br.com.etec.pedro.cursoapi.repository.projections;

public class AlunoDTO {
    private Long id;

    private String nomealuno;

    private String cidade;

    private String uf;

    private String nomecurso;

    public AlunoDTO(Long id, String nomealuno, String cidade, String uf, String nomecurso) {
        this.id = id;
        this.nomealuno = nomealuno;
        this.cidade = cidade;
        this.uf = uf;
        this.nomecurso = nomecurso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomealuno() {
        return nomealuno;
    }

    public void setNomealuno(String nomealuno) {
        this.nomealuno = nomealuno;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
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
