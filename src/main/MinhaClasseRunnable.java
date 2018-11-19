/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author flavio
 */
public class MinhaClasseRunnable extends Thread{
    private String nomeArquivo;
    private int qtdArquivos;
    private int tempo;
    private long tempoExecucao;
    private int prioridade;
    
    public MinhaClasseRunnable() {
        this.nomeArquivo = "";
        this.qtdArquivos = 0;
        this.tempo = 0;
        this.prioridade = 0;
    }

    public MinhaClasseRunnable(String nomeArquivo, int qtdArquivos, int tempo, int prioridade) {
        this.nomeArquivo = nomeArquivo;
        this.qtdArquivos = qtdArquivos;
        this.tempo = tempo;
        this.prioridade = prioridade;
        //Thread t = new Thread(this);
        //t.start();
    }
    
    public void run(){        
        System.out.println(""+this.getNomeArquivo()+"");
        for(int x = 1; x <= 5; x++){
            System.out.println("Arquivo " + x +" Imprimindo");
            try {
                this.sleep(tempo);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }                            
    }
    
    public long getTempoExecucao() {
        return this.tempoExecucao;
    }

    public void setTempoExecucao(long  t) {
        this.tempoExecucao = t;
    }
    
    public String getNomeArquivo() {
        return this.nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public int getQtdArquivos() {
        return this.qtdArquivos;
    }

    public void setQtdArquivos(int qtdArquivos) {
        this.qtdArquivos = qtdArquivos;
    }

    public int getTempo() {
        return this.tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public int getPrioridade() {
        return this.prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
    
    
}
