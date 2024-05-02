package com.iphone.Model;

import com.iphone.Interfaces.AparelhoTelefonico;
import com.iphone.Interfaces.NavegadorInternet;
import com.iphone.Interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
    @Override
    public void ligar() {
        System.out.println("Iphone está sendo iniciado...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando novo aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica...");
    }
}
