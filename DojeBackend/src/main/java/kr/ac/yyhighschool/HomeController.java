package kr.ac.yyhighschool;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.yyhighschool.model.Student;
import kr.ac.yyhighschool.service.iStudentService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private iStudentService studentService;

	/**
	 * main
	 */
	@RequestMapping(value = "/main1.imi", method = RequestMethod.GET)
	public String main1(Locale locale, Model model) {
		logger.info("main1 page! The client locale is {}.", locale);
		return "main1";
	}
	
	/**
	 * main
	 */
	@RequestMapping(value = "/main2.imi", method = RequestMethod.GET)
	public String main2(Locale locale, Model model) {
		logger.info("main2 page! The client locale is {}.", locale);
		return "main2";
	}
	
	
	@RequestMapping(value = "/intro/introduction.imi", method = RequestMethod.GET)
	public String introduction(Locale locale, Model model) {
		logger.info("Welcome Introduction!");
		return "intro/introduction";
	}

	@RequestMapping(value = "/studentList.imi", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		List<Map<String, Object>> students = studentService.getStudentsList();
		logger.info(students.toString());
		model.addAttribute("Students", students);
				
		return "student/student";
	}
	
}
