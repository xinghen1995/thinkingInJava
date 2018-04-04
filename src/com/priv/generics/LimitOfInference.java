package com.priv.generics;

import com.priv.typeinfo.Person;
import com.priv.typeinfo.pets.Pet;
import com.priv.util.New;

import java.util.List;
import java.util.Map;

public class LimitOfInference {
    static void f(Map<Person, List<? extends Pet>> petPeople) { }
    public static void main(String[] args) {
        f(New.map());
    }
}
