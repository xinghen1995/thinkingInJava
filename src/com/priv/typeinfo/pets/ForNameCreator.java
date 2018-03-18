package com.priv.typeinfo.pets;
import java.util.*;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types =
            new ArrayList<Class<? extends Pet>>();
    private static String[] typeNames = {
            "com.priv.typeinfo.pets.Mutt",
            "com.priv.typeinfo.pets.Pug",
            "com.priv.typeinfo.pets.EgyptianMau",
            "com.priv.typeinfo.pets.Manx",
            "com.priv.typeinfo.pets.Cymric",
            "com.priv.typeinfo.pets.Rat",
            "com.priv.typeinfo.pets.Mouse",
            "com.priv.typeinfo.pets.Hamster",
    };
    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for(String name : typeNames)
                types.add(
                        (Class<? extends Pet>)Class.forName(name));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    static { loader(); }
    public List<Class<? extends Pet>> types() { return types; }
}
