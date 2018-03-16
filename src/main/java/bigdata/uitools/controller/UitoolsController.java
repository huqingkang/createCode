package bigdata.uitools.controller;



import bigdata.uitools.dto.UitoolsDTO;
import bigdata.uitools.service.UitoolsService;
import bigdata.uitools.utils.ResponseUtil;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import smartone.bigdata.utils.enums.ResultCode;
import smartone.bigdata.utils.result.JsonResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by buck on 2018/03/16.
 * @author buck wang
 */

@RestController
public class UitoolsController {

    @Autowired
    private UitoolsService uitoolsService;


    @RequestMapping(value = "/abc")
    public void abc(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");

        System.out.println("ffff");
        //return  new JsonResult(ResultCode.CUSTOM_ERROR, "error","errorInfo");
        JSONObject json = new JSONObject();
        json.put("result", new JsonResult(ResultCode.CUSTOM_ERROR, "error","errorInfo"));
        json.put("code", "0");
        ResponseUtil.print(response,json.toString());

    }
    @RequestMapping(value = "/queryList")
    public void queryList(HttpServletRequest request, HttpServletResponse response,
                          @RequestParam(name = "startDate", defaultValue = "2018-03-14") String startDate,
                          @RequestParam(name = "endDate", defaultValue = "2018-03-17") String endDate) throws IOException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");

        JSONObject json = new JSONObject();
        UitoolsDTO dto = new UitoolsDTO();

        if(!StringUtils.isEmpty(startDate)&&!StringUtils.isEmpty(endDate)){
            dto.setStartDate(startDate);
            dto.setEndDate(endDate);
            List<Map<String,String>> resultList = uitoolsService.selectUitools(dto);
            json.put("result",resultList);
            ResponseUtil.print(response,json.toString());
        }else{

            json.put("result", new JsonResult(ResultCode.CUSTOM_ERROR, "error","errorInfo"));
            ResponseUtil.print(response,json.toString());
        }
    }
    @RequestMapping(value = "/delUitoolsById")
    public void delUitoolsById(HttpServletRequest request, HttpServletResponse response,
                               @RequestParam(name = "idList", defaultValue = "") int[] idList) throws IOException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");

        JSONObject json = new JSONObject();
        //String id = idList[0];
        if(idList.length>0){

            uitoolsService.deleteUitools(idList);
            json.put("result","success");
            ResponseUtil.print(response,json.toString());

        }else{

            json.put("result", new JsonResult(ResultCode.CUSTOM_ERROR, "未选中要删除的行数","errorInfo"));
            ResponseUtil.print(response,json.toString());
        }
    }
}
