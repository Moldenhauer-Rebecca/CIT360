/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCExp;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author crmol
 */
public class CamperController {
    
    public ArrayList<CamperModel> model;
    
    public CamperController(ArrayList<CamperModel> model) {
        this.model = model;
    }
    
    public void startApplication() {
        //set table column names
        String col[] = {"First Name", "Last Name", "Phone Number", "City", "State"};
        
        //Initialize table Model to populate
        DefaultTableModel Tablemodel = new DefaultTableModel(col,0);
        
        //populate model (array of campers) to table model
        Object rowData[] = (Object[]) new Object();
        model.stream().map((model1) -> {
            rowData[0] = model1.getFirstName();
            return model1;
        }).map((model1) -> {
            rowData[1] = model1.getLastName();
            return model1;
        }).map((model1) -> {
            rowData[2] = model1.getPhoneNumber();
            return model1;
        }).map((model1) -> {
            rowData[3] = model1.getCity();
            return model1;
        }).map((model1) -> {
            rowData[4] = model1.getState();
            return model1;
        }).forEach((_item) -> {
            Tablemodel.addRow(rowData);
        });
        
       //View application GUI
        CamperView view = new CamperView();
        view.jTableCamper.setModel(Tablemodel);
        view.setVisible(true);
    }
    
}
