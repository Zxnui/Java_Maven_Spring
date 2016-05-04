package top.weeklybuy.www.dao;

import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by zxnui on 16-5-3.
 */
@Repository
public interface UserMapper {
    Map<String,Object>login(Map<String,Object> map);
}
