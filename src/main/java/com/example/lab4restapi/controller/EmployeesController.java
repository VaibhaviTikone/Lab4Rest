package com.example.lab4restapi.controller;

import com.example.lab4restapi.bean.Employees;
import com.example.lab4restapi.service.EmployeesService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("employees")
public class EmployeesController {
    EmployeesService employeesService = new EmployeesService();

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEmployees() {
        List<Employees> employee = employeesService.getEmployees();
        System.out.println(employee);
        return Response.ok().entity(employee).build();
    }


    }
