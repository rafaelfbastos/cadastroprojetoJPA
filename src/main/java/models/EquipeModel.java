package models;

public class EquipeModel {
    private String projeto;
    private int matricula;
    private String nome;
    private String email;
    private String curso;
    private String telefone;


    public EquipeModel(ProjetoModel projeto, AlunoModel aluno) {
        this.projeto = projeto.getTitulo();
        this.matricula = aluno.getMatricula();
        this.nome = aluno.getNome();
        this.email = aluno.getEmail();
        this.curso = aluno.getCurso();
        this.telefone = aluno.getTelefone();
    }

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
