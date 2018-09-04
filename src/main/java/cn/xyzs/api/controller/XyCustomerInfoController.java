package cn.xyzs.api.controller;

import cn.xyzs.api.service.XyCustomerInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller
@RequestMapping("/CustomerInfo")
public class XyCustomerInfoController {

    @Resource
    private XyCustomerInfoService xyCustomerInfoService;

    @ResponseBody
    @RequestMapping("/getCustomerEngineeringInfo")
    public Map<String,Object> getCustomerEngineeringInfo(String ctrTel){
        return xyCustomerInfoService.getCustomerEngineeringInfo(ctrTel);
    }
}
