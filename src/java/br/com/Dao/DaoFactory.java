
package br.com.Dao;

import br.com.jdbc.factory.JDBCDaoFactory;
import br.com.model.Corporate;
import br.com.model.Profile;
import br.com.model.Solution;
import br.com.model.User;

/**
 *
 * @author Vitor Mesaque
 */
public abstract class DaoFactory {

    public static DaoFactory getDaoFactory() {
        return new JDBCDaoFactory();
    }

    public abstract GenericDao<User> getUserDao();

    public abstract GenericDao<Profile> getProfileDao();
    
    public abstract AuthenticateDao getAuthenticateDao();

    public abstract GenericDao<Corporate> getCorporateDao();

    public abstract GenericDao<Solution> getSolutionDao();
}
