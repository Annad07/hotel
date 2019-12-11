/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena.modelo.dao;

import java.util.List;
import javax.ejb.Local;
import sena.modelo.entidades.TblTiposDocumento;

/**
 *
 * @author Danna
 */
@Local
public interface TblTiposDocumentoFacadeLocal {

    void create(TblTiposDocumento tblTiposDocumento);

    void edit(TblTiposDocumento tblTiposDocumento);

    void remove(TblTiposDocumento tblTiposDocumento);

    TblTiposDocumento find(Object id);

    List<TblTiposDocumento> findAll();

    List<TblTiposDocumento> findRange(int[] range);

    int count();
    
}
