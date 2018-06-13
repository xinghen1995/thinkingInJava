package com.priv.enumerated;
// Enums using "tables" instead of multiple dispatch.

import static com.priv.enumerated.Outcome.DRAW;
import static com.priv.enumerated.Outcome.LOSE;
import static com.priv.enumerated.Outcome.WIN;

public enum RoShamBo6 implements Competitor<RoShamBo6> {
    PAPER, SCISSORS, ROCK;
    private static Outcome[][] table = new Outcome[][]{
            {DRAW, LOSE, WIN}, // PAPER
            {WIN, DRAW, LOSE}, // SCISSORS
            {LOSE, WIN, DRAW}, // ROCK
    };

    @Override
    public Outcome compete(RoShamBo6 other) {
        return table[this.ordinal()][other.ordinal()];
    }

    public static void main(String[] args) {
        RoShamBo.play(RoShamBo6.class, 20);
    }
}
