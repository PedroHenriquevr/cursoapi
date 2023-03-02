package br.com.etec.pedro.cursoapi.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "curso")
public class Curso {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)

  private Integer idcurso;
  private String nomecurso;

  @OneToMany(mappedBy = "curso")
  private List<Aluno> alunos = new ArrayList<>();

  
  public Integer getIdcurso() {
    return idcurso;
  }
  public void setIdcurso(Integer idcurso) {
    this.idcurso = idcurso;
  }
  public String getNomecurso() {
    return nomecurso;
  }
  public void setNomecurso(String nomecurso) {
    this.nomecurso = nomecurso;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((idcurso == null) ? 0 : idcurso.hashCode());
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
    Curso other = (Curso) obj;
    if (idcurso == null) {
      if (other.idcurso != null)
        return false;
    } else if (!idcurso.equals(other.idcurso))
      return false;
    return true;
  }



}
