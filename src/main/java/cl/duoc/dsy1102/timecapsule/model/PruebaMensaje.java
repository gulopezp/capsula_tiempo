package cl.duoc.dsy1102.timecapsule.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PruebaMensaje {

    public static void main(String[] args) {

        ArrayList<MensajeFuturo> mensajes = new ArrayList<>();
        mensajes.add(new MensajeFuturo("Guillermo","Texto 1: Nunca abandones tus sueños.",5, 50));
        mensajes.add(new MensajeFuturo("Guillermo","Texto 2: Comprate un auto.",5, 50));
        mensajes.add(new MensajeFuturo("Guillermo","Texto 3: Haz más deporte.",5, 50));
        mensajes.add(new MensajeFuturo("Guillermo","Texto 4: Sal de vacaciones.",5, 50));
        mensajes.add(new MensajeFuturo("Guillermo","Texto 5: Sigue estudiando.",5, 50));

        for (MensajeFuturo mensaje : mensajes) {
        System.out.println("Autor: " + mensaje.getAutor());
        System.out.println("Mensaje: " + mensaje.getTexto());
        System.out.println("Leer dentro de: " + mensaje.getPlazoAnios() + " años");
        System.out.println("//////////////////////////////////////////////////////////////////");
        }

        for (int i= 0; i < mensajes.size(); i++) {
            System.out.println("Autor: " + mensajes.get(i).getAutor());
            System.out.println("Mensaje: " + mensajes.get(i).getTexto());
            System.out.println("Leer dentro de: " + mensajes.get(i).getPlazoAnios() + " años");
            System.out.println("//////////////////////////////////////////////////////////////////");

        }
    }
}
