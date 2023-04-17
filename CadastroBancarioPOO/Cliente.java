public class Cliente {
    private String cpf;
    private String nome;
    private Endereco endereco;
    private Telefone telefone;
    private ContaBancaria contaBancaria; 

    public Cliente(String cpf, String nome, Endereco endereco, Telefone telefone, ContaBancaria contaBancaria){
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.contaBancaria = contaBancaria; 
    }

    public String getCpf() {
        return cpf; 
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public ContaBancaria getContaBancaria() {
        return contaBancaria;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public void setContaBancaria(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }
}