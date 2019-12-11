/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena.modelo.dao;

import java.util.List;
import javax.ejb.Local;
import sena.modelo.entidades.TblUsuarios;

/**
 *
 * @author Danna
 */
@Local
public interface TblUsuariosFacadeLocal {

    void create(TblUsuarios tblUsuarios);

    void edit(TblUsuarios tblUsuarios);

    void remove(TblUsuarios tblUsuarios);

    TblUsuarios find(Object id);

    List<TblUsuarios> findAll();

    List<TblUsuarios> findRange(int[] range);

    int count();
    
    
    TblUsuarios login(TblUsuarios user);
    
}
