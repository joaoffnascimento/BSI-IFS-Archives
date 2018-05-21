public class Pessoa implements Comparable {

    private String nome;
    private int idade;
    private int cpf;

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Pessoa() {
    }
    public Pessoa(String nome, int idade) {
        this(nome, idade, 0);
    }
    public Pessoa(String nome, int idade, int cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int compareTo(Object o) {
        Pessoa other = (Pessoa) o;

        if (getIdade() < other.getIdade()) {
            return 1;
        } else if (getIdade() > other.getIdade()) {
            return -1;
        } else {
            return 0;
        }
    }

    //Padrao de projeto executor / comand
    @Override
    public boolean equals(Object o) {
        if (o instanceof Pessoa) {
            return ((Pessoa) o).cpf == this.cpf || ((Pessoa) o).nome == getNome();
        } else if (o != null) {
            //Parse no valor inteiro para Integer
            return new Integer(this.cpf).equals(o) || new String(this.nome).equals(o);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
