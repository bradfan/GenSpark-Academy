package react_db.db.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import react_db.db.entity.Login;
import react_db.db.service.LoginService;

import java.util.List;

//This is to allow calls from React...
@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
public class LoginController {
    public final LoginService loginService;

    //    Constructor Injection
    @Autowired
    LoginController(@Qualifier("loginServiceIMPL") LoginService loginService) {this.loginService = loginService;}

    //   localhost:8080/retrieveAllLogin
    @GetMapping("/retrieveAllLogin")
    public List<Login> findAllLogin() {
        return loginService.findAllLogin();
    }

    //   localhost:8080/retrieveByLoginId/1
    @GetMapping("/retrieveByLoginId/{loginId}")
    public Object findByLoginId(@PathVariable int loginId) {
        return loginService.findByLoginId(loginId);
    }

    //   localhost:8080/addLogin
    @PostMapping("/addLogin")
    public Login addLogin(@RequestBody Login theLogin) {
        theLogin.setId(0);
        loginService.saveOrUpdateLogin(theLogin);
        return theLogin;
    }
    //   localhost:8080/updateLogin
    @PutMapping("/updateLogin")
    public Login updateLogin(@RequestBody Login updateLogin) {
        loginService.saveOrUpdateLogin(updateLogin);
        return updateLogin;
    }
    //    localhost:8080/deleteLogin/1
    @DeleteMapping("/deleteLogin/{loginId}")
    public String deleteLogin(@PathVariable int loginId) {
        loginService.deleteByLoginId(loginId);
        return "Deleted login ID: " + loginId;
    }

}
