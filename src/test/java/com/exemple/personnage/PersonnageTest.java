package com.exemple.personnage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PersonnageTest {
    @Test
    void testTourner1DepuisNord() {
        // Arrange
        Personnage personnage = new Personnage();

        // Act
        Orientation resultat = personnage.tourner(1);
        assertEquals(Orientation.EST, resultat);
    }
    @Test
    void testTourner2DepuisNord() {
        Personnage personnage = new Personnage();
        Orientation resultat = personnage.tourner(2);
        assertEquals(Orientation.SUD, resultat);
    }
    @Test
    void testTourner3DepuisNord() {
        Personnage personnage = new Personnage();
        Orientation resultat = personnage.tourner(3);
        assertEquals(Orientation.OUEST, resultat);
    }
    @Test
    void testTourner4DepuisNord() {
        Personnage personnage = new Personnage();
        Orientation resultat = personnage.tourner(4);
        assertEquals(Orientation.NORD, resultat);
    }
    @Test
    void testTourner0() {
        Personnage personnage = new Personnage();
        Orientation resultat = personnage.tourner(0);
        assertEquals(Orientation.NORD, resultat);
    }
    @Test
    void testOrientationInitiale() {
        Personnage personnage = new Personnage();
        assertEquals(Orientation.NORD, personnage.getOrientation());
    }
    @Test
    void testTourner5DepuisNord() {
        Personnage personnage = new Personnage();
        Orientation resultat = personnage.tourner(5);
        assertEquals(Orientation.EST, resultat);
    }
    @Test
    void testRotationsSuccessives() {
        Personnage personnage = new Personnage();
        personnage.tourner(1); // EST
        Orientation resultat = personnage.tourner(1); // SUD
        assertEquals(Orientation.SUD, resultat);
    }

    }


