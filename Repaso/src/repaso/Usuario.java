package repaso;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edu_r
 */
public class Usuario {
    String strNombre;
    String strApellido;
    String strCedula;
    String strFecha;
    int intEdad;

    public int getIntEdad() {
        return intEdad;
    }

    public void setIntEdad(int intEdad) {
        this.intEdad = intEdad;
    }

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) 
    {
        this.strNombre = strNombre;
    }

    public String getStrApellido() 
    {
        return strApellido;
    }

    public void setStrApellido(String strApellido) 
    {
        this.strApellido = strApellido;
    }

    public String getStrCedula()
    {
        return strCedula;
    }

    public void setStrCedula(String strCedula) 
    {
        this.strCedula = strCedula;
    }

    public String getStrFecha() 
    {
        return strFecha;
    }

    public void setStrFecha(String strFecha) 
    {
        this.strFecha = strFecha;
    }
}
