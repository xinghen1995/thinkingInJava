package com.priv.typeinfo;
// Using isInstance()

import com.priv.typeinfo.pets.LiteralPetCreator;
import com.priv.typeinfo.pets.Pet;
import com.priv.typeinfo.pets.Pets;
import com.priv.util.MapData;

import java.util.LinkedHashMap;
import java.util.Map;

import static com.priv.util.Print.printnb;

public class PetCount3 {
    static class PetCounter
            extends LinkedHashMap<Class<? extends Pet>, Integer> {
        public PetCounter() {
            super(MapData.map(LiteralPetCreator.allTypes, 0));
        }

        public void count(Pet pet) {
            // Class.isInstance() eliminate instanceofs:
            for (Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()) {
                if (pair.getKey().isInstance(pet))
                    put(pair.getKey(), pair.getValue() + 1);
            }
        }

        public String toString() {
            StringBuilder result = new StringBuilder("{");
            for (Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()) {
                result.append(pair.getKey().getSimpleName());
                result.append("=");
                result.append(pair.getValue());
                result.append(", ");
            }
            result.delete(result.length() - 2, result.length());
            result.append("}");
            return result.toString();
        }

        public static void main(String[] args) {
            PetCounter petCount = new PetCounter();
            for (Pet pet : Pets.createArray(20)) {
                printnb(pet.getClass().getSimpleName() + " ");
                petCount.count(pet);
            }
        }
    }
}
