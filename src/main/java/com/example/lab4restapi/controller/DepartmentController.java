package com.example.lab4restapi.controller;

import com.example.lab4restapi.bean.Departments;
import com.example.lab4restapi.service.DepartmentService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("departments")
public class DepartmentController {
    DepartmentService departmentService= new DepartmentService();

    @POST
    @Path("/add")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addDepartment(Departments dept) {
        boolean flag = departmentService.addDepartment(dept);
        return Response.ok().entity(dept).build();
    }

}
