package com.priv.typeinfo;

import com.priv.typeinfo.pets.Pet;
import com.priv.typeinfo.pets.Pets;
import com.priv.util.TypeCounter;

import static com.priv.util.Print.print;
import static com.priv.util.Print.printnb;

public class PetCount4 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for (Pet pet : Pets.createArray(20)) {
            printnb(pet.getClass().getSimpleName() + " ");
            counter.count(pet);
        }
        print();
        print(counter);
    }
}
