package controller.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class Demo 
{
	
	@RequestMapping(value="/admission.html",method = RequestMethod.GET)
	public ModelAndView getAdmissionForm()
	{
		ModelAndView obj= new ModelAndView("AdmissionForm");
		return obj;
	}
	
	@RequestMapping(value="/submitAdmissionForm.html",method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm()
	{
		ModelAndView obj= new ModelAndView("AdmissionSuccess");
		obj.addObject("msg","Details submitted by you::Name:");
		return obj;
	}

	

}
