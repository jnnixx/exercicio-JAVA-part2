public class Pokebola {
    private int idPokebola;
    private String nome;
    private String descricao;
    private int idTreinador;
    private int idPokemon;
    private Pokemon pokemon;

    public Pokebola(int idPokebola, String nome, String descricao, int idTreinador, int idPokemon, Pokemon pokemon) {
        this.idPokebola = idPokebola;
        this.nome = nome;
        this.descricao = descricao;
        this.idTreinador = idTreinador;
        this.idPokemon = idPokemon;
        this.pokemon = pokemon;
    }

    public int getIdPokebola() {
        return idPokebola;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getIdTreinador() {
        return idTreinador;
    }

}
