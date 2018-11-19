/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Random;
import java.util.concurrent.TimeUnit;
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
int y = 0;
int qtdArquivos = 5;
int tempo = 5000;
int delay = 3000;
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
MinhaClasseRunnable thread2 = new MinhaClasseRunnable(nome,qtdArquivos,tempo,prioridade);
nome = "Usuário 3";
MinhaClasseRunnable thread3 = new MinhaClasseRunnable(nome,qtdArquivos,tempo,prioridade);

MinhaClasseRunnable c = new MinhaClasseRunnable();
boolean trava = true;
boolean trava1 = true;
boolean trava2 = true;
boolean trava3 = true;
boolean trava4 = true;
boolean trava5 = true;
boolean trava6 = true;
Random valor = new Random();
int totalUsuarios = 0;
int totalPrioritarios = 0;
while(trava){
    if(totalUsuarios < 7 ){
        //System.out.println(valor.nextInt(7));
        int numero = valor.nextInt(7)+1;
        if(numero > 0 && numero < 7){
            
                switch(numero){
                    case 1:
                        if(totalPrioritarios >=3){
                            if(trava1){
                            totalUsuarios++;
                            trava1 = false;
                            thread1.start();
                            
                            try {
                                thread1.join();
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                            }else{
                                break;
                            }
                        }                        
                        break;
                    case 2:
                        if(totalPrioritarios >=3){
                        if(trava2){
                            totalUsuarios++;
                            trava2 = false;
                            //System.out.println(numero);
                             thread2.start();
                           
                            try {
                                thread2.join();
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                            }else{
                                break;
                            }
                        }
                        break;
                    case 3:
                        if(totalPrioritarios >=3){
                        if(trava3){
                            //System.out.println(numero);
                            totalUsuarios++;
                            trava3 = false;
                            thread3.start();
                            
                            try {
                                thread3.join();
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                        }else{
                            break;
                        }
                        }
                        break;
                    case 4:
                        if(trava4){
                            //System.out.println(numero);
                            totalUsuarios++;
                            totalPrioritarios++;
                            trava4 = false;
                            thread4.start();

                            
                            try {
                                thread4.join();
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            totalUsuarios++;
                            trava4 = false;
                        }else{
                            break;
                        }
                        break;
                    case 5:
                        if(trava5){
                            totalUsuarios++;
                            totalPrioritarios++;
                            trava5 = false;
                            //System.out.println(numero);
                            thread5.start();
                            
                            try {
                                thread5.join();
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                        }else{
                            break;
                        }
                        break;
                    case 6:
                        if(trava6){
                            totalUsuarios++;
                            totalPrioritarios++;
                            trava6 = false;
                            //System.out.println(numero);
                            thread6.start();
                            
                            try {
                                thread6.join();
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }                                                     
                        }else{
                            break;
                        }
                        break;
                }                      
        }  
      }else if(totalUsuarios > 6){        
            trava = false;
      }else{
          trava = false;
      }
    
        try {
            MinhaClasseRunnable.sleep(delay);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }     
  }    
}
