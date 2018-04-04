package com.priv.generics;

import com.priv.typeinfo.Person;
import com.priv.typeinfo.pets.Pet;
import com.priv.util.New;

import java.util.List;
import java.util.Map;

public class SimplerPets {
    public static void main(String[] args) {
        Map<Person, List<? extends Pet>> petPeople = New.map();
    }
}
