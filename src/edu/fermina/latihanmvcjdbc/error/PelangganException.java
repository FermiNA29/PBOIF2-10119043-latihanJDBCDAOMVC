/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fermina.latihanmvcjdbc.error;

/**
 *
 * @author FERMI
 * NIM       : 10119043
 * NAMA      : Fermi Naufal Akbar
 * KELAS     : IF2
 * DESKRIPSI : Program King Barbershop dengan java JDBC DAO MVC
 */
public class PelangganException extends Exception {

    /**
     * Creates a new instance of <code>PelangganException</code> without detail
     * message.
     */
    public PelangganException() {
    }

    /**
     * Constructs an instance of <code>PelangganException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PelangganException(String msg) {
        super(msg);
    }
}
