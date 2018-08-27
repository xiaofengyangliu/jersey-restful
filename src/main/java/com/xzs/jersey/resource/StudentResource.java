package com.xzs.jersey.resource;

import com.xzs.jersey.bean.LoginVO;
import com.xzs.jersey.bean.ResultVO;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Component
@Path("/index")
public class StudentResource {

    @POST
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/student")
    public ResultVO getStudent(@Context HttpServletRequest request, LoginVO loginVO) {

        System.out.println(loginVO.toString());


        ResultVO resultVO = new ResultVO();
        resultVO.setMessage("登录成功");
        resultVO.setSuccess("true");
        return resultVO;
    }
}