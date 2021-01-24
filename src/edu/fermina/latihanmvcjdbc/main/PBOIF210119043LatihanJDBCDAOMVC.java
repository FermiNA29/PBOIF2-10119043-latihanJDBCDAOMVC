/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fermina.latihanmvcjdbc.main;
import edu.fermina.latihanmvcjdbc.database.KingBarbershopDatabase;
import edu.fermina.latihanmvcjdbc.entity.Pelanggan;
import edu.fermina.latihanmvcjdbc.error.PelangganException;
import edu.fermina.latihanmvcjdbc.service.PelangganDao;
import edu.fermina.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
/**
 *
 * @author FERMI
 */
public class PBOIF210119043LatihanJDBCDAOMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        //KingBarbershopDatabase.getConnection();
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(PBOIF210119043LatihanJDBCDAOMVC.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
}
