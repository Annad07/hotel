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
import sena.modelo.entidades.TblReservas;

/**
 *
 * @author Danna
 */
@Stateless
public class TblReservasFacade extends AbstractFacade<TblReservas> implements TblReservasFacadeLocal {

    @PersistenceContext(unitName = "Hotel_EvaluacionPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TblReservasFacade() {
        super(TblReservas.class);
    }

  

    @Override
    public List<TblReservas> findReservas(String estado) {
        List<TblReservas> lista= null;
        
        try {
            Query query=em.createQuery("SELECT tbr FROM TblReservas tbr WHERE tbr.estado=:estado");
            query.setParameter("estado", estado);
            
            lista=query.getResultList();
            
          
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    
}
 