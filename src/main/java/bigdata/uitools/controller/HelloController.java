/*
package bigdata.uitools.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import smartone.bigdata.utils.common.ResultLog;
import smartone.bigdata.utils.enums.ResultCode;
import smartone.bigdata.utils.result.JsonResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

*/
/**
 * Created by chun on 2017/2/20.
 *//*

@RestController
@EnableFeignClients
@EnableDiscoveryClient
@EnableTransactionManagement
public class HelloController {




    @RequestMapping(value = "/",method = RequestMethod.GET)
    public JsonResult index(HttpServletRequest request ) throws InterruptedException {

        return new JsonResult(ResultCode.CUSTOM_ERROR,  "errror！", "///");
    }

    @RequestMapping(value = "/abc",method = RequestMethod.GET)
    public JsonResult index1(HttpServletRequest request) throws InterruptedException {

        return new JsonResult(ResultCode.SUCCESS,  "成功222！", "abc");
    }


}

*/
