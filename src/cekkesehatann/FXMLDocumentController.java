/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekkesehatann;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Amira Hanifa
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private RadioButton rd_laki;
    @FXML
    private ToggleGroup pilihanjk;
    @FXML
    private RadioButton rd_perempuan;
    @FXML
    private JFXTextField editnama;
    @FXML
    private JFXTextField edittinggi;
    @FXML
    private JFXTextField editberat;
    @FXML
    private JFXTextField ideal;
    @FXML
    private JFXTextArea hasil;
    @FXML
    private JFXTextArea saran;
    @FXML
    private JFXButton buttonprosess;
    @FXML
    private JFXButton buttonreset;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
        String nama=editnama.getText();
        String Hasil = hasil.getText();
        String Saran = saran.getText();
        int tinggi=Integer.parseInt(edittinggi.getText());
        int berat=Integer.parseInt(editberat.getText());
        int Ideal = 0;
        
        if(rd_laki.isSelected()){
            Ideal = parseInt(edittinggi.getText()) - 105;
            ideal.setText(""+Ideal);
            if (Ideal == berat){
            Hasil = "ANALISA : "+"\n"+"Nama : "+nama+"\n" +"Tinggi Badan : "+tinggi+"\n"+"Berat Badan : "+berat+"\n"+" Postur Tubuhmu Ideal";
            Saran = "SARAN : "+"\n"+"pertahankan";
            }else if (Ideal > berat){
             Hasil = "ANALISA : "+"\n"+"Nama : "+nama+"\n" +"Tinggi Badan : "+tinggi+"\n"+"Berat Badan : "+berat+"\n"+" Postur Tubuhmu UnderWeight";
             Saran = "SARAN : "+"\n"+"Tingkatkan pola makan serta hidup sehat";
            }else if (Ideal < berat){
            Hasil = "ANALISA : "+"\n"+"Nama : "+nama+"\n" +"Tinggi Badan : "+tinggi+"\n"+"Berat Badan : "+berat+"\n"+" Postur Tubuhmu OverWeight";
            Saran = "SARAN : "+"\n"+" Kurangi pola makan serta hidup sehat";
            }
                  }
  
        if(rd_perempuan.isSelected()){
            Ideal = parseInt(edittinggi.getText()) - 110;
            ideal.setText(""+Ideal);
            if (Ideal == berat){
            Hasil = "ANALISA : "+"\n"+"Nama : "+nama+"\n" +"Tinggi Badan : "+tinggi+"\n"+"Berat Badan : "+berat+"\n"+" Postur Tubuhmu Ideal";
            Saran = "SARAN : "+"\n"+"Pertahankan";
            }else if (Ideal > berat){
            Hasil = "ANALISA : "+"\n"+"Nama : "+nama+"\n" +"Tinggi Badan : "+tinggi+"\n"+"Berat Badan : "+berat+"\n"+" Postur Tubuhmu UnderWeight";
            Saran = "SARAN : "+"\n"+"Tingkatkan pola makan serta hidup sehat";
            }else if (Ideal < berat){
            Hasil = "ANALISA : "+"\n"+"Nama : "+nama+"\n" +"Tinggi Badan : "+tinggi+"\n"+"Berat Badan : "+berat+"\n"+" Postur Tubuhmu OverWeight";
            Saran = "SARAN : "+"\n"+"Kurangi pola makan serta hidup sehat";
            }}
     hasil.setText(Hasil);   
     saran.setText(Saran);   
    }
    @FXML
    private void reset(ActionEvent event) {
        hasil.setText("");
        editnama.setText("");
        edittinggi.setText("");
        editberat.setText("");
        ideal.setText("");
        saran.setText("");
        rd_laki.setSelected(false);
        rd_perempuan.setSelected(false);
    }}