package top.weeklybuy.www.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import top.weeklybuy.www.service.IUserService;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by zxnui on 16-4-29.
 */
@Controller
@RequestMapping("/")
class MainController extends BaseController{
    @Autowired
    private IUserService userService;

    @RequestMapping("")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(ModelMap model, HttpServletRequest request){
        Map<String,Object> map = userService.Login(getMapByRequest(request));
        model.addAttribute("result", map);
        return "index";
    }
}
