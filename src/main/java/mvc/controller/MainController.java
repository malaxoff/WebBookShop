package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import mvc.model.User;


@Controller
public class MainController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userJSP", new User());
        modelAndView.setViewName("index");
        return modelAndView;
    }


    @RequestMapping(value = "/fio-out", method = RequestMethod.POST)
    public ModelAndView fioOutUser(@ModelAttribute("userJSP") User user) {
        ModelAndView modelAndView = new ModelAndView();


        modelAndView.setViewName("fio-outPage");


        modelAndView.addObject("userJSP", user);

        return modelAndView;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ModelAndView registrationUser(@ModelAttribute("userJSP") User user) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userJSP", new User());
        modelAndView.setViewName("registrationPage");
        return modelAndView;
    }





}
