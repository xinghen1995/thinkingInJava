package com.priv.holding;

/**
 * 如果一个一个类已经继承自其它类那么为了迭代它持有的对象，
 * 创建iterator()是最好的方案。此时，已经不能继承AbstractCollection类，
 * 同时即使继承了AbstractCollection还是要实现和iterator()和size()方法。
 */

import com.priv.typeinfo.pets.Pet;
import com.priv.typeinfo.pets.Pets;

import java.util.Iterator;

class PetSequence {
    protected Pet[] pets = Pets.createArray(8);
}

public class NonCollectionSequence extends PetSequence {
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
        };
    }

    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
        InterfaceVsIterator.display(nc.iterator());
    }
}
