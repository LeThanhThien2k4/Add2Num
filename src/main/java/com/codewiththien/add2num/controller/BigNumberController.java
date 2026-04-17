package com.codewiththien.add2num.controller;

import com.codewiththien.add2num.service.BigNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BigNumberController {

    @Autowired
    private BigNumberService bigNumberService;
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/sum")
    public String sum(@RequestParam String num1,
                      @RequestParam String num2,
                      Model model) {
        
        if (!num1.matches("\\d+") || !num2.matches("\\d+")) {
        model.addAttribute("error", "Chỉ được nhập số (0-9)");
        return "index";
        }
        String result = bigNumberService.sum(num1, num2);
        
        model.addAttribute("num1", num1);   // THÊM
        model.addAttribute("num2", num2);
        model.addAttribute("result", result);

        return "index";
    }
}