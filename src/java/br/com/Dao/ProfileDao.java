package br.com.Dao;

import br.com.model.Module;
import br.com.model.Profile;
import br.com.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Vitor Mesaque
 */
public class ProfileDao implements GenericDao<Profile> {

    private Connection connection;

    public ProfileDao(Connection connection) {
        this.connection = connection;
    }

    public void save(Profile profile) {

        try {
            String sql = "INSERT INTO profile (name,description,active) VALUES ('" + profile.getName() + "','" + profile.getDescription() + "','" + profile.getActive() + "')";

            PreparedStatement stmt = this.connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            stmt.executeUpdate();

            ResultSet id = stmt.getGeneratedKeys();

            id.next();

            int lastId = id.getInt(1);

            for (Module module : profile.getModules()) {
                String sqlAux = "INSERT INTO profile_module (module,profile) VALUES ('" + module.getId() + "','" + lastId + "')";

                PreparedStatement stmtAux = this.connection.prepareStatement(sqlAux);

                stmtAux.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Profile> list() {

        try {
            String sql = "SELECT * FROM profile";

            Statement stmt = this.connection.createStatement();

            ArrayList<Profile> profiles = new ArrayList<>();

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Profile profile = new Profile(rs.getString("name"), rs.getString("description"), rs.getBoolean("active"));

                profile.setId(rs.getInt("id"));

                profiles.add(profile);

            }

            return profiles;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Profile getById(int id) {

        try {
            String sql = "SELECT * FROM profile WHERE id = '" + id + "'";

            Statement stmt = this.connection.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                Profile profile = new Profile(rs.getString("name"), rs.getString("description"), rs.getBoolean("active"));

                profile.setId(rs.getInt("id"));

                return profile;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void update(Profile profile) {

        try {
            String sql = "UPDATE profile SET name = '" + profile.getName() + "', description = '" + profile.getDescription() + "', active = '" + profile.getActive() + "' WHERE id = " + profile.getId();
            System.out.println(sql);
            PreparedStatement stmt = this.connection.prepareStatement(sql);

            stmt.executeUpdate();
            String sqlDel = "DELETE FROM profile_module WHERE profile = '" + profile.getId() + "'";

            PreparedStatement stmtDel = this.connection.prepareStatement(sqlDel);

            stmtDel.executeUpdate();

            for (Module module : profile.getModules()) {


                String sqlAux = "INSERT INTO profile_module (profile,module) VALUES ('" + profile.getId() + "','" + module.getId() + "')";

                PreparedStatement stmtAux = this.connection.prepareStatement(sqlAux);

                stmtAux.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Boolean delete(int id) {
        try {
            String sql = "DELETE FROM profile WHERE id = '" + id + "'";

            Statement stmt = this.connection.createStatement();

            stmt.executeQuery(sql);

            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void updatePass(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}