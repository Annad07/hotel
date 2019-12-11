/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena.modelo.dao;

import java.util.List;
import javax.ejb.Local;
import sena.modelo.entidades.TblSedesHotel;

/**
 *
 * @author Danna
 */
@Local
public interface TblSedesHotelFacadeLocal {

    void create(TblSedesHotel tblSedesHotel);

    void edit(TblSedesHotel tblSedesHotel);

    void remove(TblSedesHotel tblSedesHotel);

    TblSedesHotel find(Object id);

    List<TblSedesHotel> findAll();

    List<TblSedesHotel> findRange(int[] range);

    int count();
    
}
