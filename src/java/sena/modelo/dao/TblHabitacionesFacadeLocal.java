/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena.modelo.dao;

import java.util.List;
import javax.ejb.Local;
import sena.modelo.entidades.TblHabitaciones;

/**
 *
 * @author Danna
 */
@Local
public interface TblHabitacionesFacadeLocal {

    void create(TblHabitaciones tblHabitaciones);

    void edit(TblHabitaciones tblHabitaciones);

    void remove(TblHabitaciones tblHabitaciones);

    TblHabitaciones find(Object id);

    List<TblHabitaciones> findAll();

    List<TblHabitaciones> findRange(int[] range);

    int count();
    
}
