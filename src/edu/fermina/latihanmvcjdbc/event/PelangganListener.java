/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fermina.latihanmvcjdbc.event;

import edu.fermina.latihanmvcjdbc.entity.Pelanggan;
import edu.fermina.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author FERMI
 * NIM       : 10119043
 * NAMA      : Fermi Naufal Akbar
 * KELAS     : IF2
 * DESKRIPSI : Program King Barbershop dengan java JDBC DAO MVC
 */
public interface PelangganListener {
    public void onChange(PelangganModel model);
    public void onInsert(Pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(Pelanggan pelanggan);
    
}
