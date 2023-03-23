package org.example;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class DemoApplication
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    @RequestMapping("/hello/{name}")
    public String sayHello(@PathVariable String name){
        return "Hello " + name;
    }


}
