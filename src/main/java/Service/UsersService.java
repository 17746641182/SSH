package Service;

import Dao.UsersDao;
import POJO.Users;
import org.apache.log4j.Logger;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class UsersService {
    private Logger logger = Logger.getLogger(UsersService.class);

    private UsersDao usersDao = new UsersDao();

    /**
     * 判断是否登录成功
     * @param userName
     * @param password
     * @return
     */
    public boolean LoginSer(String userName,String password){
        Transaction tx = null;
        boolean  flag = false;

        try {
            tx = usersDao.currentSession().beginTransaction();  //开启事务
            if(usersDao.Login(userName,password).size() > 0){
                flag = true;
            }
            tx.commit();    //提交事务
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e);
            if(tx != null){
                tx.rollback();
            }
        }
        return flag;
    }

    /**
     * 查询全部用户
     * @return
     */
    public List<Users> queryAllUsersSer(){
       Transaction tx = null;
       List<Users> usersList = new ArrayList<Users>();
        try {
            tx = usersDao.currentSession().beginTransaction();
            usersList = usersDao.queryAllUsers();
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e);
            if(tx != null){
               tx.rollback();
            }
        }
        return  usersList;
    }


    /**
     * 注册新用户
     * @param users
     */
    public boolean addNewUsersSer(Users users){
        Transaction tx = null;
        boolean flag = true;    //判断是否注册是否异常，如果异常 则判断注册失败
        try {
            tx = usersDao.currentSession().beginTransaction();
            usersDao.saveUsers(users);
            tx.commit();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
            logger.error(e);
            if(tx != null){
                tx.rollback();
            }
           flag = false;
        }
        return flag;
    }

}
