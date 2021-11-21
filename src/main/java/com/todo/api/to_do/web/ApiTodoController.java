package com.todo.api.to_do.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.todo.api.to_do.service.TodoService;
import com.todo.api.to_do.service.TodoVO;

@RestController
@RequestMapping("/api/todo")
public class ApiTodoController {

	@Autowired
	private TodoService todoService;

	// to_do 전체 리스트 조회
	@GetMapping(value = "/to_dos") // 미완성 - 조회시 친구 목록중 to_do 표시를 "Y"로 한 대상 또한 같이 조회
	public ModelAndView selectTo_dos(TodoVO todoVO) throws Exception {
		ModelAndView modelAndView = new ModelAndView("jsonView");

		todoVO.setUserId("tester1");
		todoVO.setTodoUnit("Y");
		List<TodoVO> to_doList = todoService.selectTo_dos(todoVO);

		return new ModelAndView("/to_do/to_doList", "selectTo_dos", to_doList);
	}

	// to_do 작성
	@PostMapping(value = "/to_dos")
	public ModelAndView insertTo_do(TodoVO todoVO) {
		ModelAndView modelAndView = new ModelAndView("jsonView");

		try {
			todoVO.setTodoUnit("Y");
			todoVO.setTodoTitle("to_do 작성테스트");
			todoVO.setTodoContent("to_do 작성테스트 내용");
			todoVO.setTodoBegin("202101221740");
			todoVO.setTodoEnd("202111132030");
			todoVO.setUserId("dyddh1253");

			todoService.insertTo_dos(todoVO);
			modelAndView.addObject("insertToDoMessage", "to_do 작성을 완료하였습니다.");

			return modelAndView;

		} catch (Exception e) {

			e.printStackTrace();

			modelAndView.addObject("insertToDoMessage", "to_do 작성중 실패하였습니다.");

			return modelAndView;
		}
	}

	// to_do 수정
	@PutMapping(value = "/to_do/{to_doSeqSn}")
	public ModelAndView updateTo_do(TodoVO todoVO, @PathVariable("to_doSeqSn") int to_doSeqSn) throws Exception {
		return null;
	}

	// to_do 상세내용 조회
	@GetMapping(value = "/to_do/{to_doSeqSn}")
	public ModelAndView selectTo_do(TodoVO todoVO, @PathVariable("to_doSeqSn") int to_doSeqSn) throws Exception {
		TodoVO resulTo_doVo = new TodoVO();

		todoVO.setSeqSN(to_doSeqSn);
		resulTo_doVo = todoService.selectTo_do(todoVO);

		return new ModelAndView("/to_do/to_doInfo", "To_doInfo", resulTo_doVo);
	}

	// to_do 삭제
//	@RequestMapping(value = "/to_do/{to_doSeqSn}", method = RequestMethod.DELETE)
	@DeleteMapping(value = "/to_do/{to_doSeqSn}")
	public ModelAndView deleteTo_do(TodoVO todoVO, @PathVariable("to_doSeqSn") int to_doSeqSn) {
		ModelAndView modelAndView = new ModelAndView("jsonView");

		try {
			todoVO.setSeqSN(to_doSeqSn);
			todoService.deleteTo_do(todoVO);

			return new ModelAndView("redirect:/api/todo/to_dos", "deleteMessage", "to_do가 정상적으로 삭제되었습니다.");
		} catch (Exception e) {

			e.printStackTrace();
			return new ModelAndView("redirect:/api/todo/to_dos", "deleteMessage", "to_do의 삭제중에 오류가 발생했습니다.");
		}
	}
}
