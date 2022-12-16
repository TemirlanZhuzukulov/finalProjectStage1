package service.Imple;

import model.Book;
import model.User;
import service.UserService;

import java.util.List;

public class UserImpl implements UserService {
    @Override
    public String createUser(List<User> users) {
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return User;
    }

    @Override
    public User findUserById(Long id) {
        return null;
    }

    @Override
    public String removeUserByName(String name) {
        boolean isRemoved = false;
        for (User user : users) {
            if(user.getName().equals(name))
                isRemoved = this.users.remove(user);
        }
        return isRemoved ? "User is REMOVED successfully" : "User REMOVE FAILED!";
    }

}

    @Override
    public void updateUser(Long id) {

    }

    @Override
    public void groupUsersByGender() {

    }

    @Override
    public String buyBooks(String name, List<Book> books) {
        return null;
    }
}
