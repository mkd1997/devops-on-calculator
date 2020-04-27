package com.mkd.devopsdemo.Controllers;

import com.mkd.devopsdemo.Models.CalculatorModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CalculatorController {

    @GetMapping("/calculate/{leftOperand}/{rightOperand}/{operator}")
    public ResponseEntity<String> index(@PathVariable Integer leftOperand, @PathVariable String operator, @PathVariable Integer rightOperand) {

        CalculatorModel calculator = new CalculatorModel();
        double res = 0;
        switch (operator) {
            case "+": res = calculator.add(leftOperand, rightOperand);
                break;
            case "-": res = calculator.subtract(leftOperand, rightOperand);
                break;
            case "*": res = calculator.multiply(leftOperand, rightOperand);
                break;
            case "/": res = calculator.divide(leftOperand, rightOperand);
                break;
        }
        return new ResponseEntity<>( "Your result is " + res, HttpStatus.OK);
    }
}
