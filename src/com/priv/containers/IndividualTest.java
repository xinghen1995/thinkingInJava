package com.priv.containers;

import com.priv.holding.MapOfList;
import com.priv.typeinfo.pets.Individual;
import com.priv.typeinfo.pets.Pet;

import java.util.*;

public class IndividualTest {
    public static void main(String[] args) {
        Set<Individual> pets = new TreeSet<>();
        for (List<? extends Pet> lp :
                MapOfList.petPeople.values())
            for (Pet p : lp)
                pets.add(p);
        System.out.println(pets);
    }
}
