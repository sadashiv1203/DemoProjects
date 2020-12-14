package Controller;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
	@InitBinder
	public void initBinder(WebDataBinder binder)
	{
		binder.registerCustomEditor(String.class,"studentName",new StudentNameEditor() );
	}
	
	@RequestMapping(value="/admission",method=RequestMethod.GET)
	public ModelAndView AdmissionForm()
	{
		System.out.println("admission");
		ModelAndView obj=new ModelAndView("Views/StudentRecordModifications/AdmissionForm");
		return obj;
	}
	
	@RequestMapping(value="/submitAdmissionForm.html",method=RequestMethod.POST)
	//public ModelAndView submitAdmissionForm(@RequestParam("studentName") String name,@RequestParam("studentHobby") String hobby)
	public ModelAndView submitAdmissionForm( @Valid  @ModelAttribute("student1") Student student1,BindingResult result)
	{
		System.out.println("admission-success");
		
		if(result.hasErrors())
		{
			ModelAndView model1=new ModelAndView("Views/StudentRecordModifications/AdmissionForm");
			return model1;
		}
		//Student obj=new Student();
		//obj.setStudentName(name);
		//obj.setStudentHobby(hobby);
		ModelAndView modal=new ModelAndView("Views/StudentRecordModifications/AdmissionSuccess");
		//modal.addObject("student1",obj);
		return modal;
	}
	
	
	@ModelAttribute
	public void addCommonObjects(Model model)
	{
		model.addAttribute("heading","hi sadashiv");
	}
	
	//@RequestMapping(value="/submitAdmissionForm.html",method=RequestMethod.POST)
	//public ModelAndView SubmitFom(@RequestParam("fname") String fname,@RequestParam("lname") String lname)
	//public ModelAndView SubmitFom(@ModelAttribute("student1") Student student)
	//{
		//System.out.println("Names::::"+fname+lname);
		
		//Student sobj=new Student();
		//sobj.setfirstName(fname);
		//sobj.setlastName(lname);
		//ModelAndView obj1=new ModelAndView("AdmissionSuccess");
	    //obj.addObject("msg", "Details Submitted by you Name : ");
		//obj.addObject("sobj",sobj);
		//return obj1;
	//}
	
	

}
