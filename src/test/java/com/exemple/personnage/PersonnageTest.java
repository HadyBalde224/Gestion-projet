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

        // Assert
        assertEquals(Orientation.EST, resultat);
    }
    @Test
    void testTourner2DepuisNord() {
        // Arrange
        Personnage personnage = new Personnage();

        // Act
        Orientation resultat = personnage.tourner(2);

        // Assert
        assertEquals(Orientation.SUD, resultat);
    }
}
