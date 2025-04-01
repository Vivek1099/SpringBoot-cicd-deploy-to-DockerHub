package Springboot_CI.CD_deployment_to_dockerhub.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController
{
    @GetMapping("/test")
    public String test()
    {
        return "This is demo CI/CD test";
    }
}
