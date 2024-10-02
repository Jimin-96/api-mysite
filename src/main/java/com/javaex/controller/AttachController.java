package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.javaex.service.AttachService;
import com.javaex.util.JsonResult;
import com.javaex.vo.AttachVo2;

@RestController
public class AttachController {
	
	@Autowired
	private AttachService service;
	
	@PostMapping(value = "/api/attaches")
	public JsonResult form(@RequestParam("profileImg") MultipartFile profileImg) {
		System.out.println("AttachController.form()");
		System.out.println(profileImg.getOriginalFilename());
		String result = service.exeUpload(profileImg);
		
		return JsonResult.success(result);
	}
	
	@PostMapping(value = "/api/attaches2")
	public JsonResult form2(@ModelAttribute AttachVo2 attach, @RequestParam("content") String content) {
		
		System.out.println("AttachController.form2()");
		System.out.println(attach);
		String result = service.exeUpload2(attach);
		return JsonResult.success(result);

		
	}

}