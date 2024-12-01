package com.mycompany.simuladorboletos;

public class CategoriaAsientos {
    private String nombre;
    private double precio;
    private int disponibilidad;

    public CategoriaAsientos(String nombre, double precio, int disponibilidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public boolean venderAsientos(int cantidad) {
        if (cantidad <= disponibilidad) {
            disponibilidad -= cantidad;
            return true;
        } else {
            System.out.println("No hay suficientes asientos disponibles.");
            return false;
        }
    }
}
