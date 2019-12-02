/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto24relacionamentopoo;

/**
 *
 * @author jonat
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Autor objAutor1 = new Autor("Jonathan","jonathan@gmail.com",'M');
        Autor objAutor2 = new Autor("Marcos","Marcos@gmail.com",'M');
        Autor objAutor3 = new Autor("Amanda","Amanda@gmail.com",'F');
        Autor objAutor4 = new Autor("Fernanda","Fernanda@gmail.com",'F');
        
        
        Livro objLivro1 = new Livro("Menti milionaria", 5.00, 10);
        Livro objLivro2 = new Livro("Força", 20.00, 5);
        Livro objLivro3 = new Livro("Pai rico Pai pobre", 35.00, 15);
        Livro objLivro4 = new Livro("A grande floresta", 10.00, 20);
        
        objLivro1.setAutores(objAutor1);
        objLivro1.setAutores(objAutor3);
        
        objLivro2.setAutores(objAutor2);
        objLivro2.setAutores(objAutor1);
        
        objLivro3.setAutores(objAutor3);
        objLivro3.setAutores(objAutor1);
        
        objLivro4.setAutores(objAutor4);
        objLivro4.setAutores(objAutor3);
        
        objLivro1.printAutores();
        objLivro2.printAutores();
        objLivro3.printAutores();
        objLivro4.printAutores();
        
    }
    
}
