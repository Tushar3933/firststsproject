package com.sts;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class test_controller {
	@RequestMapping("/test")
    @ResponseBody
	public String test() {
		
		return "test";
	}

}
