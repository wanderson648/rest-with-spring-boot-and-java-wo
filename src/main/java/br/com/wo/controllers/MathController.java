package br.com.wo.controllers;

import br.com.wo.exceptions.UnsupportedMathOperationException;
import br.com.wo.model.MathCalc;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {

    public final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {

        MathCalc.validationNumber(numberOne, numberTwo);
        return MathCalc.sum(numberOne, numberTwo);
    }

    @RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtraction(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {

        MathCalc.validationNumber(numberOne, numberTwo);
        return MathCalc.subtraction(numberOne, numberTwo);
    }

    @RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiply(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {

        MathCalc.validationNumber(numberOne, numberTwo);
        return MathCalc.multiplication(numberOne, numberTwo);
    }

    @RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double division(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {

        MathCalc.validationNumber(numberOne, numberTwo);
        return MathCalc.division(numberOne, numberTwo);
    }

    @RequestMapping(value = "/ave/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double average(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {

        MathCalc.validationNumber(numberOne, numberTwo);
        return MathCalc.average(numberOne, numberTwo);
    }

    @RequestMapping(value = "/raizQuad/{number}", method = RequestMethod.GET)
    public Double rootSqrt(
            @PathVariable(value = "number") String number) throws Exception {

        MathCalc.validationNumber(number);
        return MathCalc.rootQuad(number);
    }

}
