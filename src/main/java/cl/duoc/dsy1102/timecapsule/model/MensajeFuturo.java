package cl.duoc.dsy1102.timecapsule.model;

public class MensajeFuturo {
    private String autor;
    private String texto;
    private int plazoAnios;
    private int colPorcentaje;

    public MensajeFuturo(String autor, String texto, int plazoAnios, int colPorcentaje) {
        this.autor = autor;
        this.texto = texto;
        this.plazoAnios = plazoAnios;
        this.colPorcentaje = colPorcentaje;
    }
    // A continuación, los getters.
    public String getAutor() {
        return autor;
    }

    public String getTexto() {
        return texto;
    }

    public int getPlazoAnios() {
        return plazoAnios;
    }

    public int getColPorcentaje() {
        return colPorcentaje;
    }
}