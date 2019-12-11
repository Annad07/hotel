/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena.modelo.dao;

import static java.util.Collections.list;
import java.util.List;
import javax.ejb.Local;
import sena.modelo.entidades.TblReservas;

/**
 *
 * @author Danna
 */
@Local
public interface TblReservasFacadeLocal {

    void create(TblReservas tblReservas);

    void edit(TblReservas tblReservas);

    void remove(TblReservas tblReservas);

    TblReservas find(Object id);

    List<TblReservas> findAll();

    List<TblReservas> findRange(int[] range);

    int count();
    
    List<TblReservas> findReservas(String estado);
    
}
