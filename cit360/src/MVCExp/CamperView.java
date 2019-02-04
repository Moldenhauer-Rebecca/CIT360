/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCExp;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author crmol
 */
public class CamperView extends JFrame {

    public void CamperView() {

    }

    private JPanel contentPane;
    public JTable jTableCamper;

    //Launch Application
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                CamperView frame = new CamperView();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    //Create frame
    public CamperView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        jTableCamper = new JTable();
        jTableCamper.setModel(new DefaultTableModel(
                new Object[][]{
                    {null, null, null, null},
    },
    new String[]{
        "First Name", "Last Name", "Phone Number", "City", "State"}
));
    
    contentPane.add (jTableCamper, BorderLayout.CENTER);
}

}
