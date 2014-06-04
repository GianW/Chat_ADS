/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.senac.beans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cleber
 */
public class Chat {
   public static List<Usuario> usuarios;
   public static List<Mensagem> mensagens;
   
   public void Start(){
    usuarios = new ArrayList<Usuario>();
    mensagens = new ArrayList<Mensagem>();
   }
   
   public static void Login(String ID){
    Usuario usuario = getUsuarioOn(ID);
        if(usuario != null){
            usuario.setOnline(true);
        }
   }
   
   public static void LoginOut(String ID){
    Usuario usuario = getUsuarioOn(ID);
        if(usuario != null){
            usuario.setOnline(false);
        }
   }
   
   public static Usuario getUsuarioOn(String ID){
       Usuario usuario = new Usuario();
       String IDUsr;
       for(Usuario u : usuarios){
           IDUsr = u.getID();
           if( IDUsr.contains(ID)){
               usuario = u;
           };
       }
       return usuario;
   }
      
   public static void enviaMensagem(String texto, String IDRemetente, String IDDestinatario){
       Usuario remetente = getUsuarioOn(IDRemetente);
       Usuario destinatario = getUsuarioOn(IDDestinatario);     
       if(remetente != null && destinatario != null && !texto.isEmpty()){
            mensagens.add(new Mensagem(texto, remetente, destinatario));
       }
   }
   
   public static List<Mensagem> GetMensagems(String ID){
       return mensagens;
   }
}
