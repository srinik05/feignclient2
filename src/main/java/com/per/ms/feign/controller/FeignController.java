package com.per.ms.feign.controller;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.per.ms.feign.feigninterface.FeignClientInterface;

@RestController
public class FeignController {

    @Autowired
    public FeignClientInterface feignClientInterface;

    @RequestMapping(value = "/home")
    public String getName() {
        return "hi this is srini";
    }

    @RequestMapping("/name")
    public String getUserDetails() {
		/*JSONObject jsonObject = new JSONObject();
		jsonObject.put("message", "Hello World");
		jsonObject.put("message-2", new JSONObject(feignClientInterface.getName()));
		return jsonObject.toString();
		*/
        return feignClientInterface.getUserName();
    }

}
