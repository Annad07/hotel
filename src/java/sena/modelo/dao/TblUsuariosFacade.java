/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena.modelo.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import sena.modelo.entidades.TblUsuarios;

/**
 *
 * @author Danna
 */
@Stateless
public class TblUsuariosFacade extends AbstractFacade<TblUsuarios> implements TblUsuariosFacadeLocal {

    @PersistenceContext(unitName = "Hotel_EvaluacionPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TblUsuariosFacade() {
        super(TblUsuarios.class);
    }

    @Override
    public TblUsuarios login(TblUsuarios user) {
         TblUsuarios u = null;
        try {
            Query query = em.createQuery("SELECT u FROM TblUsuarios u WHERE u.correo = :correo AND  u.clave = :clave");
            query.setParameter("correo", user.getCorreo());
            query.setParameter("clave", user.getClave());
            List<TblUsuarios> listaUser = query.getResultList();
            if (!listaUser.isEmpty()) {
                u = listaUser.get(0);
            }
        } catch (Exception e) {
            throw e;
        }
        return u;
    }
    
}
