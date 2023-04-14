package com.doctorwho.doctorwho.controller;

import java.text.BreakIterator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

@Controller
public class MainController {

    @GetMapping("/doctor/{id}")
    @ResponseBody
    public String doctor(@PathVariable String id) {
        String response;
        switch (id) {
            case "1":
                response = "William Hartnell";
                break;
            case "10":
                response = "David Tennant";
                break;
            case "13":
                response = "Jodie Whittaker";
                break;
            default:
                response = "error no doctor with this id";
                break;
        }
        return response;
    }
}
