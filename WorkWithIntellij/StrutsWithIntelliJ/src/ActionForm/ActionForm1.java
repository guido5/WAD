package ActionForm;

public class ActionForm1 extends org.apache.struts.action.ActionForm {
    public String getTextField() {
        return textField;
    }

    public void setTextField(String textField) {
        this.textField = textField;
    }

    public ActionForm1(String textField) {
        this.textField = textField;
    }

    private String textField;


}
