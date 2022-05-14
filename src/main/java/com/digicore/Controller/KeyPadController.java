package com.digicore.Controller;

import com.digicore.Dto.Response.ApiResponse;
import com.digicore.Service.MultiClickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/key")
public class KeyPadController {

    @Autowired
    private MultiClickService multiClickService;


    @GetMapping("/write")
    public ApiResponse writeWords(@Valid @RequestParam String words){
        ApiResponse response = new ApiResponse();
        try{
            String resultSet = multiClickService.getClickMultiClickResult(words);
            response.setData(resultSet);
            response.setMessage(words);
            response.setSuccess(true);
            return response;
        }catch (Exception ex){
            response.setMessage(ex.getMessage());
            response.setSuccess(false);
            response.setData(null);
            return response;
        }
    }


    @GetMapping("/")
    public ApiResponse getAlphabetCiphers(){
        ApiResponse response = new ApiResponse();
        try{
            Object resultSet = multiClickService.getAlphabetCiphers();
            response.setData(resultSet);
            response.setMessage("Data found");
            response.setSuccess(true);
            return response;
        }catch (Exception ex){
            response.setMessage("An error occurred");
            response.setSuccess(false);
            response.setData(null);
            return response;
        }
    }
}
