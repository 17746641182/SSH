package StrutsDemo;

import POJO.Users;
import Service.UsersService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class UsersAction extends ActionSupport {

    private Users users;

    private UsersService usersService = new UsersService();

    private List<Users> list;

    /**
     * @return
     */

    public String execute() {

        System.out.println("----------");
        list = usersService.queryAllUsersSer();
        System.out.println(list.toString());
        return SUCCESS;
    }

    public String register(){
        System.out.println("--------注册新用户---------");
        boolean isFlag = usersService.addNewUsersSer(users);
        if(!isFlag){
            return Action.ERROR;
        }
        return Action.SUCCESS;
    }





    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public UsersService getUsersService() {
        return usersService;
    }

    public void setUsersService(UsersService usersService) {
        this.usersService = usersService;
    }

    public List<Users> getList() {
        return list;
    }

    public void setList(List<Users> list) {
        this.list = list;
    }


}
