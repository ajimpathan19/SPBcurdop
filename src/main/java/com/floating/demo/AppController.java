package com.floating.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.floating.demo.Data;
import com.floating.demo.DataEntry;

@Controller
public class AppController {
	
	@Autowired
	private DataEntry entry;
	
	@RequestMapping("/")
	
	public String viewHomePage(Model model)
	{
		List <Data> listData = entry.listAll();
		model.addAttribute("listData",listData);
		return "index";
	}
	
	@RequestMapping("/new")
	public String showNewDataForm(Model model)
	{
		Data data = new Data();
		model.addAttribute("data",data);
		return "new_data";	
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String savedata(@ModelAttribute("data")Data data)
	{
		entry.save(data);
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditDataForm(@PathVariable(name="id")Long id)
	{
		ModelAndView mav = new ModelAndView("edit_data");
		Data data = entry.get(id);
		mav.addObject("data",data);
		
		return mav;
	}
	
	@RequestMapping("/delete/{id}")
	
	public String deleteData(@PathVariable(name="id")Long id)
	{
		entry.delete(id);
		return "redirect:/";
	}

	
	
	
	
	
	
	
	
	
	
	
}
