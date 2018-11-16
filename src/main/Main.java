/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.logging.Level;
import java.util.logging.Logger;
import static sun.net.www.http.HttpClient.New;

/**
 *
 * @author flavio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //private String nome = "Usuário 6";
        int qtdArquivos = 5;
        int tempo = 5000;
        int prioridade = 2;
        String nome = "Usuário 6";
        MinhaClasseRunnable thread6 = new MinhaClasseRunnable(nome,qtdArquivos,tempo,prioridade);
        nome = "Usuário 5";
        MinhaClasseRunnable thread5 = new MinhaClasseRunnable(nome,qtdArquivos,tempo,prioridade);
        nome = "Usuário 4";
        MinhaClasseRunnable thread4 = new MinhaClasseRunnable(nome,qtdArquivos,tempo,prioridade);
        nome = "Usuário 1";
        prioridade = 1;
        MinhaClasseRunnable thread1 = new MinhaClasseRunnable(nome,qtdArquivos,tempo,prioridade);
        nome = "Usuário 2";
        prioridade = 1;
        MinhaClasseRunnable thread2 = new MinhaClasseRunnable(nome,qtdArquivos,tempo,prioridade);
        nome = "Usuário 3";
        prioridade = 1;
        MinhaClasseRunnable thread3 = new MinhaClasseRunnable(nome,qtdArquivos,tempo,prioridade);
        
        Thread t6 = new Thread(thread6);
        Thread t5 = new Thread(thread5);
        Thread t4 = new Thread(thread4);
        Thread t3 = new Thread(thread3);
        Thread t2 = new Thread(thread2);
        Thread t1 = new Thread(thread1);
        
        t6.start();
        int y = 1;
        while(t6.isAlive()){
            System.out.println("Usuário 6.");
            for(int x = 1; x <= 5; x++){
                System.out.println("Arquivo " + x +" Imprimindo");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        try {
            t6.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t5.start();
        y = 1;
        while(t5.isAlive()){
            System.out.println("Usuário 5.");
            for(int x = 1; x <= 5; x++){
                System.out.println("Arquivo " + x +" Imprimindo");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        try {
            t5.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t4.start();
        
        y = 1;
        while(t4.isAlive()){
            System.out.println("Usuário 4.");
            for(int x = 1; x <= 5; x++){
                System.out.println("Arquivo " + x +" Imprimindo");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        try {
            t4.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t3.start();
        y = 1;
        while(t3.isAlive()){
            System.out.println("Usuário 3.");
            for(int x = 1; x <= 5; x++){
                System.out.println("Arquivo " + x +" Imprimindo");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        try {
            t3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t2.start();
        y = 1;
        while(t2.isAlive()){
            System.out.println("Usuário 2.");
            for(int x = 1; x <= 5; x++){
                System.out.println("Arquivo " + x +" Imprimindo");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        try {
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t1.start();
        y = 1;
        while(t1.isAlive()){
            System.out.println("Usuário 1.");
            for(int x = 1; x <= 5; x++){
                System.out.println("Arquivo " + x +" Imprimindo");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        try {
            t1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
