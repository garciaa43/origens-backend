package model.entidade;

import jakarta.persistence.*;

@Entity
@Table(name = "agenda")
public class AgendaVO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String atividade;

    private String qualidadeAlimentacao;

    private String observacao;

    private String imagemAtividade;

    public AgendaVO(Integer id, String atividade, String qualidadeAlimentacao, String observacao, String imagemAtividade) {
        this.id = id;
        this.atividade = atividade;
        this.qualidadeAlimentacao = qualidadeAlimentacao;
        this.observacao = observacao;
        this.imagemAtividade = imagemAtividade;
    }

    public AgendaVO() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getQualidadeAlimentacao() {
        return qualidadeAlimentacao;
    }

    public void setQualidadeAlimentacao(String qualidadeAlimentacao) {
        this.qualidadeAlimentacao = qualidadeAlimentacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getImagemAtividade() {
        return imagemAtividade;
    }

    public void setImagemAtividade(String imagemAtividade) {
        this.imagemAtividade = imagemAtividade;
    }
}
