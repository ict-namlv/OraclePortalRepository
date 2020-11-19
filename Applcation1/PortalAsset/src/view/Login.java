package view;

import java.io.IOException;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.nav.RichButton;

public class Login {
    @SuppressWarnings("org.adfemg.audits.java.comp-ref")
    private RichForm f1;
    @SuppressWarnings("org.adfemg.audits.java.comp-ref")
    private RichDocument d1;
    @SuppressWarnings("org.adfemg.audits.java.comp-ref")
    private RichInputText txtUserName;
    @SuppressWarnings("org.adfemg.audits.java.comp-ref")
    private RichInputText txtPass;
    @SuppressWarnings("org.adfemg.audits.java.comp-ref")
    private RichButton btnLogin;

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }

    public void setTxtUserName(RichInputText txtUserName) {
        this.txtUserName = txtUserName;
    }

    public RichInputText getTxtUserName() {
        return txtUserName;
    }

    public void setTxtPass(RichInputText txtPass) {
        this.txtPass = txtPass;
    }

    public RichInputText getTxtPass() {
        return txtPass;
    }

    public void setBtnLogin(RichButton btnLogin) {
        this.btnLogin = btnLogin;
    }

    public RichButton getBtnLogin() {
        return btnLogin;
    }


    public String btnLogin_action() {
        // Add event code here...
        FacesContext fct = FacesContext.getCurrentInstance();
        ExternalContext ect = fct.getExternalContext();
        String Url = ect.getRequestContextPath() + "/faces/index.jsf";
        HttpServletResponse response = (HttpServletResponse) ect.getResponse();
        HttpSession session = (HttpSession) ect.getSession(false);
        // Close session
        session.invalidate();
        try {
            response.sendRedirect(Url);
            fct.responseComplete();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
