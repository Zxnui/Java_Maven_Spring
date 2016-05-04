package top.weeklybuy.www.controllers;

import org.springframework.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zxnui on 16-5-3.
 */
public abstract class BaseController {
    public Map<String,Object> getMapByRequest(HttpServletRequest request){
        Map<String,Object> map = new HashMap<String, Object>();
        Enumeration<String> names = request.getParameterNames();
        while (names.hasMoreElements()){
            String name = names.nextElement();
            String value= request.getParameter(name).trim();
            map.put(name,value);
        }
        return map;
    }
}
