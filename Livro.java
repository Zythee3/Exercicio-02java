package Exercicio2;

public class Livro {
    
    private int idLivro;
    private String titulo;
    private String assunto;

    // construtor
    Livro (int idLivro, String titulo, String assunto){
        
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.assunto = assunto;

    }

    // getters
    public int getIdLivro (){
        return idLivro;
    }

    public String getTitulo (){
        return titulo;
    }

    public String getAssunto (){
        return assunto;
    }

    // setters
    public void setTitulo (String titulo){
        this.titulo = titulo;
    }

    public void setAssunto (String assunto){
        this.assunto = assunto;
    }
}
