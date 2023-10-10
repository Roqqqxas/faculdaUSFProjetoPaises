/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetopaises;


/**
 *
 * @author sp303lab
 */
public class PerguntasPaises {

    private final String pergunta;
    private String opcaoA;
    private String opcaoB;
    private String opcaoC;
    private char respostaCerta;

    public PerguntasPaises(String pergunta, String opcaoA, String opcaoB, String opcaoC, char respostaCerta) {

        this.pergunta = pergunta;
        this.opcaoA = opcaoA;
        this.opcaoB = opcaoB;
        this.opcaoC = opcaoC;
        this.respostaCerta = respostaCerta;

    }

    public String Pergunta() {
        return pergunta;

    }

    public void exibirPergunta() {
        System.out.println(pergunta);
        System.out.println("a) " + opcaoA);
        System.out.println("b) " + opcaoB);
        System.out.println("c) " + opcaoC);
    }

    public char getRepostaCerta() {
        return respostaCerta;
    }

    public boolean verificarespostaCerta(char resposta) {
        return resposta == respostaCerta;
    }
}
