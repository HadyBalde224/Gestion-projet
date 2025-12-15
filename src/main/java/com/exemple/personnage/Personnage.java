package com.exemple.personnage;

public class Personnage {

    private Orientation orientation;
    private static final Orientation[] ORIENTATIONS = {
            Orientation.NORD, Orientation.EST, Orientation.SUD, Orientation.OUEST
    };

    public Personnage() {
        this.orientation = Orientation.NORD;
    }
    public Orientation tourner(int fois) {
        int indexActuel = getIndexOrientation(orientation);
        int nouvelIndex = (indexActuel + fois) % 4;
        orientation = ORIENTATIONS[nouvelIndex];
        return orientation;
    }

    public Orientation getOrientation() {
        return orientation;
    }
    private int getIndexOrientation(Orientation orient) {
        for (int i = 0; i < ORIENTATIONS.length; i++) {
            if (ORIENTATIONS[i] == orient) {
                return i;
            }
        }
        return 0;
    }
}
