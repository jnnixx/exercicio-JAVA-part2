import java.util.ArrayList;

public class Treinador {
    private int idTreinador;
    private  String nome;
    private int idade;
    private String genero;
    private String cidade;
    private String regiao;

    ArrayList<Pokebola> pokes = new ArrayList<>();
    public Treinador(int idTreinador, String nome, int idade, String genero, String cidade, String regiao) {
        this.idTreinador = idTreinador;
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.cidade = cidade;
        this.regiao = regiao;

    }

    public int getIdTreinador() {
        return idTreinador;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getGenero() {
        return genero;
    }

    public String getCidade() {
        return cidade;
    }

    public String getRegiao() {
        return regiao;
    }
}
