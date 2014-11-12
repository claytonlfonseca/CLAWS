/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dicionario;

import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson; // converts POJO to JSON and back again
import java.util.Random;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path( "equation" )
public class ConvertJson
{
   static Random randomObject = new Random(); 

   @GET
   @Path( "{operation}/{level}" )
   @Produces( "application/json" )

/**
 *
 * @author clayton.fonseca
 */
public class ConsultaURL {
    public static String leTexto() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        return s;
    }
      public static List<String> leTexto2(String url) throws IOException {
        URL oracle = new URL(url);
         String inputLine;
         List<String> lista;
          lista = new ArrayList();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()))) {
           
            while ((inputLine = in.readLine()) != null) {
                lista.add(inputLine);
                 //System.out.println(inputLine);
            }
            
            
        }
        return lista;
      }

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
          String endereço = "http://www.priberam.pt/DLPO/";
        String texto;
        int tamanho = 0;
        List<String> linhas;
        System.out.println("Digite a palavra a ser consultada no dicionário:");
        texto = leTexto();
        linhas = leTexto2(endereço + texto);
        for(int i = 837; i < 974; i++)
        System.out.println(linhas.get(i));

    }
        // TODO code application logic here
    
    
}
