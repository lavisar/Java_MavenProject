package org.lavi.services;

import org.lavi.entities.Employee;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Stateless(name = "EmployeeEJB")
@LocalBean
public class EmployeeBean implements EmployeeService{

  private EntityManager entityManager;
    public EmployeeBean() {
      EntityManagerFactory managerFactory = Persistence
              .createEntityManagerFactory("ebjmaven-set2PersistenceUnit"); //nam trong file persistence.xml
      entityManager = managerFactory.createEntityManager();
    }

  @Override
  public Employee getEmployeeById(long id) {
    return null;
  }
// For creating new employees
  @Override
  public boolean addEmployee(Employee employee) {
      try {
        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();
        return true;
      } catch (Exception e) {
        e.printStackTrace();
        return false;
      }
  }
}
