/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCExp;

/**
 *
 * @author crmol
 */
public class Main {
    
    public static void main(String[] args) {
        
        //get camper record from DB
        CamperModel model = retrieveCamperFromDB();
        
        //Create a view to write details to console
        CamperView view = new CamperView();
        
        CamperController controller = new CamperController(model, view);
        
        controller.updateView();
        
        //update data in meodel
        controller.setCamperFirstName("Brandon");
        
        controller.updateView();
    }
    
    private static CamperModel retrieveCamperFromDB() {
        CamperModel camper = new CamperModel();
        camper.setFirstName("Curtis");
        camper.setLastName("Howard");
        camper.setPhoneNum("435-555-5555");
        
        return camper;
    }

   }
