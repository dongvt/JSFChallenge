/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import model.TableData;

/**
 *
 * @author user
 */
public class FillTable {

    public FillTable() {
    }
    
    public ArrayList<TableData> fillVariables(){
        ArrayList<TableData> data = new ArrayList<>();
        
        for(int i = 0;i< 20;i++) {
            TableData datos = new TableData();
            datos.setColumn1("VACIO");
            datos.setColumn2("VACIO");
            datos.setColumn3("VACIO");
            datos.setColumn4("VACIO");
            datos.setColumn5("VACIO");
            datos.setColumn6("VACIO");
            datos.setColumn7("VACIO");
            datos.setColumn8("VACIO");
            datos.setColumn9("VACIO");
            datos.setColumn10("VACIO");
            
//            datos.setUserNumberForC1(data.size() + 1);
//            datos.setUserNumberForC2(data.size() + 1);
//            datos.setUserNumberForC3(data.size() + 1);
//            datos.setUserNumberForC4(data.size() + 1);
//            datos.setUserNumberForC5(data.size() + 1);
//            datos.setUserNumberForC6(data.size() + 1);
//            datos.setUserNumberForC7(data.size() + 1);
//            datos.setUserNumberForC8(data.size() + 1);
//            datos.setUserNumberForC9(data.size() + 1);
//            datos.setUserNumberForC10(data.size() + 1);
            
            data.add(datos);
        }
        
        return data;
    }
}
