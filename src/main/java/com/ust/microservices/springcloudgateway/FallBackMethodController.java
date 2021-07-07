package com.ust.microservices.springcloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/projectServiceFallBack")
    public String userServiceFallback(){
        return "PROJECT Services is too longer than expected"
                +"Try Again Later!";
    }



    @GetMapping("/employeeServiceFallBack")
    public String departmentServiceFallback(){
        return "EMPLOYEE Services is too longer than expected"
                +"Try Again Later!";
    }


    @GetMapping("/allotmentServiceFallBack")
    public String allotmentServiceFallBack(){
        return "ALLOTMENT Services is too longer than expected"
                +"Try Again Later!";
    }



    @GetMapping("/timesheetServiceFallBack")
    public String timesheetServiceFallBack(){
        return "TIMESHEET Services is too longer than expected"
                +"Try Again Later!";
    }


    @GetMapping("/reportServiceFallBack")
    public String reportServiceFallBack(){
        return "REPORT Services is too longer than expected"
                +"Try Again Later!";
    }

}