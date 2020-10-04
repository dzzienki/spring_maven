package main.java.com.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import main.java.com.service.MainService;

@Controller
public class MainController {
	@Resource(name="mainService")
	private MainService mainService;
	
	@RequestMapping(value="/")
	public String test(Model model) throws Exception {
		System.out.println("controller");
		String test=mainService.selectTest();
		System.out.println(test);
		model.addAttribute("selectTableList", test);
		return "main/Main";
	}
	
	/**
     * Tiles »ç¿ë
     */        
    @RequestMapping(value="/testTiles.do")
    public String testPage() {
        System.out.println("tiles Test!");
    	return "main/tilesTest.page";
    }

}
