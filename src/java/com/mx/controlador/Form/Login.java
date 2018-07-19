/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.controlador.Form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author smarv
 */
public class Login extends org.apache.struts.action.ActionForm {

    private String usuario;
    private String password;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();

        if ((usuario.length() <= 0) || (usuario == null)) {
            errors.add("usuario", new ActionMessage("errors.usuario"));
        }

        if (password.length() <= 0) {
            errors.add("password", new ActionMessage("errors.password"));
        }

        mapping.getInputForward();
        return errors;
    }

}
