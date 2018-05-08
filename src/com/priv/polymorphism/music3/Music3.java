package com.priv.polymorphism.music3;

import com.priv.polymorphism.music.Note;

import static com.priv.util.Print.print;

class Instrument {
    void play(Note n) {
        print("Instrument.play() " + n);
    }

    String what() {
        return "Instrument";
    }

    void adjust() {
        print("Adjusting instrument");
    }
}

class Wind extends Instrument {
    void play(Note n) {
        print("Wind.play() " + n);
    }

    String what() {
        return "Wind";
    }

    void adjust() {
        print("Adjusting Wind");
    }
}

class Percussing extends Instrument {
    void play(Note n) {
        print("Percussing.play() " + n);
    }

    String what() {
        return "Percussing";
    }

    void adjust() {
        print("Adjusting Percussing");
    }
}

class Stringed extends Instrument {
    void play(Note n) {
        print("Stringed.play() " + n);
    }

    String what() {
        return "Stringed";
    }

    void adjust() {
        print("Adjusting Stringed");
    }
}

class Brass extends Instrument {
    void play(Note n) {
        print("Brass.play() " + n);
    }

    String what() {
        return "Brass";
    }

    void adjust() {
        print("Adjusting Brass");
    }
}

class Woodwind extends Wind {
    void play(Note n) {
        print("Woodwind.play() " + n);
    }

    String what() {
        return "Woodwind";
    }

    void adjust() {
        print("Adjusting Woodwind");
    }
}

public class Music3 {
    public static void tune(Instrument i) {
        //...
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            tune(i);
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussing(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
        };
        tuneAll(orchestra);
    }
}
