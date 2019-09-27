package fr.umontpellier.iut.exo2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormuleTest {
    @Test
    public void test_2_times_3() {
        Formule f = new Formule("2*3");
        assertEquals(f.toString(), "{[2, *, 3]}");
    }

    @Test
    public void test_1() {
        Formule f = new Formule("1");
        assertEquals(f.toString(), "{[1]}");
    }

    @Test
    public void test_5_minus_3_plus_2() {
        Formule f = new Formule("5     - 3 + 2");
        assertEquals(f.toString(), "{[5, -, 3, +, 2]}");
    }

    @Test
    public void test_long_formula() {
        Formule f = new Formule("100*3.2-(100+50*(2-1))");
        assertEquals(f.toString(), "{[100, *, 3.2, -, (, 100, +, 50, *, (, 2, -, 1, ), )]}");
    }

    @Test
    public void test_long_formula_bis() {
        Formule f = new Formule("21-9+5*20/(947  - 6 - 891)+18");
        assertEquals(f.toString(), "{[21, -, 9, +, 5, *, 20, /, (, 947, -, 6, -, 891, ), +, 18]}");
    }


    @Test
    public void test_value_2_times_3(){
        Formule f = new Formule("2*3");
        assertEquals(f.getValeur(),6.0);
    }

    @Test
    public void test_value_1() {
        Formule f = new Formule("1");
        assertEquals(f.getValeur(), 1.0);
    }

    @Test
    public void test_value_5_minus_3_plus_2() {
        Formule f = new Formule("5 - 3 + 2");
        assertEquals(f.getValeur(), 4.0);
    }

    @Test
    public void test_value_long_formula() {
        Formule f = new Formule("100*3.2-(100+50*(2-1))");
        assertEquals(f.getValeur(), 170.0);
    }

    @Test
    public void test_value_long_formula_bis() {
        Formule f = new Formule("21-9+5*20/(947  - 6 - 891)+18");
        assertEquals(f.getValeur(), 32.0);
    }

}