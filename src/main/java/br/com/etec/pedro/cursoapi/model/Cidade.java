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
@Table(name = "cidade")
public class Cidade {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)

  private Integer idCidade;
  private String nomeCidade;
  private String uf;

  @OneToMany(mappedBy = "cidade")
    private List<Aluno> alunos = new ArrayList<>();
  
  public Integer getIdCidade() {
    return idCidade;
  }
  public void setIdCidade(Integer idCidade) {
    this.idCidade = idCidade;
  }

  public String getNomeCidade() {
    return nomeCidade;
  }
  public void setNomeCidade(String nomeCidade) {
    this.nomeCidade = nomeCidade;
  }
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((idCidade == null) ? 0 : idCidade.hashCode());
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
    Cidade other = (Cidade) obj;
    if (idCidade == null) {
      if (other.idCidade != null)
        return false;
    } else if (!idCidade.equals(other.idCidade))
      return false;
    return true;
  }

  



  
}
