/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noval.mobile;
class mesin{
    
    double kecepatan;
    
    void setKecepatan(double kecepatan){
        this.kecepatan = kecepatan;
    }
    
    double getKecepatan(){
        return kecepatan;
    }
}
public class NovalMobile {
public static void main(String[] args){
        //Membuat Objek dari Class Mesin
        mesin data = new mesin();
        data.setKecepatan(360.0);
        System.out.println("Kecepatan Mobil: "+data.getKecepatan()+" Km/Jam");
    }
}
