public class Pokemon {
    private int idPokemon;
    private String nome;
    private int saude;
    private int nivel;
    private String genero;
    private String tipo;
    private String especie;
    private String fraqueza;
    private String habilidade;
    private double peso;
    private double altura;
    private int evolucao;
    private  String tamanho;

  

    public Pokemon(int idPokemon, String nome, int saude, int nivel, String genero, String tipo, String especie, String fraqueza, String habilidade, double peso, double altura,String tamanho) {
        this.idPokemon = idPokemon;
        this.nome = nome;
        this.saude = saude;
        this.nivel = nivel;
        this.genero = genero;
        this.tipo = tipo;
        this.especie = especie;
        this.fraqueza = fraqueza;
        this.habilidade = habilidade;
        this.peso = peso;
        this.altura = altura;
        this.tamanho = tamanho;
    }

    public int getIdPokemon() {
        return idPokemon;
    }


    public String getNome() {
        return nome;
    }


    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        if(saude >= 0 && nivel > 3) {
            saude += 5;
            this.saude = saude;
        }
    }

    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        nivel ++;
        this.nivel = nivel;
    }

    public String getGenero() {
        return genero;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEspecie() {
        return especie;
    }

    public String getFraqueza() {
        return fraqueza;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public String getTamanho() {
        return tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso, String tamanho) {
        if(peso > 0.1 && peso < 50 && tamanho.equals("pequeno")) {
            this.peso = peso;
            System.out.println("seu pokemon está pesando " + peso + " Kg.");
        }else if (peso > 50.1 && peso < 120 && tamanho.equals("médio")){
            this.peso = peso;
            System.out.println("seu pokemon está pesando " + peso + " Kg.");
        }else if (peso > 120.1 && peso <= 400 && tamanho.equals("grande")){
            this.peso = peso;
            System.out.println("seu pokemon está pesando " + peso + " Kg.");
        } else if(peso > 400.1 && peso <=1000.0 && tamanho.equals("gigante")){
            this.peso = peso;
            System.out.println("seu pokemon está pesando " + peso + " Kg.");
        }else{
            System.out.println("Peso invalido para o tamanho do pokémon");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura,String tamanho) {
        if(altura > 0.1 && altura < 12.2 && tamanho.equals("pequeno")) {
            this.altura = altura;
            System.out.println("seu pokemon tem " + altura + " de altura.");
        }else if (altura > 12.3 && altura < 20.1 && tamanho.equals("médio")){
            this.altura = altura;
            System.out.println("seu pokemon tem " + altura + " de altura.");
        }else if (altura > 20.2 && altura <= 28.29 && tamanho.equals("grande")){
            this.altura = altura;
            System.out.println("seu pokemon tem " + altura + " de altura.");
        } else if(altura > 28.30 && altura <=70.0 && tamanho.equals("gigante")){
            this.altura = altura;
            System.out.println("seu pokemon tem " + altura + " de altura.");
        }else{
            System.out.println("tamanho invalido.");
        }
    }

    public int getEvolucao() {
        return evolucao;
    }

    public void setEvolucao(int nivel) {
        if (nivel >=16) {
            System.out.println("Seu pokémon evoluiu!");
            this.nivel = nivel;
        }else {
            System.out.println("Ainda falta xp para o pokémon evoluir.");
        }
    }
}
