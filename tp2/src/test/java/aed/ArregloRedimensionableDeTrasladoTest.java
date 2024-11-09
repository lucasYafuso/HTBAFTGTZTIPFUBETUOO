package aed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArregloRedimensionableDeTrasladoTest {

    @Test
    void nuevoVectorEstaVacio() {
        ArregloRedimensionableDeTraslado vector = new ArregloRedimensionableDeTraslado();

        assertEquals(0, vector.longitud());
    }

    @Test
    void agregarPocosElementos() {
        ArregloRedimensionableDeTraslado vector = new ArregloRedimensionableDeTraslado();

        vector.agregarAtras(new Traslado(1, 0, 1, 100, 10));
        vector.agregarAtras(new Traslado(2, 0, 1, 400, 20));
        vector.agregarAtras(new Traslado(3, 3, 4, 500, 50));
        vector.agregarAtras(new Traslado(4, 4, 3, 500, 11));
        vector.agregarAtras(new Traslado(5, 1, 0, 1000, 40));

        assertEquals(5, vector.longitud());
        assertEquals(1,vector.obtener(0).id());
        assertEquals(2,vector.obtener(1).id());
        assertEquals(5,vector.obtener(4).id());
        assertEquals(4,vector.obtener(3).id());
        assertEquals(3,vector.obtener(2).id());
        
    }

    @Test
    void quitarElementos() {
        ArregloRedimensionableDeTraslado vector = new ArregloRedimensionableDeTraslado();

        vector.agregarAtras(new Traslado(1, 0, 1, 100, 10));
        vector.agregarAtras(new Traslado(2, 0, 1, 400, 20));
        vector.agregarAtras(new Traslado(3, 3, 4, 500, 50));
        vector.agregarAtras(new Traslado(4, 4, 3, 500, 11));
        vector.agregarAtras(new Traslado(5, 1, 0, 1000, 40));

        vector.quitarAtras();

        assertEquals(4, vector.longitud());
        assertEquals(1,vector.obtener(0).id());
        assertEquals(2,vector.obtener(1).id());
        assertEquals(4,vector.obtener(3).id());
        assertEquals(3,vector.obtener(2).id());

        vector.quitarAtras();
        vector.quitarAtras();
        vector.quitarAtras();
        vector.quitarAtras();

        assertEquals(0, vector.longitud());

        vector.agregarAtras(new Traslado(3, 3, 4, 500, 50));

        assertEquals(1, vector.longitud());
        assertEquals(3, vector.obtener(0).id());

    }
    @Test
    void definirElementos(){
        ArregloRedimensionableDeTraslado vector = new ArregloRedimensionableDeTraslado();
        vector.definir(25,new Traslado(6, 4, 6, 1500, 45));
        assertEquals(6, vector.obtener(25).id());
        vector.definir(25,new Traslado(4, 5, 0, 20, 30));
        assertEquals(4, vector.obtener(25).id());
        vector.definir(49,new Traslado(4, 5, 0, 20, 30));
        assertEquals(4, vector.obtener(49).id());
    }

}
