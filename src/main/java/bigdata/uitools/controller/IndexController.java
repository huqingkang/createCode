package bigdata.uitools.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author
 */

@RestController
public class IndexController {

    @RequestMapping(value = "/abc" )
    public String abc(

            HttpServletRequest request, HttpServletResponse response
    ) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");

        System.out.println("ffff");

        return "abc";
        //  String echostr = "callback input:" + getReqeustInput(request);
        // System.out.println(echostr);


    }
}
