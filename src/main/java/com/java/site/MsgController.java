package com.java.site;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MsgController {
    
    @RequestMapping("msg")
    public String msg() {
        return "msg";
    }

}
