
package sena.Controllers;

import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import sena.modelo.dao.TblReservasFacadeLocal;
import sena.modelo.entidades.TblReservas;

@Named
@RequestScoped
public class reservasController {
    @EJB
    private TblReservasFacadeLocal tblreservasFacadeLocal;
    private TblReservas tblReservas;
    private List<TblReservas> listReserv;

    public reservasController() {
    }

    public TblReservas getTblReservas() {
        return tblReservas;
    }

    public void setTblReservas(TblReservas tblReservas) {
        this.tblReservas = tblReservas;
    }

    public List<TblReservas> getListReserv() {
        return listReserv;
    }

    public void setListReserv(List<TblReservas> listReserv) {
        this.listReserv = listReserv;
    }
    
    public List<TblReservas> listReservas(){
        List<TblReservas> listReservas=null; 
        
        try {
            listReservas =tblreservasFacadeLocal.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listReservas;
    }
    public List<TblReservas> listaActiva(){
       List<TblReservas> lista= null;
       
        try {
        lista = tblreservasFacadeLocal.findReservas("ACTIVA");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
}
