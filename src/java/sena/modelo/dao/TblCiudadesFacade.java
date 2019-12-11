/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena.modelo.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sena.modelo.entidades.TblCiudades;

/**
 *
 * @author Danna
 */
@Stateless
public class TblCiudadesFacade extends AbstractFacade<TblCiudades> implements TblCiudadesFacadeLocal {

    @PersistenceContext(unitName = "Hotel_EvaluacionPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TblCiudadesFacade() {
        super(TblCiudades.class);
    }
    
}
