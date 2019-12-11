/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena.modelo.dao;

import java.util.List;
import javax.ejb.Local;
import sena.modelo.entidades.TblCiudades;

/**
 *
 * @author Danna
 */
@Local
public interface TblCiudadesFacadeLocal {

    void create(TblCiudades tblCiudades);

    void edit(TblCiudades tblCiudades);

    void remove(TblCiudades tblCiudades);

    TblCiudades find(Object id);

    List<TblCiudades> findAll();

    List<TblCiudades> findRange(int[] range);

    int count();
    
}
