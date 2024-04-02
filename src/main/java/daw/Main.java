/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomas
 */
public class Main {

    public static void main(String[] args) {
        List<App> listaApps = new ArrayList<>();
        listaApps = listaAplicaciones();
        listaApps.forEach(System.out::println);
        
        // B
        System.out.println("\n\n");
        List<String> listaString = new ArrayList<>();
        listaString = listaString(listaApps);
        
        

    }

    // Método que crea 50 aplicaciones usando el constructor por defecto
    public static List<App> listaAplicaciones() {
        List<App> lista = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            App appAux = new App();
            lista.add(appAux);
        }
        return lista;
    }

    // Método que pasa de una lista de APPS a una lista de String
    public static List<String> listaString(List<App> listaAux) {
        List<String> listaString = new ArrayList<>();
        for (App app : listaAux) {
            listaString.add(app.toString());
        }
        return listaString;
    }
}
