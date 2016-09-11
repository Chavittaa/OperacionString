/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionstring;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author chava
 */
public class OperacionString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(new operacionstring.OperacionString().operacionesString("(8*5)/2"));
    }

    public String operacionesString(String operacion) {
        Object result;
        try {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("js");
            result = engine.eval(operacion);
        } catch (ScriptException ex) {
            Logger.getLogger(OperacionString.class.getName()).log(Level.SEVERE, null, ex);
            return "-0";
        }
        return result.toString();
    }

}
