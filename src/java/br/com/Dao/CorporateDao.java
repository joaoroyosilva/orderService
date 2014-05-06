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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
            String sql = "INSERT INTO corporates (corporatename,fantasyname,cnpj,ie,address,num,phone,phone2,contact,city,uf,active)VALUES('"
                    + obj.getCorporatename() + "','" + obj.getFantasyname() + "','" + obj.getCnpj() + "','"
                    + obj.getIe() + "','" + obj.getAddress() + "','" + obj.getNum() + "','" + obj.getPhone() + "','" + obj.getPhone2() + "','"
                    + obj.getContact() + "','" + obj.getCity() + "','" + obj.getUf() + "','" + obj.getActive() + "');";

            PreparedStatement stmt = this.connection.prepareStatement(sql);

            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void update(Corporate obj) {
        try {
            String sql = "UPDATE corporates SET corporatename='"+obj.getCorporatename()+"',"
                    + "fantasyname='"+obj.getFantasyname()+"',"
                    + "cnpj='"+obj.getCnpj()+"',"
                    + "ie='"+obj.getIe()+"',"
                    + "address='"+obj.getAddress()+"',"
                    + "num='"+obj.getNum()+"',"
                    + "phone='"+obj.getPhone()+"',"
                    + "phone2='"+obj.getPhone2()+"',"
                    + "contact='"+obj.getContact()+"',"
                    + "city='"+obj.getCity()+"',"
                    + "uf='"+obj.getUf()+"',"
                    + "active='"+obj.getActive()+"' where id="+obj.getId();

            PreparedStatement stmt = this.connection.prepareStatement(sql);

            System.out.println(stmt.toString());
            stmt.executeUpdate();
        }catch(SQLException e){
            e.getStackTrace();
        }
    }

    @Override
    public Boolean delete(int id) {
        try {
            String sql = "DELETE FROM corporates WHERE id = '" + id + "'";

            Statement stmt = this.connection.createStatement();

            stmt.executeQuery(sql);

            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<Corporate> list() {
        try {
            String sql = "SELECT * FROM corporates order by id asc";

            Statement stmt = this.connection.createStatement();

            ArrayList<Corporate> corporates = new ArrayList<>();

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Corporate corporate = new Corporate();

                corporate.setCorporatename(rs.getString("corporatename"));

                corporate.setFantasyname(rs.getString("fantasyname"));

                corporate.setCnpj(rs.getString("cnpj"));

                corporate.setIe((rs.getString("ie")));

                corporate.setAddress(rs.getString("address"));

                corporate.setNum(rs.getString("num"));

                corporate.setPhone(rs.getString("phone"));

                corporate.setPhone2(rs.getString("phone2"));

                corporate.setContact(rs.getString("contact"));

                corporate.setCity(rs.getString("city"));

                corporate.setUf(rs.getString("uf"));

                corporate.setActive(rs.getBoolean("active"));

                corporate.setId(rs.getInt("id"));

                corporates.add(corporate);
            }

            return corporates;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Corporate getById(int id) {
        try {
            String sql = "SELECT * FROM corporates where id=" + id;

            Statement stmt = this.connection.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            Corporate corporate = new Corporate();

            while (rs.next()) {

                corporate.setCorporatename(rs.getString("corporatename"));

                corporate.setFantasyname(rs.getString("fantasyname"));

                corporate.setCnpj(rs.getString("cnpj"));

                corporate.setIe((rs.getString("ie")));

                corporate.setAddress(rs.getString("address"));

                corporate.setNum(rs.getString("num"));

                corporate.setPhone(rs.getString("phone"));

                corporate.setPhone2(rs.getString("phone2"));

                corporate.setContact(rs.getString("contact"));

                corporate.setCity(rs.getString("city"));

                corporate.setUf(rs.getString("uf"));

                corporate.setActive(rs.getBoolean("active"));

                corporate.setId(rs.getInt("id"));

            }

            return corporate;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void updatePass(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
