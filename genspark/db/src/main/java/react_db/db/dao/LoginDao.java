package react_db.db.dao;

import react_db.db.entity.Login;

import java.util.List;

public interface LoginDao {
    List<Login> findAllLogin();
    Object findByLoginId(int loginID);
    void saveOrUpdateLogin(Login theLogin);
    void deleteByLoginId(int loginId);
}
