/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttt.codicefiscale;

import ttt.utils.xml.engine.interfaces.IXMLElement;

import java.io.IOException;
import java.util.List;
import ttt.codicefiscale.graphics.CodiciGUI;

/**
 *
 * @author TTT
 */
public class CodiceFiscaleMain {

    public static void main(String[] args) throws IOException {
//        //GestioneMenu gm = new GestioneMenu();
//        System.out.println(ControlloCodiceFiscale.ControllaLettere("AXV"));
        CodiciGUI.main(args);
    }

    public static void stampa(List<IXMLElement> s) {
        s.forEach(elemento -> {
            System.out.println(elemento.getValue());
            if (elemento.hasSubElements()) {
                stampa(elemento.getElements());
            }
        });
    }

    public static void prova() {

//        CodiceFiscaleMain.class.getResourceAsStream("ttt/codicefiscale/resources/comuni.xml");
//
//        File f = new File("ttt/codicefiscale/resources/comuni.xmlsrc/");
//        XMLDocument lista_comuni = XMLLoader.loadDocument(XMLLoader.TipoXML.COMUNI, f, new File("non_usable.xml"));
//        //stampa(lista_comuni.getElements());
//        //System.out.println(lista_comuni.getElements().get(0).getElements().get(0).getElements().get(0).getValue());
//        for(int i = 0; i < lista_comuni.getElements().get(0).getElements().size(); i++){
//            System.out.println(lista_comuni.getElements().get(0).getElements().get(i).getElements().get(0).getValue());
//            System.out.println(lista_comuni.getElements().get(0).getElements().get(i).getElements().get(1).getValue());
//        }
    }
}
