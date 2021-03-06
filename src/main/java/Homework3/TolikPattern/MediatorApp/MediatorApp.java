package Homework3.TolikPattern.MediatorApp;

import java.util.ArrayList;
import java.util.List;

public class MediatorApp {
    public static void main(String[] args) {
        TextChat chat = new TextChat();

        User admin = new Admin(chat);
        User u1 = new SimpleUser(chat);
        User u2 = new SimpleUser(chat);

        chat.setAdmin(admin);
        chat.addUser(u1);
        chat.addUser(u2);

        u1.sendMessage("привет я пользователь");
        admin.sendMessage("Админ зашел в чат");
    }
}
interface User{
    void sendMessage(String message);
    void getMessage(String message);
}
class Admin implements User{
    Chat chat;
    public Admin (Chat chat){
        this.chat=chat;
    }
    public void sendMessage(String message){
        chat.sendMessage(message, this);
    }
    public void getMessage(String message){
        System.out.println("Администратор получает сообщение " + message);
    }
}
class SimpleUser implements User{
    Chat chat;
    public SimpleUser (Chat chat){
        this.chat=chat;
    }
    public void sendMessage(String message){
        chat.sendMessage(message, this);
    }
    public void getMessage(String message){
        System.out.println("Пользователь получает сообщение " + message);
    }
}
interface Chat{
    void sendMessage(String message, User user);
}
class TextChat implements Chat{  //это медиатор и есть
    User admin;
    List<User> users = new ArrayList<>();
    public void setAdmin(User admin){
        this.admin=admin;
    }
    public void addUser(User u){
        users.add(u);
    }
    public void sendMessage(String message, User user){
        for(User u: users){
            u.getMessage(message);
        }
        admin.getMessage(message);
    }
}