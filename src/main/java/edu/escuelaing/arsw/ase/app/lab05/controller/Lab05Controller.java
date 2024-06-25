package edu.escuelaing.arsw.ase.app.lab05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Lab05Controller {
    int count = 0;
    @GetMapping("/prueba")
    public String loadIndex() {
        return "prueba";
    }

    @GetMapping("/calculator")
    public String showCalculator() {
        
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam String number1,
            Model model) {
        double result = 0;
        count =0;
        String operation = getOperation(number1);
        switch (operation) {
            case "\\+":
                result = Double.parseDouble(number1.split(operation)[0]) + Double.parseDouble(number1.split(operation)[1]);
                break;
            case "\\-":
                result = Double.parseDouble(number1.split(operation)[0]) - Double.parseDouble(number1.split(operation)[1]);
                break;
            case "\\*":
                result = Double.parseDouble(number1.split(operation)[0]) * Double.parseDouble(number1.split(operation)[1]);
                break;
            case "\\/":
                result = Double.parseDouble(number1.split(operation)[0]) / Double.parseDouble(number1.split(operation)[1]);
                break;
        }
        model.addAttribute("result", result);
        return "calculator";
    }

    @PostMapping("/case")
    public String cases(@RequestParam String number1,
            @RequestParam String operation,
            Model model) {
        count++;
        if(count >1){
            model.addAttribute("number1", number1);
            return "calculator";
        } 
        switch (operation) {

            case "+":
                model.addAttribute("number1", number1 + "+");
                break;
            case "-":
                model.addAttribute("number1", number1 + "-");
                break;
            case "*":
                model.addAttribute("number1", number1 + "/");
                break;
            case "/":
                model.addAttribute("number1", number1 + "*");
                break;
        }

        return "calculator";
    }

    @PostMapping("/clear")
    public String clear(Model model) {
        model.addAttribute("result", 0);
        model.addAttribute("number1", 0);
        model.addAttribute("number2", 0);
        count = 0;
        return "calculator";
    }

    public String getOperation(String op){
        String res = "";
        if(op.indexOf('+') > 0){
            res = "\\+";
        }else if(op.indexOf('-') > 0){
            res = "\\-";
        }else if(op.indexOf('*') > 0){
            res = "\\*";
        }else if(op.indexOf('/') > 0){
            res = "\\/";
        }
        return res;
    }
}
