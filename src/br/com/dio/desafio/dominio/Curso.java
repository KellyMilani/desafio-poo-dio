package br.com.dio.desafio.dominio;

public class Curso {
   private string titulo;
   private string descricao;

    public string getTitulo() {
        return titulo;
    }

    public void setTitulo(string titulo) {
        this.titulo = titulo;
    }

    public string getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(string descriçao) {
        this.descriçao = descriçao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    private int cargaHoraria;

    @Override
    public String toString() {
        String s = "Curso{" +
                "titulo=" + titulo +
                ", descriçao=" + descriçao +
                ", cargaHoraria=" + cargaHoraria +
                '}';

    }
}

