package br.com.etec.pedro.cursoapi.model;


import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "Aluno")

public class Aluno {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Long idaluno;
  private String nomealuno;

  @ManyToOne
  @JoinColumn(name = "idcurso")
  private Curso curso;
  
  @ManyToOne
  @JoinColumn(name = "idcidade")
  private Cidade cidade;


  public Curso getCurso() {
    return curso;
  }
  public void setCurso(Curso curso) {
    this.curso = curso;
  }
  public Cidade getCidade() {
    return cidade;
  }
  public void setCidade(Cidade cidade) {
    this.cidade = cidade;
  }

  public String getNomealuno() {
    return nomealuno;
  }

  public void setNomealuno(String nomealuno) {
    this.nomealuno = nomealuno;
  }

  public Long getIdaluno() {
    return idaluno;
  }

  public void setIdaluno(Long idaluno) {
    this.idaluno = idaluno;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Aluno aluno = (Aluno) o;
    return idaluno.equals(aluno.idaluno);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idaluno);
  }
}
