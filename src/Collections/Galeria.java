/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.ArrayList;
/**
 *
 * @author T107
 */
public class Galeria {
    ArrayList <Imagencita> imagenes;

    public Galeria() {
        imagenes= new ArrayList<Imagencita>();
        Imagencita i1=new Imagencita();
        i1.setUrl("/Collections/Nissan-GT-R[1].png");
        i1.setTitulo(" NISSAN GT-R");
        i1.setDescripcion("Este auto tambien a sido utilizado en ralling"
                    +"un motor gemelo biturbo");
        
        Imagencita i2=new Imagencita();
        i2.setUrl("/Collections/dodge_challenger_back-wide[1].png");
        i2.setTitulo("DODGE Challenger Black Wide");
        i2.setDescripcion("Este auto es una edicion especial en su categoria"
                    +"con un motor de 500ph");
        
        Imagencita i3=new Imagencita();
        i3.setUrl("/Collections/dodge_charger_mopar_2011-wide[1].png");
        i3.setTitulo("DOSGE Charger Edicion Mopar");
        i3.setDescripcion("El auto es una edicion Mopar"
                    +"cuenta con equipo diferente al estandart");
        
        Imagencita i4=new Imagencita();
        i4.setUrl("/Collections/ford_gt_13-wide[1].png");
        i4.setTitulo("FORD GT-40");
        i4.setDescripcion("Nueva edicion del clasico"
                    +"cuenta con 700hp");
        
        Imagencita i5=new Imagencita();
        i5.setUrl("/Collections/nissan_gt_r_nismo_club_sports-wide[1].png");
        i5.setTitulo("NISSAN GT-40 WIDE");
        i5.setDescripcion("Este auto japones es un auto aerodinamico"
                    +"cuenta con 500hp");
        
        
        //Agremamos estas imagenes al ArrayList
        imagenes.add(i1);
        imagenes.add(i2);
        imagenes.add(i3);
        imagenes.add(i4);
        imagenes.add(i5);
        
    }

    public ArrayList<Imagencita> LeerTodas() {
        return imagenes;
    }

    public void setImagenes(ArrayList<Imagencita> imagenes) {
        this.imagenes = imagenes;
    }
    
}
