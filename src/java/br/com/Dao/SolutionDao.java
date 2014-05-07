/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Dao;

import br.com.model.Solution;
import br.com.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jroyo
 */
public class SolutionDao implements GenericDao<Solution> {

    private Connection connection;

    public SolutionDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(Solution obj) {
        try {
            String sql = "INSERT INTO solutions(name,description,active) values ('"
                    + obj.getName() + "','" + obj.getDescription() + "','" + obj.getActive() + "');";
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            stmt.executeQuery();
        } catch (SQLException e) {
            e.getStackTrace();
        }
    }

    @Override
    public void update(Solution obj) {
        try{
            String sql="UPDATE solutions SET name='"+obj.getName()+"',description='"+obj.getDescription()+"',"
                    + "active='"+obj.getActive()+"' WHERE id='"+obj.getId()+"';";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.executeUpdate();
        }catch(SQLException e){
            e.getStackTrace();
        }
    }

    @Override
    public Boolean delete(int id) {
        try {
            String sql = "DELETE FROM solutions where id='" + id + "';";
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            stmt.executeQuery();
            return true;
        } catch (SQLException e) {
            e.getStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<Solution> list() {
        ArrayList<Solution> solutions = new ArrayList();
        try {
            String sql = "SELECT * FROM solutions ORDER BY id ASC";
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Solution solution = new Solution();
                solution.setId(rs.getInt("id"));
                solution.setName(rs.getString("name"));
                solution.setDescription(rs.getString("description"));
                solution.setActive(rs.getBoolean("active"));
                solutions.add(solution);
            }
            return solutions;
        } catch (SQLException e) {
            e.getStackTrace();
        }
        return null;
    }

    @Override
    public Solution getById(int id) {
        Solution solution = new Solution();
        try {
            String sql = "SELECT * FROM solutions WHERE id='" + id + "';";
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                solution.setId(rs.getInt("id"));
                solution.setName(rs.getString("name"));
                solution.setDescription(rs.getString("description"));
                solution.setActive(rs.getBoolean("active"));
            }
            return solution;
        } catch (SQLException e) {
            e.getSQLState();
        }
        return null;
    }

    @Override
    public void updatePass(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
