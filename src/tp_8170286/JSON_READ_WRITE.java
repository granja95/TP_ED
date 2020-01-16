/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_8170286;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
 
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author tiago
 */
public class JSON_READ_WRITE {

    public JSON_READ_WRITE() {
    }
    

    public void read(String fileName) throws ParseException, FileNotFoundException {
        JSONParser parser = new JSONParser();
 
        try {
 
            Object obj = parser.parse(new FileReader(fileName));
 
            JSONObject jsonObject = (JSONObject) obj;
 
            String name = (String) jsonObject.get("nome");
            long pontos = (long) jsonObject.get("pontos") ;
            
 
            System.out.println("Name: " + name);
            System.out.println("Pontos: " + pontos);


        } catch (Exception e) {
            e.printStackTrace();
        }
        

    }
}
