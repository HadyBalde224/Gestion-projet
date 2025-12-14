package com.exemple.personnage;

public class Personnage {
    private Orientation orientation;

    //public Personnage() {
     //   this.orientation = Orientation.NORD;
    //}

    public Orientation tourner(int fois) {
        if (fois == 1) {
            orientation = Orientation.EST;
        } else if (fois == 2) {
            orientation = Orientation.SUD;
        } else if (fois == 3) {
            orientation = Orientation.OUEST;
        }
        return orientation;
    }
    }
