package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// Aula de manipulação de Files do tipo TXT
/* Procedimentos:
    1- criar uma string com o caminho e nome de um ficheiro a criar no disco
    2- Usar um método nativo para criar o ficheiro
    3- Usar um método nativo para ler o ficheiro
* */
public class Main {

    public static void main(String[] args) {

        String fileLocation = "C:\\Users\\f897\\Desktop\\teste.txt";

        //CreateFile(fileLocation); // Criar file
        WriteToFile(fileLocation); // Escrever dentro do ficheiro
    }

    /**
     * Criar Ficheiro TXT
     * @param file localização do ficheiro
     */
    public static void CreateFile(String file){

        // Bloco try-catch para apanhar eventual exceção do tipo IOException
        try{
            // Tentativa de criação do ficheiro
            FileWriter fileWriter = new FileWriter(file);
        }
        catch (IOException e){

            // Se for gerada a exceção, esta é resposta
            System.out.println(e.getMessage());
            System.out.println("O fichero não pode ser criado.");
        }
    }

    /**
     * Escrita no Ficheiro
     * @param file localização do ficheiro
     */
    public static void WriteToFile(String file){
        // Bloco try-catch para apanhar eventual exceção do tipo IOException
        try{
            // Tentativa de criação do ficheiro
            FileWriter fw = new FileWriter(file);   // Cria o ponteiro fw que aponta para "teste.txt"
            PrintWriter pw = new PrintWriter(fw);   // Cria o ponteiro para escrever no ficheiro fw

            pw.println("Olá mundo, eu sou o....");  // Escreve na file
            pw.close(); // Necesário fechar a file para poder ser aberta pelo S.O.
        }
        catch (IOException e){
            // Se for gerada a exceção, esta é resposta
            System.out.println("O fichero não pode ser criado.");
        }
    }
}
