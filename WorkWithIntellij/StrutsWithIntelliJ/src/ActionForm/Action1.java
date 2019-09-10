package ActionForm;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Action1 extends Action {
    private static final String SUCCESS = "success";
    private static final String FAIL = "fail";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, ServletRequest request, ServletResponse response) throws Exception {
        ActionForm1 forma = (ActionForm1)form;
        if (forma.getTextField().compareTo("Diego")==0)
            return mapping.findForward(SUCCESS);
        else{
            return mapping.findForward(FAIL);
        }
    }
}
