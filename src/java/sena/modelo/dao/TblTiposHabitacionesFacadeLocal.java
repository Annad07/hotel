/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena.modelo.dao;

import java.util.List;
import javax.ejb.Local;
import sena.modelo.entidades.TblTiposHabitaciones;

/**
 *
 * @author Danna
 */
@Local
public interface TblTiposHabitacionesFacadeLocal {

    void create(TblTiposHabitaciones tblTiposHabitaciones);

    void edit(TblTiposHabitaciones tblTiposHabitaciones);

    void remove(TblTiposHabitaciones tblTiposHabitaciones);

    TblTiposHabitaciones find(Object id);

    List<TblTiposHabitaciones> findAll();

    List<TblTiposHabitaciones> findRange(int[] range);

    int count();
    
}
