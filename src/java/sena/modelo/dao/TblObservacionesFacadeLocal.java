/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena.modelo.dao;

import java.util.List;
import javax.ejb.Local;
import sena.modelo.entidades.TblObservaciones;

/**
 *
 * @author Danna
 */
@Local
public interface TblObservacionesFacadeLocal {

    void create(TblObservaciones tblObservaciones);

    void edit(TblObservaciones tblObservaciones);

    void remove(TblObservaciones tblObservaciones);

    TblObservaciones find(Object id);

    List<TblObservaciones> findAll();

    List<TblObservaciones> findRange(int[] range);

    int count();
    
}
