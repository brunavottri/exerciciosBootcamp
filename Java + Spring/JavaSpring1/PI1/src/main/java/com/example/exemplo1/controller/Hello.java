package com.example.exemplo1.controller;

import com.example.exemplo1.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class Hello {

    @GetMapping("/ola/{nome}/{id}") // http://localhost:8080/user/ola/Bruna/123
    public String digaHello(@PathVariable String nome, @PathVariable int id) {
        return "Oioi" + nome + id;
    }

    @GetMapping("/ola") // http://localhost:8080/user/ola?nome=Bruna&id=123
        public String digaHello2(@RequestParam String nome, @RequestParam int id) {
        return "Oioi2" + nome + id;
    }

//    @PostMapping  //json com as infos no body
//    public String getUser(@RequestBody User user) {
//        return "Usuário recebido: " + user.toString();
//    }

    @PostMapping // json com as infos no body
    public ResponseEntity<UserDto> getUser(@RequestBody User user) {
        if (user.getId() == 123) {
            UserDto userDto = new UserDto(user);
            return new ResponseEntity(userDto, HttpStatus.OK);
        }
        return new ResponseEntity(null, HttpStatus.BAD_REQUEST);
    }
}
