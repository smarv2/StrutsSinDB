/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.controlador.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author smarv
 */
public class LoginAction extends org.apache.struts.action.Action {

    private com.mx.controlador.Form.Login Formulario;
    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        Formulario = (com.mx.controlador.Form.Login) form;
        com.mx.Modelo.Usuarios us = new com.mx.Modelo.Usuarios();

        ActionForward retorno = new ActionForward();

        if (Formulario.getUsuario().equals(us.getUsuario()) && (Formulario.getPassword().equals(us.getPassword()))) {
            retorno = mapping.findForward("welcome");
        } else {
            ActionErrors errors = new ActionErrors();
            errors.add("Invalido", new ActionMessage("errors.Invalido"));
            //Se almacena error
            saveErrors(request, errors);
            retorno = mapping.getInputForward();
        }

        return retorno;

    }
}
