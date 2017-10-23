/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengecekankesehatann;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author WINDOWS 8.1
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button proses;
    @FXML
    private Button reset;
    @FXML
    private TextField ideal;
    @FXML
    private TextArea hasil;
    @FXML
    private TextArea saran;
    @FXML
    private TextField nama;
    @FXML
    private TextField tinggi;
    @FXML
    private TextField bb;
    @FXML
    private RadioButton laki;
    @FXML
    private RadioButton prem;
    @FXML
    private ToggleGroup jenis;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
        int beratideal = 0;
        String analisa = null;
        String analisasaran = null;
        int Tinggi = Integer.parseInt(tinggi.getText());
        int Berat = Integer.parseInt(bb.getText());
        
        if(laki.isSelected()){
           beratideal = Tinggi - 105;
        }
        else if(prem.isSelected()){
           beratideal = Tinggi - 110;
        }
        ideal.setText(""+beratideal);
        
        if(beratideal == Berat){
            analisa = "Ideal";
            analisasaran ="Pertahankan postur tubuh ideal anda.\nJaga Pola makan anda, istirahat anda, dan kesehatan anda.";
        }
        else if(beratideal < Berat){
            analisa = "Overweight";
            analisasaran = "Anda kelebihan berat badan.\nKurangi porsi makan anda dan perbanyak Olahraga.";
        }
        else{
            analisa = "Underweight";
            analisasaran = "Anda kekurangan berat badan.\nTambah porsi makan anda dan perbanyak istirahat.";
        }
        
        hasil.setText("Nama "+nama.getText()+", Anda "+analisa);
        saran.setText(analisasaran);
        
    }

    @FXML
    private void reset(ActionEvent event) {
        nama.setText("");
        tinggi.setText("");
        bb.setText("");
        ideal.setText("");
        saran.setText("");
        hasil.setText("");
        laki.setSelected(false);
        prem.setSelected(false);
    }

 

    private int parseInt(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
