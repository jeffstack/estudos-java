package tp03;

public class Pessoa {

    protected static int kp;
    protected String nome;
    protected char sexo;
    protected int idade;
    private boolean jaContada;

    // Jefferson Nascimento
    public Pessoa() {
        nome = "";
        sexo = ' ';
        idade = 0;
        jaContada = false;
    }

    // Jefferson Nascimento
    public Pessoa(String nome, char sexo, int idade) {
        this();
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        setKp();
    }

    // Jefferson Nascimento
    public void setKp() {
        if (!jaContada) {
            kp++;
            jaContada = true;
        }
    }

    // Jefferson Nascimento
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Jefferson Nascimento
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    // Jefferson Nascimento
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Jefferson Nascimento
    public int getKp() {
        return kp;
    }

    // Jefferson Nascimento
    public String getNome() {
        return nome;
    }

    // Jefferson Nascimento
    public char getSexo() {
        return sexo;
    }

    // Jefferson Nascimento
    public int getIdade() {
        return idade;
    }
}
