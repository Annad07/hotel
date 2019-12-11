/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sena.Controllers;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import sena.modelo.dao.*;
import sena.modelo.dao.TblSedesHotelFacadeLocal;
import sena.modelo.dao.TblTiposHabitacionesFacadeLocal;
import sena.modelo.entidades.TblHabitaciones;
import sena.modelo.entidades.*;

@Named
@RequestScoped
public class habitacionesController {
    @EJB
    private TblHabitacionesFacadeLocal habitacionesFacadeLocal;
    @EJB
    private TblSedesHotelFacadeLocal sedesHotelFacadeLocal;
    @EJB
    private TblTiposHabitacionesFacadeLocal tiposHabitacionesFacadeLocal;
    
    
    private TblHabitaciones tbhabitaciones; 
    private TblSedesHotel sedesHotel;
    private TblTiposHabitaciones tblTiposHabitaciones;
    
    
    List<TblSedesHotel> listHabi;
    List<TblTiposHabitaciones> listTipoHa;
    
    @PostConstruct
    public void init(){
       tbhabitaciones=new TblHabitaciones();
       sedesHotel = new TblSedesHotel();
       tblTiposHabitaciones = new TblTiposHabitaciones();
       listHabi = sedesHotelFacadeLocal.findAll();
       listTipoHa= tiposHabitacionesFacadeLocal.findAll();
       
    }

    public TblSedesHotel getSedesHotel() {
        return sedesHotel;
    }

    public void setSedesHotel(TblSedesHotel sedesHotel) {
        this.sedesHotel = sedesHotel;
    }
    

    public TblHabitaciones getTbHabitaciones() {
        return tbhabitaciones;
    }

    public void setHabitaciones(TblHabitaciones habitaciones) {
        this.tbhabitaciones = habitaciones;
    }

    public TblTiposHabitaciones getTblTiposHabitaciones() {
        return tblTiposHabitaciones;
    }

    public void setTblTiposHabitaciones(TblTiposHabitaciones tblTiposHabitaciones) {
        this.tblTiposHabitaciones = tblTiposHabitaciones;
    }

    public List<TblSedesHotel> getListHabi() {
        return listHabi;
    }

    public void setListHabi(List<TblSedesHotel> listHabi) {
        this.listHabi = listHabi;
    }

    public List<TblTiposHabitaciones> getListTipoHa() {
        return listTipoHa;
    }

    public void setListTipoHa(List<TblTiposHabitaciones> listTipoHa) {
        this.listTipoHa = listTipoHa;
    }
    
    public void registroHabitacion(){
        try {
            tbhabitaciones.setTblSedesHotelId(sedesHotel);
            tbhabitaciones.setTblTiposHabitacionesId(tblTiposHabitaciones);
            habitacionesFacadeLocal.create(tbhabitaciones);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "AVISO", "Se ha registrado exitosamente"));
        } catch (Exception e) {
            e.printStackTrace();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "ERROR", "Ocurrio un error"));

 
        }
                
             
    }
    
}
