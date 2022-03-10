package com.per.ms.feign.feigninterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

// url="http://localhost:2001/getCountryName"
@FeignClient("feign1")
public interface FeignClientInterface {
	
	/*@RequestMapping(value="/getUserName")
	public String getUserName();*/

    @RequestMapping("/get")
    String getUserName();


}
