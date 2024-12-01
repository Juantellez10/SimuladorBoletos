package com.mycompany.simuladorboletos;

import java.util.List;

public class Concierto {
    private String nombre;
    private String fecha;
    private List<CategoriaAsientos> categorias;

    public Concierto(String nombre, String fecha, List<CategoriaAsientos> categorias) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.categorias = categorias;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public List<CategoriaAsientos> getCategorias() {
        return categorias;
    }

    public void mostrarCategorias() {
        System.out.println("Categorías disponibles:");
        for (int i = 0; i < categorias.size(); i++) {
            CategoriaAsientos categoria = categorias.get(i);
            System.out.println((i + 1) + ". " + categoria.getNombre() + " - Precio: " + categoria.getPrecio() +
                               "€ - Disponibles: " + categoria.getDisponibilidad());
        }
    }
}
