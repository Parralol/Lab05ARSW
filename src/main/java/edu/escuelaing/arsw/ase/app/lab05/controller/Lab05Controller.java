package edu.escuelaing.arsw.ase.app.lab05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Lab05Controller {

    @GetMapping("/prueba")
    public String loadIndex(){
        return "prueba";
    }

    @GetMapping("/calculator")
    public String showCalculator() {
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam double number1,
                            @RequestParam double number2,
                            @RequestParam String operation,
                            Model model) {
        double result = 0;
        switch (operation) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
        }
        model.addAttribute("result", result);
        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);
        return "calculator";
    }

    @PostMapping("/clear")
    public String clear(Model model) {
        model.addAttribute("result", 0);
        model.addAttribute("number1", 0);
        model.addAttribute("number2", 0);
        return "calculator";
    }
}
