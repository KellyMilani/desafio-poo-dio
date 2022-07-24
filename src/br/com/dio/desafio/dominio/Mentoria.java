package br.com.dio.desafio.dominio;

public class Mentoria {
    private string titulo;
    private string descricao;

    public Mentoria(string titulo) {
        this.titulo = titulo;
    }

    public string getTitulo() {
        return titulo;
    }

    public void setTitulo(string titulo) {
        this.titulo = titulo;
    }

    public string getDescrição() {
        return descrição;
    }

    public void setDescrição(string descrição) {
        this.descrição = descrição;
    }

    public localDate getData() {
        return data;
    }

    public void setData(localDate data) {
        this.data = data;
    }

    private localDate data;

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo=" + titulo +
                ", descrição=" + descrição +
                ", data=" + data +
                '}';
    }
}
