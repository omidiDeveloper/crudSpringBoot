package org.example.student_spring.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
class UserController {

    @RequestMapping(value = ["login"] , method = [RequestMethod.GET])
    fun openLoginPage(): String{
        return "login"
    }

    @RequestMapping(value = ["index"] , method = [RequestMethod.GET])
    fun openIndexPage(): String{
        return "index"
    }

}