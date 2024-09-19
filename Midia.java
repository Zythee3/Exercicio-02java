package Exercicio2;

public class Midia {
    
    private int idMidia;
    private String descricao;

    // construtor
    Midia (int idMidia, String descricao){
        
        this.idMidia = idMidia;
        this.descricao = descricao;

    }

    // getters
    public int getIdMidia (){
        return idMidia;
    }

    public String getDescricao (){
        return descricao;
    }

    // setters
    public void setDescricao (String descricao){
        this.descricao = descricao;
    }
    
}
