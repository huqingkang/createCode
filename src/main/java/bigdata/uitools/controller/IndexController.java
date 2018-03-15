package bigdata.uitools.controller;


import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import smartone.bigdata.utils.enums.ResultCode;
import smartone.bigdata.utils.result.JsonResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author
 */

@RestController
public class IndexController {

    @RequestMapping(value = "/abc")
    public JsonResult abc(HttpServletRequest request, HttpServletResponse response) {

        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");

        System.out.println("ffff");
        return new JsonResult(ResultCode.CUSTOM_ERROR, "error","errorInfo");
        //return "abc";
        //  String echostr = "callback input:" + getReqeustInput(request);
        // System.out.println(echostr);


    }
}
