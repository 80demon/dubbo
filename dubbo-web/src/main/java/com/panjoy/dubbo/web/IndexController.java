package com.panjoy.dubbo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: panjoy
 * @Description:
 * @Date: Created in 16:42 2017-10-24
 * @Modfied By:
 */
@RestController
@RequestMapping
public class IndexController {
    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }
}
