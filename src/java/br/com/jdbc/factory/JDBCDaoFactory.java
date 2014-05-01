
package br.com.jdbc.factory;

import br.com.Dao.AuthenticateDao;
import br.com.Dao.DaoFactory;
import br.com.Dao.UserDao;
import br.com.Dao.GenericDao;
import br.com.Dao.ProfileDao;
import br.com.model.Profile;
import br.com.model.User;
import br.com.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Vitor Mesaque
 */

public class JDBCDaoFactory extends DaoFactory{

    private Connection connection;

    public JDBCDaoFactory() 
    {
        try
        {
            this.connection =  ConnectionFactory.getConnection() ;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    @Override
    public GenericDao<User> getUserDao() 
    {
        return new UserDao(this.connection);
    }
    
    @Override
    public GenericDao<Profile> getProfileDao() 
    {
        return new ProfileDao(this.connection);
    }
    
    @Override
    public AuthenticateDao getAuthenticateDao() 
    {
        return new AuthenticateDao(this.connection);
    }


}