package com.priv.generics;

import com.priv.typeinfo.Person;
import com.priv.typeinfo.pets.Pet;
import com.priv.util.New;

import java.util.List;
import java.util.Map;

public class ExplicitTypeSpecification {
    static void f(Map<Person, List<? extends Pet>> petPeople) { }
    public static void main(String[] args) {
        f(New.<Person, List<? extends Pet>>map());
    }
}
