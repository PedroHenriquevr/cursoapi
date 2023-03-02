package br.com.etec.pedro.cursoapi.model;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "aluno")
public class Aluno {

  private Long id;
  private String nomeAluno;

  @ManyToOne
  @JoinColumn(name = "idCurso")
  private Curso curso;
  
  @ManyToOne
  @JoinColumn(name = "idCidade")
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

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  
  public String getNomeAluno() {
    return nomeAluno;
  }
  public void setNomeAluno(String nomeAluno) {
    this.nomeAluno = nomeAluno;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Aluno other = (Aluno) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }
 
  
  
  


  
}
