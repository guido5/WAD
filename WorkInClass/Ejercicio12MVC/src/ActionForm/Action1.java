package ActionForm;

import org.apache.struts.*;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;

public class Action1 extends Action {
    private static final String SUCCESS = "success";
    private static final String FAIL = "fail";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws  Exception {
        ActionForm1 forma = (ActionForm1)form;
        if (forma.getNombre().compareTo("Diego")==0)
            return mapping.findForward(SUCCESS);
        else{
            return mapping.findForward(FAIL);
        }
    }
}
