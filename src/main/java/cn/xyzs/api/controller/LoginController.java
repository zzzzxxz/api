package cn.xyzs.api.controller;

import cn.xyzs.api.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Resource
    private LoginService loginService;

    /**
     * 登陆
     * @Description:
     * @author: zheng shuai
     * @date: 2018/8/9 17:15
     * @param: [ctrTel, password, verificationCode, roleFlag]
     * @return: java.util.Map<java.lang.String,java.lang.Object>
     */
    @ResponseBody
    @RequestMapping("/login")
    public Map<String,Object> login(String userTel,String password,String verificationCode,String roleFlag){

        return loginService.login(userTel,password,verificationCode,roleFlag);
    }
}
