/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Menu {
    String jml;
    int jmlh=0;
    
     public void setJumlah(String val){
        jml=val;
    }
    public int getJumlah(){
        jmlh=Integer.parseInt(jml);
        return jmlh;
    }
}
