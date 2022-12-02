package com.generation.firstproject.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.generation.firstproject.models.Pera;;


//al ser test se elimina el public, no se debe acceder a el 

class Perrotest {
    @Test
    void TestAdopcion(){
        Pera peraPrueba = new Pera();

        assertEquals("que pasa malayas", peraPrueba.funcionPrueba(40));
    }
}
