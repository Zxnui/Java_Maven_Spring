package top.weeklybuy.www.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.weeklybuy.www.dao.UserMapper;
import top.weeklybuy.www.service.IUserService;

import java.util.Map;

/**
 * Created by zxnui on 16-5-4.
 */
@Service("UserService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    public Map<String,Object> Login(Map<String,Object> map){
        Map<String,Object> user = userMapper.login(map);
        if(null!=map){
            user.put("status",1);
        }else{
            user.put("status",0);
        }
        return user;
    }
}
