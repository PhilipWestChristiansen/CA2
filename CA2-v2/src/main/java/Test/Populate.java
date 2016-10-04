/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Entity.Person;
import Facade.personFacade;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author pwc
 */
public class Populate {
  EntityManagerFactory emf = Persistence.createEntityManagerFactory("ca2_pu");
  EntityManager em = emf.createEntityManager();
  
  static Person p;
  personFacade pf = new personFacade(emf);
  
    public Populate()
    {
    }
    
    public static void main(String[] args)
    {
        Populate pop = new Populate();
        p = new Person("Hamza", "Laroussi");
        pop.pf.addPerson(p);
        
        
        
    }
  
    
  
}
