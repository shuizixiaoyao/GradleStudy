package com.gradle.study;

import java.util.Objects;

public class Chance {
    private final double fraction;

    public Chance(double fraction) {
        this.fraction = fraction;
    }

    public double getFraction() {
        return fraction;
    }

    public Chance not() {
        return new Chance(1 - fraction);
    }

    public Chance and(Chance chanceAnother) {
        return new Chance(fraction * chanceAnother.getFraction());
    }

    public Chance or(Chance chanceAnother) {
        return new Chance(fraction + chanceAnother.getFraction() - fraction * chanceAnother.getFraction());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chance chance = (Chance) o;
        return Double.compare(chance.fraction, fraction) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fraction);
    }
}
