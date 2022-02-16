package react_db.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import react_db.db.dao.LoginDao;
import react_db.db.entity.Login;

import java.util.List;

@Service
public class LoginServiceIMPL implements LoginService{
    private final LoginDao loginDao;

    @Autowired
    public LoginServiceIMPL(LoginDao loginDao) {this.loginDao = loginDao;}

    @Override
    public List<Login> findAllLogin() {return loginDao.findAllLogin();}

    @Override
    public Object findByLoginId(int loginId) {return loginDao.findByLoginId(loginId);}

    @Override
    public void saveOrUpdateLogin(Login theLogin) {
        loginDao.saveOrUpdateLogin(theLogin);}

    @Override
    public void deleteByLoginId(int loginId) {
        loginDao.deleteByLoginId(loginId);}
}
