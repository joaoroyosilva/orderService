
package br.com.business;

import br.com.Dao.DaoFactory;
import br.com.Dao.GenericDao;
import br.com.model.Corporate;
import java.util.ArrayList;

/**
 *
 * @author Vitor Mesaque
 */
public class CorporateBO
{
        
    public void insertCorporate(Corporate corporate)
    {
        GenericDao<Corporate> corporateDao= DaoFactory.getDaoFactory().getCorporateDao();
       
        corporateDao.save(corporate);
    }
    
    public void updateCorporate(Corporate corporate)
    {
        GenericDao<Corporate> corporateDao= DaoFactory.getDaoFactory().getCorporateDao();
       
        corporateDao.update(corporate);
    }

    public void deleteCorporate(int id)
    {
        GenericDao<Corporate> corporateDao= DaoFactory.getDaoFactory().getCorporateDao();
       
        corporateDao.delete(id);
    }
    
    public ArrayList<Corporate> getAllCorporates()
    {
        GenericDao<Corporate> corporateDao= DaoFactory.getDaoFactory().getCorporateDao();
       
        return corporateDao.list();
    }
    
     public Corporate getCorporate(int id)
    {
        GenericDao<Corporate> corporateDao= DaoFactory.getDaoFactory().getCorporateDao();
       
        return corporateDao.getById(id);
    }
}
