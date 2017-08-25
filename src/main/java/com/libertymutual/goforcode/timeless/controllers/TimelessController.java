package com.libertymutual.goforcode.timeless.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.libertymutual.goforcode.timeless.services.TimelessRepository;

@Controller
@RequestMapping("/")
public class TimelessController {
	
	private TimelessRepository repo;

    public TimelessController(TimelessRepository repo) {
        this.repo = repo;
    }

	@GetMapping("")
	public ModelAndView returnHome() {
		ModelAndView mv = new ModelAndView("timeless/index");
		repo.getSubmittedEntries();
		return mv;
	}
}
