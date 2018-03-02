public class Pessoa {
    Pilha operacoes = new Pilha();

    private String nome;
    private double salario;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa(String nome, double salario, int idade) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa [" +
                "nome = '" + nome + '\'' +
                ", salario = " + salario +
                ", idade = " + idade +
                ']';
    }
}
