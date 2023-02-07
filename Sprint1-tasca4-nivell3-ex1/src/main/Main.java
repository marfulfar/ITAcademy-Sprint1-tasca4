package main;

import pokemon.Pokemon;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;

public class Main {
    public static void main(String[] args) {


    }//closes main

    public void triggerOutOfBounds(){
        ArrayList<Integer> nums = new ArrayList<>();
            nums.get(2);
    }

}//closes class