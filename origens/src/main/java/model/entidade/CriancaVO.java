package model.entidade;

import jakarta.persistence.*;
import java.time.LocalDate;



@Entity
@Table(name = "crianca")
public class CriancaVO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private LocalDate dataNascimento;

    private String senha;

    private String telefoneResponsavel;

    private String nomeResponsavel;

    @OneToOne
    @JoinColumn(name = "idagenda")
    private int agenda;

    public CriancaVO(Integer id, String nome, LocalDate dataNascimento, String senha, String telefoneResponsavel, String nomeResponsavel, int agenda) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.telefoneResponsavel = telefoneResponsavel;
        this.nomeResponsavel = nomeResponsavel;
        this.agenda = agenda;
    }

    public CriancaVO() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefoneResponsavel() {
        return telefoneResponsavel;
    }

    public void setTelefoneResponsavel(String telefoneResponsavel) {
        this.telefoneResponsavel = telefoneResponsavel;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public int getAgenda() {
        return agenda;
    }

    public void setAgenda(int agenda) {
        this.agenda = agenda;
    }
}
