/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto24relacionamentopoo;

import java.util.ArrayList;
/**
 *
 * @author jonat
 */
public class Livro {
    private String nome;
    private double preco;
    private int qtdEstoque;

    ArrayList<Autor>autor = new ArrayList<>();
    
    public Livro() {
    }

    public Livro(String nome, double preco, int qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    @Override
    public String toString() {
        return "Livro{" + "nome=" + nome + ", preco=" + preco + ", qtdEstoque=" + qtdEstoque + '}';
    }

   
   public void setAutores(Autor aut){
       autor.add(aut);
   }
   
   public void printAutores(){
       System.out.println(this.toString());
       System.out.println("Autores");
       
       for(int i=0;i <autor.size(); i++){
        System.out.println(this.autor.get(i).getNome());
   }
   }
}
