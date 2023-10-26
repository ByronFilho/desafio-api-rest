package dio.web.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Despesa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String descricao;

    private Double valor;
    
    public Despesa() {
    }
    public Despesa(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }
    public Integer getId() {
        return id;
    }
    public String getDescricao() {
        return descricao;
    }
    public Double getValor() {
        return valor;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "Despesa [id=" + id + ", descricao=" + descricao + ", valor=" + valor + "]";
    }
    
    
}
