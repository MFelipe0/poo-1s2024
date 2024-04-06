package Atividade1.livraria;

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        Livraria livraria = new Livraria();

        while (opcao !=4) {
            System.out.println("1 - Adicionar livro");
            System.out.println("1 - Listar livro");
            System.out.println("1 - Detalhar livro");
            System.out.println("1 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: 
                    System.out.println("1 - Adicionar livro");
                    int id;
                    String titulo;
                    String nomeAutor;
                    String anoPublicacao;

                    String editora;

                    System.out.println("Id: ");
                    id = sc.nextInt();

                    System.out.println("Titulo: ");
                    titulo = sc.nextLine();

                    System.out.println("Autor: ");
                    nomeAutor = sc.nextLine();

                    System.out.println("Ano: ");
                    anoPublicacao = sc.nextLine();

                    System.out.println("Editora: ");
                    editora = sc.nextLine();

                    Livro l = new Livro(id, titulo, nomeAutor, anoPublicacao, editora);
                    livraria.cadastrarLivro(l);
                    break;


                case 2:
                    System.out.println("1 - Listar livro");
                    System.out.println(livraria.listarLivros()); 
                    break;
                case 3:
                    System.out.println("1 - Detalhar livro");
                    break;
                case 4: 
                    System.out.println("1 - Sair");
                    break;
                default:
                System.out.println("1 - Opcao inválida");
            
            }
    }
    sc.close();

    }
    

}
