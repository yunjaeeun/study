package com.cineverse.springsecuritytest.controller;

import com.cineverse.springsecuritytest.dto.UserDTO;
import com.cineverse.springsecuritytest.vo.HelloVo;
import com.cineverse.springsecuritytest.vo.RequestUser;
import com.cineverse.springsecuritytest.vo.ResponseUser;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UserController {

    private Environment env;
    private HelloVo helloVo;
    private ModelMapper modelMapper;

    @Autowired
    public UserController(Environment env, HelloVo helloVo, ModelMapper modelMapper) {
        this.env = env;
        this.helloVo = helloVo;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/health_check")
    public String status() {
        return "Server at " + env.getProperty("local.server.port")
                + ", swcamp.message: " + env.getProperty("swcamp.message");
    }

    @GetMapping("/do_msa")
    public String doMsa() {
        return helloVo.getMessage();
    }

    /* 회원가입 */
    @PostMapping("/users")
    public ResponseEntity<ResponseUser> registUser(@RequestBody RequestUser user){
        UserDTO userDTO = modelMapper.map(user, UserDTO.class);
        System.out.println("userDTO = " + userDTO);

        ResponseUser responseUser = new ResponseUser();
        return ResponseEntity.status(HttpStatus.CREATED).body(responseUser);
    }
}
