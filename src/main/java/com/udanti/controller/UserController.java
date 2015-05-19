package com.udanti.controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.udanti.UserTest;
import com.udanti.constant.ApplicationConstant;
import com.udanti.exception.ServiceException;
import com.udanti.service.UserService;

@Controller
@RequestMapping("admin")
public class UserController {

	public static final Logger LOGGER = Logger.getLogger(UserController.class);

	@Autowired
	UserService userService;

	@RequestMapping("/index")
	public String index() {

		return "/common/homePage";
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String firstPage() {
		LOGGER.info("Welcome udanati ...........");
		return ApplicationConstant.INDEX;
	}

	@RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
	public String welcome(HttpSession session, Model model, UserTest userTest)
			throws ServiceException {

		LOGGER.info("login check ...........");
		UserTest user = userService.loginCheck(userTest.getuName(),
				userTest.getPassword());
		LOGGER.info("UserName" + user.getuName());
		model.addAttribute("user", user);
		return "/admin/dashboard";
	}

	@RequestMapping(value = "admin/test", method = RequestMethod.GET)
	public String firstPage1() {
		LOGGER.info(".....test href...........");
		return "/admin/index";
	}

}
