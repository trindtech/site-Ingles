package entity;
public class Aluno {

    private int idAluno;
    private String nome;
    private String sobrenome;
    private String telefone;
    private String email;
    private String cep;
    private String modeloDeAula;
    private String primeiraAula;
    private String descricao;

    public Aluno() {

    }

    public Aluno(int idAluno, String nome, String sobrenome, String telefone, String email, String cep,
            String modeloDeAula, String primeiraAula, String descricao) {
        this.idAluno = idAluno;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.email = email;
        this.cep = cep;
        this.modeloDeAula = modeloDeAula;
        this.primeiraAula = primeiraAula;
        this.descricao = descricao;
    }

    public int getIdAluno() {
        return this.idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getModeloDeAula() {
        return this.modeloDeAula;
    }

    public void setModeloDeAula(String modeloDeAula) {
        this.modeloDeAula = modeloDeAula;
    }

    public String getPrimeiraAula() {
        return this.primeiraAula;
    }

    public void setPrimeiraAula(String primeiraAula) {
        this.primeiraAula = primeiraAula;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toString() {
        return "ID Aluno: " + this.idAluno + " Nome: " + this.nome + " Sobrenome: " + this.sobrenome + " Telefone: "
                + this.telefone + " Email: " + this.email + " CEP: " + this.cep + " Modelo de aula: " + modeloDeAula
                + " Primeira aula: " + this.primeiraAula + " Descrição: " + this.descricao;
    }
}
