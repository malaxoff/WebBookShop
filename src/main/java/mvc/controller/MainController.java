package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import mvc.model.TempUser;
import pckgzz.logic.autorisation.Autorisation;


@Controller
public class MainController {

  // **********************   отправляет на страницу авторизации ******************************************************

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userJSP", new TempUser());
        modelAndView.setViewName("index");
        return modelAndView;
    }



    // ****************   вываливаемся сюда после ввода логина и пароля на первой странице **************************

    @RequestMapping(value = "/autorisationResult", method = RequestMethod.POST)
    public ModelAndView fioOutUser(@ModelAttribute("userJSP") TempUser user) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userJSP", user);


        Autorisation.autorisation(user);
                 /*
            modelAndView.setViewName("not_okeyPage");
            return modelAndView;

           */

        modelAndView.setViewName("okeyPage");
        return modelAndView;
    }









    @RequestMapping(value = "/registrationProcedure", method = RequestMethod.POST)
    public ModelAndView registrationUser(@ModelAttribute("userJSP") TempUser user) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userJSP", new TempUser());
        modelAndView.setViewName("registrationPage");
        return modelAndView;
    }





}
