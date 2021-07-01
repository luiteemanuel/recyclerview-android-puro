package model;

//this comment

public class Filmes {

    int imagem;
    String titulo;
    String descricao;

    public Filmes() {
    }

    public Filmes(int imagem, String titulo, String descricao) {
        this.imagem = imagem;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public int getImagem() {
        return imagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
