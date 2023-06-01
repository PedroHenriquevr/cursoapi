package br.com.etec.pedro.cursoapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "Cidade")
public class Cidade {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)

  private Integer idcidade;
  private String nomecidade;
  private String uf;

  @JsonIgnore
  @OneToMany(mappedBy = "cidade")
  private List<Aluno> alunos = new ArrayList<>();
  

  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }


  public Integer getIdcidade() {
    return idcidade;
  }

  public void setIdcidade(Integer idcidade) {
    this.idcidade = idcidade;
  }

  public String getNomecidade() {
    return nomecidade;
  }

  public void setNomecidade(String nomecidade) {
    this.nomecidade = nomecidade;
  }

  public List<Aluno> getAlunos() {
    return alunos;
  }

  public void setAlunos(List<Aluno> alunos) {
    this.alunos = alunos;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Cidade cidade = (Cidade) o;
    return idcidade.equals(cidade.idcidade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idcidade);
  }
}
