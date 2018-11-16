/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author flavio
 */
public class MinhaClasseRunnable extends Thread{
    private String nomeArquivo;
    private int qtdArquivos;
    private int tempo;
    private int prioridade;

    public MinhaClasseRunnable(String nomeArquivo, int qtdArquivos, int tempo, int prioridade) {
        this.nomeArquivo = nomeArquivo;
        this.qtdArquivos = qtdArquivos;
        this.tempo = tempo;
        this.prioridade = prioridade;
        //Thread t = new Thread(this);
        //t.start();
    }
    
    public void Run(){
        for(int c = 0;c < 1000; c++){
            System.out.println(c);
        }
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public int getQtdArquivos() {
        return qtdArquivos;
    }

    public void setQtdArquivos(int qtdArquivos) {
        this.qtdArquivos = qtdArquivos;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
    
    
}
