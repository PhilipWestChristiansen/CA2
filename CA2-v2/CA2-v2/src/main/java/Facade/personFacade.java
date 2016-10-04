/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author pwc
 */
public class personFacade {
/*
    EntityManagerFactory emf;

    public personFacade(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public personFacade getPerson(int id) {
        EntityManager em = emf.createEntityManager();

        personFacade p = null;

        try {
            em.getTransaction().begin();
            p = em.find(personFacade.class, id);
            em.getTransaction().commit();
            return p;
        } finally {
            em.close();
        }
    }

    public List<personFacade> getPersons() {
        EntityManager em = emf.createEntityManager();

        List<personFacade> persons = null;

        try {
            em.getTransaction().begin();
            persons = em.createQuery("Select p from Person p").getResultList();
            em.getTransaction().commit();
            return persons;
        } finally {
            em.close();
        }
    }

    public personFacade addPerson(personFacade p) {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            return p;
        } finally {
            em.close();
        }
    }

    public personFacade deletePerson(int id) {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            personFacade p = em.find(personFacade.class, id);
            em.remove(p);
            em.getTransaction().commit();
            return p;
        } finally {
            em.close();
        }
    }

    public personFacade editPerson(personFacade pers) {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            personFacade p = em.find(personFacade.class, pers.getId());
            if (p != null) {
                p = pers;
                em.merge(p);
                em.getTransaction().commit();
                return p;
            }
        } finally {
            em.close();
        }

        return null;
    }
*/
}
