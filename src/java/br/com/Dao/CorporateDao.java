/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Dao;

import br.com.model.Corporate;
import br.com.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jroyo
 */
public class CorporateDao implements GenericDao<Corporate> {

    private Connection connection;

    public CorporateDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(Corporate obj) {
        try {
            String sql = "INSERT INTO companies (corporatename,fantasyname,cnpj,ie,adress,num,phone,contact,city,uf)VALUES('"
                    + obj.getCorporatename()+"','"+obj.getFantasyname()+"','"+obj.getCnpj()+"','"
                    + obj.getIe()+"','"+obj.getAddress()+"','"+obj.getNum()+"','"+obj.getPhone()+"','"
                    + obj.getContact()+"','"+obj.getCity()+"','"+obj.getUf()+"';";
            
            PreparedStatement stmt = this.connection.prepareStatement(sql);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.getStackTrace();
        }
    }

    @Override
    public void update(Corporate obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Corporate> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Corporate getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updatePass(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
