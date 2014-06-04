/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.senac.beans;

/**
 *
 * @author Cleber
 */
public class Mensagem {
    private String texto;
    private Usuario destinatario;

    public Usuario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Usuario destinatario) {
        this.destinatario = destinatario;
    }

    public Usuario getRementente() {
        return rementente;
    }

    public void setRementente(Usuario rementente) {
        this.rementente = rementente;
    }
    private Usuario rementente;
   
    Mensagem(String texto, Usuario remetente, Usuario destinatario){
       this.destinatario = destinatario;
       this.destinatario = remetente;
       this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
}
