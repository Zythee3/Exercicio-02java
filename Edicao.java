package Exercicio2;
import java.util.Date;

public class Edicao {
    
    private int idEdicao;
    private int ano;
    private char situacao;
    private Date ultimoEmprestimo;


    Edicao (int idEdicao, int ano, char situacao, Date ultimoEmprestimo){

        this.idEdicao = idEdicao;
        this.ano = ano;
        this.situacao = situacao;
        this.ultimoEmprestimo = ultimoEmprestimo;

    }

    // getters
    public int getIdicao (){
        return idEdicao;
    }

    public int getAno (){
        return ano;
    }

    public char getSituacao (){
        return situacao;
    }

    public Date getUltimoEmprestimo (){
        return ultimoEmprestimo;
    }

    // setters
    public void setAno (int ano){
        this.ano = ano;
    }

}
