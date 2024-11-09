package aed;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class timeHeapTests {
    private int cantCiudades;
    private Traslado[] listaTraslados;
    private TimeHeap heap;

    @BeforeEach
    void init(){
        //Reiniciamos los valores de las ciudades y traslados antes de cada test
        heap = new TimeHeap();
        cantCiudades = 7;
        listaTraslados = new Traslado[] {
                                            new Traslado(1, 0, 1, 100, 10),
                                            new Traslado(2, 0, 1, 400, 20),
                                            new Traslado(3, 3, 4, 500, 50),
                                            new Traslado(4, 4, 3, 500, 11),
                                            new Traslado(5, 1, 0, 1000, 40),
                                            new Traslado(6, 1, 0, 1000, 41),
                                            new Traslado(7, 6, 3, 2000, 42)
                                        };
    }

    @Test
    void encolar_un_elemento() {
        Traslado traslado= new Traslado(1, 0, 1, 100, 10);
        heap.encolar(traslado);
        assertEquals(traslado, heap.Minimo());
    }

    @Test
    void array2heap(){
        heap.ArrayToHeap(listaTraslados);
        assertEquals(listaTraslados[0], heap.Minimo());
        assertEquals(listaTraslados[0], heap.desencolarMin());


    }

}
