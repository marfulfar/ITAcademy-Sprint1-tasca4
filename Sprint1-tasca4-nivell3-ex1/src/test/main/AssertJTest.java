package main;

import org.junit.Test;
import pokemon.Pokemon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;


public class AssertJTest {


    public Pokemon bulbasaur = new Pokemon("bulbasaur",5,"plant");
    public Pokemon bulbasaur2 = new Pokemon("bulbasaur",5,"plant");
    public Pokemon charmander = new Pokemon("charmander",6,"fire");
    public Pokemon squirtle = new Pokemon("squirtle",4,"water");

//Exercise 1
    @Test
    public void isNotTheSamePokemon(){
        //Pokemon bulbasaur = new Pokemon("bulbasaur",5,"plant");
        //Pokemon bulbasaur2 = new Pokemon("bulbasaur",5,"plant");

        assertThat(bulbasaur).isNotEqualTo(bulbasaur2);
    }

    @Test
    public void isTheSamePokemon(){
        //Pokemon bulbasaur = new Pokemon("bulbasaur",5,"plant");
        //Pokemon bulbasaur2 = new Pokemon("bulbasaur",5,"plant");

        assertThat(bulbasaur).isEqualToComparingFieldByField(bulbasaur2);
    }

//Exercise 2
    @Test
    public void isNotTheSameReference(){

        assertThat(bulbasaur.hashCode()).isNotEqualTo(bulbasaur2.hashCode());

    }

    @Test
    public void isTheSameReference(){

        bulbasaur = bulbasaur2;
        assertThat(bulbasaur.hashCode()).isEqualTo(bulbasaur2.hashCode());

    }

//Exercise 3
    @Test
    public void identicalIntegerArrays(){
        Integer[] array1 = {1,2,3,4,5};
        Integer[] array2 = {1,2,3,4,5};
        assertThat(array1).isEqualTo(array2);
    }

//Exercise 4
    @Test
    public void arrayListCorrectOrder(){
        ArrayList<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(bulbasaur);
        pokemons.add(charmander);
        pokemons.add(squirtle);

        assertThat(pokemons).containsExactly(bulbasaur,charmander,squirtle);

    }

    @Test
    public void arrayListNoDuplicates(){
        ArrayList<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(bulbasaur);
        pokemons.add(charmander);

        assertThat(pokemons).contains(bulbasaur,charmander)
                .doesNotHaveDuplicates()
                .doesNotContain(squirtle);
    }


//Exercise 5
    @Test
    public void checkingKeyInMap(){
        HashMap<String,Pokemon> pokeNames = new HashMap<>();
        pokeNames.put("bulbasaur", bulbasaur);
        pokeNames.put("squirtle",squirtle);

        assertThat(pokeNames).containsKey("squirtle");
    }

//Exercise 6
//interface not valid, not finding any way the import system works
    @Test
    public void outOfBounds(){


    }


//Exercise 7
    @Test
    public void optionalObject(){
        Optional opt = Optional.empty();

        assertThat(opt != null && (!opt.isEmpty()));
    }


}//closes test class