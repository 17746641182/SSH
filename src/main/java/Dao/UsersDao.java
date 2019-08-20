package Dao;

import POJO.Users;
import org.apache.log4j.Logger;
import org.hibernate.query.Query;

import java.util.List;

public class UsersDao extends BaseDao {
    private Logger logger = Logger.getLogger(UsersDao.class);

    /**
     * 登录方法
     * @param userName
     * @param password
     * @return
     */
    public List<Users> Login(String userName,String password){
        String hql = "from Users where userName = ?1 and password = ?2";
        Query query = currentSession().createQuery(hql);
        query.setParameter(1,userName);
        query.setParameter(2,password);
        return  query.list();
    }

    /**
     * 查询所有用户
     * @return
     */
    public List<Users> queryAllUsers(){
        String hql = "from Users";
        return currentSession().createQuery(hql).list();
    }

    /**
     * 注册用户
     * @param users
     */
    public void saveUsers(Users users){
        currentSession().save(users);
    }
}
