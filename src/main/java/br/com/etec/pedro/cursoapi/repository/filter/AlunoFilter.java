package br.com.etec.pedro.cursoapi.repository.filter;

public class AlunoFilter {

    private String nomealuno;

    private String nomecursos;

    private String nomecidade;

    private String uf;

    public String getNomealuno() {
        return nomealuno;
    }

    public void setNomealuno(String nomealuno) {
        this.nomealuno = nomealuno;
    }

    public String getNomecursos() {
        return nomecursos;
    }

    public void setNomecursos(String nomecursos) {
        this.nomecursos = nomecursos;
    }

    public String getNomecidade() {
        return nomecidade;
    }

    public void setNomecidade(String nomecidade) {
        this.nomecidade = nomecidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
