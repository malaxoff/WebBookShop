package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import mvc.model.TempUser;


@Controller
public class MainController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userJSP", new TempUser());
        modelAndView.setViewName("index");
        return modelAndView;
    }


    @RequestMapping(value = "/fio-out", method = RequestMethod.POST)
    public ModelAndView fioOutUser(@ModelAttribute("userJSP") TempUser user) {




        ModelAndView modelAndView = new ModelAndView();


        modelAndView.setViewName("fio-outPage");


        modelAndView.addObject("userJSP", user);

        return modelAndView;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ModelAndView registrationUser(@ModelAttribute("userJSP") TempUser user) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userJSP", new TempUser());
        modelAndView.setViewName("registrationPage");
        return modelAndView;
    }





}
