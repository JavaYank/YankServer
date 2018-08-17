package uz.yank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getHello(ModelMap modelMap){

        return "hello yank";
    }
}
