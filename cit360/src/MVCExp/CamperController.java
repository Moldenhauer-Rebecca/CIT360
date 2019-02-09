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
public class CamperController {

    private CamperModel model;
    private CamperView view;

    public CamperController(CamperModel model, CamperView view) {
        this.model = model;
        this.view = view;
    }
    
    public void setCamperFirstName(String firstName) {
        model.setFirstName(firstName);
    }
    
    public String getCamperFirstName(){
        return model.getFirstName();
    }
    
    public void setCamperLastName(String lastName) {
        model.setLastName(lastName);
    }
    
    public String getCamperLastName() {
        return model.getLastName();
    }
    
    public void setCamperPhoneNum(String phoneNum) {
        model.setPhoneNum(phoneNum);
    }
    
    public String getCamperPhoneNum() {
        return model.getPhoneNum();
    }
    
    public void updateView() {
        view.printCamperInfo(model.getFirstName(), model.getLastName(), model.getPhoneNum());
    }

}
