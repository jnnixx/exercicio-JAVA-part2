import java.util.ArrayList;

public class MainTeste {
    public static void main(String[] args) {
        Treinador treinador1 = new Treinador(1,"Ash",10,"Masc","Pallet","Kantou");
        Pokemon pokemon1 = new Pokemon(1,"Pikachu",35,12,"Masc","Eletrico","Rato","Terrestre","Static",6.0,0.4,"pequeno");
        Pokebola pokebola1 = new Pokebola(1,"Pokeball","Pokebola comun",1,1,pokemon1);
        pokemon1.setSaude(32);
        System.out.println(pokemon1.getSaude());
        pokemon1.setNivel(20);
        System.out.println(pokemon1.getNivel());
        pokemon1.setEvolucao(13);
        pokemon1.setPeso(1000.0,"gigante");
        pokemon1.setAltura(10.2,"pequeno");

        ArrayList<Pokebola> pokes = new ArrayList<>();
        pokes.add(pokebola1);
        System.out.println(pokes);



    }

}
