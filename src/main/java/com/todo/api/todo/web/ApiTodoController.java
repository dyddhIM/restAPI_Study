package com.todo.api.todo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.todo.api.VO.TodoVO;
import com.todo.api.todo.service.TodoService;

@RestController()
@RequestMapping("api")
public class ApiTodoController {

	@Autowired
	private TodoService todoService;

	// Todo 조회 -  
	@GetMapping(value = "/todo/todoTypeSelectList")
	public ModelAndView TodoTypeSelectList(@ModelAttribute("TodoVO") TodoVO todoVO) throws Exception {

		todoVO.setTodoUnit("D");

		List<TodoVO> list = todoService.selectTypeTodoList(todoVO);

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("todoTypeSelectList", list); 
		modelAndView.setViewName("jsonView");
		return modelAndView;

	}

	// todo 등록 ( TodoUnit : Y, M, D (년, 월, 일))
	@RequestMapping(value = "todo/todoTypeInsert.do", method = RequestMethod.POST)
	public ModelAndView TodoInsert(@ModelAttribute("TodoVO") TodoVO todoVO) throws Exception {

		ModelAndView modelAndView = new ModelAndView();

		todoVO.setUserId("dyddh1253");
		todoVO.setTodoTitle("로컬 타이틀");
		todoVO.setTodoContent("로컬 내용");
		todoVO.setTodoUnit("Y");

		todoService.insertTypeTodo(todoVO);
		modelAndView.addObject("todoInsertMessage", "등록이 완료되었습니다.");
		modelAndView.setViewName("jsonView");
		return modelAndView;
	}

}
