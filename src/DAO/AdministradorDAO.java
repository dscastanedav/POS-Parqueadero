/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ENTIDAD.Administrador;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author danyy
 */
public class AdministradorDAO {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("POS_ParqueaderoPU");

    public void crear(Administrador object) {

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public boolean eliminar(Administrador object) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        boolean ret = false;
        try {
            em.remove(object);
            em.getTransaction().commit();
            ret = true;
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
            return ret;
        }
    }

    public Administrador leer(Administrador par) {
        EntityManager em = emf.createEntityManager();
        Administrador administrador = null;
        Query q = em.createQuery("SELECT u FROM Usuario u "
                + "WHERE u.nombre LIKE :nombre "
                + "AND u.password LIKE :password")
                .setParameter("nombre", par.getUsuarioAdministrador())
                .setParameter("password", par.getContraseñaAdministrador());
        try {
            administrador = (Administrador) q.getSingleResult();
        } catch (NonUniqueResultException e) {
            e.printStackTrace();
        } finally {
            em.close();
            return administrador;
        }

    }

    public boolean actualizar(Administrador object, Administrador nuevoObjeto) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        boolean ret = false;
        try {
            object = leer(object);
            object.setUsuarioAdministrador(nuevoObjeto.getUsuarioAdministrador());
            object.setUsuarioAdministrador(nuevoObjeto.getContraseñaAdministrador());
            em.merge(object);
            em.getTransaction().commit();
            ret = true;
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
            return ret;
        }
    }
}
