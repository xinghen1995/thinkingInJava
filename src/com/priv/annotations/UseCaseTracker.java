package com.priv.annotations;

import java.lang.reflect.*;
import java.util.*;

public class UseCaseTracker {
    public static void
    trackUseCases(List<Integer> useCase, Class<?> cl) {
        for(Method m : cl.getDeclaredMethods()) {
            UseCase uc = m.getAnnotation(UseCase.class);
            if(uc != null) {
                System.out.println("Found Use Case: " + uc.id() + " " + uc.description());
                useCase.remove(new Integer(uc.id()));
            }
        }
        for(int i : useCase) {
            System.out.println("Warning:Missing use case-" + i);
        }
    }
    public static void main(String[] args) {
        List<Integer> useCases = new ArrayList<Integer>();
        Collections.addAll(useCases, 47, 48, 49, 50, 51);
        trackUseCases(useCases, PasswordUtils.class);
    }
}
