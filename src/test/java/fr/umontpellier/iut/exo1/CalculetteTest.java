package fr.umontpellier.iut.exo1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CalculetteTest {



    Calculette calculette;

    @BeforeEach
    void setUp() {
        calculette = new Calculette();
        calculette.calculer("+",300);
    }

    @Test
    void calculerPlus() {
        calculette.calculer("+",100);
        assertEquals(calculette.toString(),Double.toString(400));
    }



    @Test
    void calculerMoins() {
        calculette.calculer("-",100);
        assertEquals(calculette.toString(),Double.toString(200));
    }

    @Test
    void calculerFactor() {
        calculette.calculer("*",3);
        assertEquals(calculette.toString(),Double.toString(900));
    }


    @Test
    void calculerDivided() {
        calculette.calculer("/",3);
        assertEquals(calculette.toString(),Double.toString(100));
    }

}