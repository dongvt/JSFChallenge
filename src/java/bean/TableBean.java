package bean;

import data.FillTable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import model.TableData;
import org.primefaces.context.RequestContext;


/**
 *
 * @author Govert Carreño
 */

@ManagedBean
@ViewScoped
public class TableBean {
    private final FillTable tableFunction = new FillTable();
    private ArrayList<TableData> data  = tableFunction.fillVariables();

    public void updateOnChanged(int numUsu){
        for(TableData datas : data) {
            if(datas.getColumn1().equals("EN USO") && datas.getUserNumberForC1() != numUsu) 
                datas.setColumn1("OCUPADO");
            else if(datas.getColumn1().equals("OCUPADO") && datas.getUserNumberForC1() == numUsu)
                datas.setColumn1("EN USO");
            
            if(datas.getColumn2().equals("EN USO") && datas.getUserNumberForC2() != numUsu) 
                datas.setColumn2("OCUPADO");
            else if(datas.getColumn2().equals("OCUPADO") && datas.getUserNumberForC2() == numUsu)
                datas.setColumn2("EN USO");
            
            if(datas.getColumn3().equals("EN USO") && datas.getUserNumberForC3() != numUsu) 
                datas.setColumn3("OCUPADO");
            else if(datas.getColumn3().equals("OCUPADO") && datas.getUserNumberForC3() == numUsu)
                datas.setColumn3("EN USO");
            
            if(datas.getColumn4().equals("EN USO") && datas.getUserNumberForC4() != numUsu) 
                datas.setColumn4("OCUPADO");
            else if(datas.getColumn4().equals("OCUPADO") && datas.getUserNumberForC4() == numUsu)
                datas.setColumn4("EN USO");
            
            if(datas.getColumn5().equals("EN USO") && datas.getUserNumberForC5() != numUsu) 
                datas.setColumn5("OCUPADO");
            else if(datas.getColumn5().equals("OCUPADO") && datas.getUserNumberForC5() == numUsu)
                datas.setColumn5("EN USO");
            
            if(datas.getColumn6().equals("EN USO") && datas.getUserNumberForC6() != numUsu) 
                datas.setColumn6("OCUPADO");
            else if(datas.getColumn6().equals("OCUPADO") && datas.getUserNumberForC6() == numUsu)
                datas.setColumn6("EN USO");
            
            if(datas.getColumn7().equals("EN USO") && datas.getUserNumberForC7() != numUsu) 
                datas.setColumn7("OCUPADO");
            else if(datas.getColumn7().equals("OCUPADO") && datas.getUserNumberForC7() == numUsu)
                datas.setColumn7("EN USO");
            
            if(datas.getColumn8().equals("EN USO") && datas.getUserNumberForC8() != numUsu) 
                datas.setColumn8("OCUPADO");
            else if(datas.getColumn8().equals("OCUPADO") && datas.getUserNumberForC8() == numUsu)
                datas.setColumn8("EN USO");
            
            if(datas.getColumn9().equals("EN USO") && datas.getUserNumberForC9() != numUsu) 
                datas.setColumn9("OCUPADO");
            else if(datas.getColumn9().equals("OCUPADO") && datas.getUserNumberForC9() == numUsu)
                datas.setColumn9("EN USO");
            
            if(datas.getColumn10().equals("EN USO") && datas.getUserNumberForC10() != numUsu) 
                datas.setColumn10("OCUPADO");
            else if(datas.getColumn10().equals("OCUPADO") && datas.getUserNumberForC10() == numUsu)
                datas.setColumn10("EN USO");
        }
    }
    
    
    public ArrayList<TableData> getData() {
        return data;
    }

    public void setData(ArrayList<TableData> data) {
        this.data = data;
    }
    
    public void show(){
        this.data = tableFunction.fillVariables();
    }
    
    public String label(String wha){
        switch (wha){
            case "VACIO":
                return "V";
            case "EN USO":
                return "EU";
            case "OCUPADO":
                return "O";
            default: 
                return "DEFAULT";   
        }
    }
    public void changeChairState(int row, int column, int userNum){
        
        switch(column){
            case 1:
                if(data.get(row).getColumn1().equals("VACIO")){
                    data.get(row).setColumn1("EN USO");
                    data.get(row).setUserNumberForC1(userNum);
                }
                else if (data.get(row).getColumn1().equals("EN USO")) {
                    data.get(row).setColumn1("VACIO");
                    data.get(row).setUserNumberForC1(-1);
                } else if(data.get(row).getUserNumberForC1() != -1 && data.get(row).getUserNumberForC1() != userNum) {
                    data.get(row).setColumn1("OCUPADO");
                }
                break;
            case 2:
                if(data.get(row).getColumn2().equals("VACIO")){
                    data.get(row).setColumn2("EN USO");
                    data.get(row).setUserNumberForC2(userNum);
                }
                else if (data.get(row).getColumn2().equals("EN USO")) {
                    data.get(row).setColumn2("VACIO");
                    data.get(row).setUserNumberForC2(-1);
                } else if(data.get(row).getUserNumberForC2() != -1 && data.get(row).getUserNumberForC2() != userNum) {
                    data.get(row).setColumn2("OCUPADO");
                }
                break;
            case 3:
                if(data.get(row).getColumn3().equals("VACIO")){
                    data.get(row).setColumn3("EN USO");
                    data.get(row).setUserNumberForC3(userNum);
                }
                else if (data.get(row).getColumn3().equals("EN USO")) {
                    data.get(row).setColumn3("VACIO");
                    data.get(row).setUserNumberForC3(-1);
                } else if(data.get(row).getUserNumberForC3() != -1 && data.get(row).getUserNumberForC3() != userNum) {
                    data.get(row).setColumn3("OCUPADO");
                }
                break;
            case 4:
                if(data.get(row).getColumn4().equals("VACIO")){
                    data.get(row).setColumn4("EN USO");
                    data.get(row).setUserNumberForC4(userNum);
                }
                else if (data.get(row).getColumn4().equals("EN USO")) {
                    data.get(row).setColumn4("VACIO");
                    data.get(row).setUserNumberForC4(-1);
                } else if(data.get(row).getUserNumberForC4() != -1 && data.get(row).getUserNumberForC4() != userNum) {
                    data.get(row).setColumn4("OCUPADO");
                }
                break;
            case 5:
                if(data.get(row).getColumn5().equals("VACIO")){
                    data.get(row).setColumn5("EN USO");
                    data.get(row).setUserNumberForC5(userNum);
                }
                else if (data.get(row).getColumn5().equals("EN USO")) {
                    data.get(row).setColumn5("VACIO");
                    data.get(row).setUserNumberForC5(-1);
                } else if(data.get(row).getUserNumberForC5() != -1 && data.get(row).getUserNumberForC5() != userNum) {
                    data.get(row).setColumn5("OCUPADO");
                }
                break;
            case 6:
                if(data.get(row).getColumn6().equals("VACIO")){
                    data.get(row).setColumn6("EN USO");
                    data.get(row).setUserNumberForC6(userNum);
                }
                else if (data.get(row).getColumn6().equals("EN USO")) {
                    data.get(row).setColumn6("VACIO");
                    data.get(row).setUserNumberForC6(-1);
                } else if(data.get(row).getUserNumberForC6() != -1 && data.get(row).getUserNumberForC6() != userNum) {
                    data.get(row).setColumn6("OCUPADO");
                }
                break;
            case 7:
                if(data.get(row).getColumn7().equals("VACIO")){
                    data.get(row).setColumn7("EN USO");
                    data.get(row).setUserNumberForC7(userNum);
                }
                else if (data.get(row).getColumn7().equals("EN USO")) {
                    data.get(row).setColumn7("VACIO");
                    data.get(row).setUserNumberForC7(-1);
                } else if(data.get(row).getUserNumberForC7() != -1 && data.get(row).getUserNumberForC7() != userNum) {
                    data.get(row).setColumn7("OCUPADO");
                }
                break;
            case 8:
                if(data.get(row).getColumn8().equals("VACIO")){
                    data.get(row).setColumn8("EN USO");
                    data.get(row).setUserNumberForC8(userNum);
                }
                else if (data.get(row).getColumn8().equals("EN USO")) {
                    data.get(row).setColumn8("VACIO");
                    data.get(row).setUserNumberForC8(-1);
                } else if(data.get(row).getUserNumberForC8() != -1 && data.get(row).getUserNumberForC8() != userNum) {
                    data.get(row).setColumn8("OCUPADO");
                }
                break;
            case 9:
                if(data.get(row).getColumn9().equals("VACIO")){
                    data.get(row).setColumn9("EN USO");
                    data.get(row).setUserNumberForC9(userNum);
                }
                else if (data.get(row).getColumn9().equals("EN USO")) {
                    data.get(row).setColumn9("VACIO");
                    data.get(row).setUserNumberForC9(-1);
                } else if(data.get(row).getUserNumberForC9() != -1 && data.get(row).getUserNumberForC9() != userNum) {
                    data.get(row).setColumn9("OCUPADO");
                }
                break;
            case 10:
                if(data.get(row).getColumn10().equals("VACIO")){
                    data.get(row).setColumn10("EN USO");
                    data.get(row).setUserNumberForC10(userNum);
                }
                else if (data.get(row).getColumn10().equals("EN USO")) {
                    data.get(row).setColumn10("VACIO");
                    data.get(row).setUserNumberForC10(-1);
                } else if(data.get(row).getUserNumberForC10() != -1 && data.get(row).getUserNumberForC10() != userNum) {
                    data.get(row).setColumn10("OCUPADO");
                }
                break;
            default:
                break;
        }
        this.data = this.getData();
    }
}
