package Controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*@Controller
public class Welcome
{
	@RequestMapping("/xxx")
	public ModelAndView helloWorld()
	{
		ModelAndView obj=new ModelAndView("HelloPage");
		obj.addObject("welcomeMessage","Hi User,Welcome to the application using spring");
		return obj;
	}
	@RequestMapping("/xxx/{username}")
	public ModelAndView helloWorld(@PathVariable("username") String name)
	{
		ModelAndView obj=new ModelAndView("HelloPage");
		obj.addObject("welcomeMessage","Hi User,Welcome to the application using spring  :  "+name);
		return obj;
	}
}*/

//This is without annotation
/*public class Welcome extends AbstractController {
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,HttpServletResponse res) throws Exception
	{
		ModelAndView obj=new ModelAndView("HelloPage");
		obj.addObject("welcomeMessage","Hi User,Welcome to the application using spring");
		return obj;
	}

}*/
