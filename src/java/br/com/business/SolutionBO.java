package br.com.business;

import br.com.Dao.DaoFactory;
import br.com.Dao.GenericDao;
import br.com.model.Solution;
import java.util.ArrayList;


public class SolutionBO {

    public void insertSolution(Solution solution) {
        GenericDao<Solution> solutionDao = DaoFactory.getDaoFactory().getSolutionDao();

        solutionDao.save(solution);
    }

    public void updateSolution(Solution solution) {
        GenericDao<Solution> solutionDao = DaoFactory.getDaoFactory().getSolutionDao();

        solutionDao.update(solution);
    }

    public void deleteSolution(int id) {
        GenericDao<Solution> solutionDao = DaoFactory.getDaoFactory().getSolutionDao();

        solutionDao.delete(id);
    }

    public ArrayList<Solution> getAllSolutions() {
        GenericDao<Solution> solutionDao = DaoFactory.getDaoFactory().getSolutionDao();

        return solutionDao.list();
    }

    public Solution getSolution(int id) {
        GenericDao<Solution> solutionDao = DaoFactory.getDaoFactory().getSolutionDao();

        return solutionDao.getById(id);
    }
}
