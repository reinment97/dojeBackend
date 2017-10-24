package kr.ac.yyhighschool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping(value = "/api")
public class DataController {

	private static final Logger logger = LoggerFactory.getLogger(DataController.class);
	
	@Autowired
	private iStudentService studentService;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/studentList.json", method = {RequestMethod.POST})
	public @ResponseBody List<Student> getStudentList(@RequestParam Map<String, String> reqParam) throws Exception {
		
		List<Student> studentList = new ArrayList<Student>();
		studentList = studentService.getStudents();
		
		return studentList;
	}

}
