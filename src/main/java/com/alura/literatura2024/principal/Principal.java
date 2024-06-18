package com.alura.literatura2024.principal;

import java.util.Scanner;

public class Principal {
    private final Scanner leitura = new Scanner(System.in);

    public void exibeMenu() {
        var opcao = -1;

        while (opcao!= 6) {
            var menu = """
                    *** Literatura ***                    
                                        
                    1- Buscar libro pelo título
                    2- Listar de livros registrados
                    3- Listar de autores registrados
                    4- listar de autores vivos em um determinado ano
                    5- Listar de livros em um determinado idioma
                                    
                    6 - Sair
                    """;

            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    buscarLivroPeloTitulo();
                    break;
                case 2:
                    listarLivrosRegistros();
                    break;
                case 3:
                    listarAutoresRegistrados();
                    break;
                case 4:
                    listarAutoresVivosEmUmDeterminadoAno();
                    break;
                case 5:
                    listarLivrosEmUmDeterminadoIdioma();
                    break;
                case 6:
                    System.out.println("Encerrando a aplicação!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void listarLivrosEmUmDeterminadoIdioma() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarLivrosEmUmDeterminadoIdioma'");
    }

    private void listarAutoresVivosEmUmDeterminadoAno() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarAutoresVivosEmUmDeterminadoAno'");
    }

    private void listarAutoresRegistrados() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarAutoresRegistrados'");
    }

    private void listarLivrosRegistros() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarLivrosRegistros'");
    }

    private void buscarLivroPeloTitulo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarLivroPeloTitulo'");
    }
}
