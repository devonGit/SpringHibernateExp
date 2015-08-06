package com.java.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.entity.CorumUser;
import com.java.services.CorumServiceDao;


@Controller
public class crumUserControlller {

	@Autowired private CorumServiceDao corumserviceDao;
	
	@RequestMapping("/index")
	public String corumForm(Map<String, Object> map){
		CorumUser corumuser=new CorumUser();
		map.put("corumuser", corumuser);
		map.put("corumuserList", corumserviceDao.getAllUser());
		System.out.println("hi i am in index...");
		return "CorumResult";
		
	}
	
	@RequestMapping(value="/corumUser",method=RequestMethod.POST)
	public String corumAction(@ModelAttribute CorumUser corumuser,BindingResult result,@RequestParam String action,Map<String, Object> map){
	
		CorumUser corumUserResult=new CorumUser();
		switch(action.toLowerCase()){
		case "add":
			corumserviceDao.addUser(corumuser);
			corumUserResult=corumuser;
			break;
		case "edit":
			corumserviceDao.edituser(corumuser);
			corumUserResult=corumuser;
			break;
			
		case "delete":
			corumserviceDao.deleteuser(corumuser.getId());
			corumUserResult=new CorumUser();
			break;
		case "search":
			CorumUser searchcorumUser=corumserviceDao.getuser(corumuser.getId());
			corumUserResult=searchcorumUser!=null ? searchcorumUser : new CorumUser();
			break;
		}
		map.put("corumuser", corumUserResult);
		map.put("corumuserList", corumserviceDao.getAllUser());
		System.out.println(corumserviceDao.getAllUser());
		return "CorumResult";
		
		
	}
	
	
	
	
	
	
	
}
