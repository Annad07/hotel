/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena.modelo.dao;

import java.util.List;
import javax.ejb.Local;
import sena.modelo.entidades.TblTiposUsuarios;

/**
 *
 * @author Danna
 */
@Local
public interface TblTiposUsuariosFacadeLocal {

    void create(TblTiposUsuarios tblTiposUsuarios);

    void edit(TblTiposUsuarios tblTiposUsuarios);

    void remove(TblTiposUsuarios tblTiposUsuarios);

    TblTiposUsuarios find(Object id);

    List<TblTiposUsuarios> findAll();

    List<TblTiposUsuarios> findRange(int[] range);

    int count();
    
}
