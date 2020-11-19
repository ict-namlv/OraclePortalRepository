package view;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichActiveOutputText;
import oracle.adf.view.rich.component.rich.output.RichOutputText;

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

    public void setB1(RichButton b1) {
        this.btnLogin = b1;
    }

    public RichButton getB1() {
        return btnLogin;
    }


    public String btnLogin_action() {
        // Add event code here...
        return null;
    }
}
