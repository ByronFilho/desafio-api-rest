package dio.web.api.model;

public class Despesa {
    private Integer id;
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
