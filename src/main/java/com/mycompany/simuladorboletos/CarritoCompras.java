package com.mycompany.simuladorboletos;

import java.util.HashMap;
import java.util.Map;

public class CarritoCompras {
    private Map<String, Integer> entradas;

    public CarritoCompras() {
        entradas = new HashMap<>();
    }

    public void agregarEntrada(String categoria, int cantidad) {
        entradas.put(categoria, entradas.getOrDefault(categoria, 0) + cantidad);
    }

    public void mostrarCarrito() {
        System.out.println("Entradas en el carrito:");
        for (Map.Entry<String, Integer> entrada : entradas.entrySet()) {
            System.out.println("Categoría: " + entrada.getKey() + " - Cantidad: " + entrada.getValue());
        }
    }
}
