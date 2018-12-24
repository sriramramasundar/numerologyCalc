package com.calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.calc.pojo.NumerologyWrapper;

@Controller
public class NumerologyController {
	
	
	@Autowired
	NumerologyCalculator calculator;

    @GetMapping("/calculateNumerology")
    public String calculateNumerology(String input, String numValue, String totalVal, Model model) {

        System.out.println("Name input - "+input);
        int result  =  calculator.calculateNumerology(input);
        int total = calculator.getSummatedVal(result);
        model.addAttribute("input", input);
        numValue = String.valueOf(result);
        totalVal = String.valueOf(total);
        model.addAttribute("numValue", numValue);
        model.addAttribute("totalVal", totalVal);
        return "result";
    }
    

}
