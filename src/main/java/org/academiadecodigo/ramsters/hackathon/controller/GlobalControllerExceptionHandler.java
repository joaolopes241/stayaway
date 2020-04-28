package org.academiadecodigo.ramsters.hackathon.controller;

import org.academiadecodigo.ramsters.hackathon.exceptions.StayAwayException;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

@ControllerAdvice
public class GlobalControllerExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST) // respond with an http 400
    @ExceptionHandler(value = StayAwayException.class) // user did something wrong
    public ModelAndView handleClientErrors(HttpServletRequest req, StayAwayException ex) {

        ModelAndView model = new ModelAndView();

        model.setViewName("error/error");
        model.addObject("httpStatus", HttpStatus.BAD_REQUEST);
        model.addObject("message", ex.getMessage());

        return  model;
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) // respond with an http 500
    @ExceptionHandler(value = Exception.class) // something is wrong with the server
    public ModelAndView handleServerErrors(HttpServletRequest req, Exception ex) {

        ModelAndView model = new ModelAndView();

        // add error info to the model
        model.addObject("httpStatus", HttpStatus.INTERNAL_SERVER_ERROR);
        model.setViewName("error/error");
        return  model;
    }

}