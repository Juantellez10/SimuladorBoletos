package com.mycompany.simuladorboletos;

import java.util.*;

public class SimuladorBoletos {

    public static void main(String[] args) {
        System.out.println("Bienvenido al Simulador de Venta de Boletos de Conciertos Tomorrowland");

        // Categorías de asientos
        CategoriaAsientos vip = new CategoriaAsientos("VIP", 150.0, 50);
        CategoriaAsientos general = new CategoriaAsientos("General", 50.0, 200);
        CategoriaAsientos economico = new CategoriaAsientos("Económico", 30.0, 300);

        // Lista de conciertos
        Concierto concierto1 = new Concierto("Tomorrowland Belgica", "2025-04-20", Arrays.asList(vip, general, economico));
        Concierto concierto2 = new Concierto("Tomorrowland Brasil ", "2025-11-20", Arrays.asList(vip, general, economico));

        List<Concierto> conciertos = Arrays.asList(concierto1, concierto2);

        Scanner scanner = new Scanner(System.in);
        CarritoCompras carrito = new CarritoCompras();

        System.out.println("Conciertos disponibles:");
        for (int i = 0; i < conciertos.size(); i++) {
            System.out.println((i + 1) + ". " + conciertos.get(i).getNombre() + " - Fecha: " + conciertos.get(i).getFecha());
        }

        System.out.print("Seleccione un concierto (1 o 2): ");
        int opcionConcierto = scanner.nextInt();
        Concierto conciertoSeleccionado = conciertos.get(opcionConcierto - 1);

        conciertoSeleccionado.mostrarCategorias();
        System.out.print("Seleccione una categoría: ");
        int opcionCategoria = scanner.nextInt();
        CategoriaAsientos categoriaSeleccionada = conciertoSeleccionado.getCategorias().get(opcionCategoria - 1);

        System.out.print("¿Cuántas entradas desea comprar? ");
        int cantidad = scanner.nextInt();

        if (categoriaSeleccionada.venderAsientos(cantidad)) {
            carrito.agregarEntrada(categoriaSeleccionada.getNombre(), cantidad);
        }

        carrito.mostrarCarrito();
        System.out.println("Gracias por su compra. ¡Disfrute del concierto!");
    }
}
