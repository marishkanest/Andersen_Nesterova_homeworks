package Homework3.TolikPattern.ProxyApp;


public class ProxyApp {
    public static void main(String[] args) {

        Image image = new ProxyImage("D:/image/my.jpg");
        image.display();
    }
}
interface Image{
    void display();
}

class RealImage implements Image{
    String file;
    public RealImage(String file){
        this.file=file;
        load();
    }
    void load(){
        System.out.println("загрузка "+file);
    }

    public void display(){
        System.out.println("просмотр "+file);
    }
}
class ProxyImage implements Image{

    String file;
    RealImage image;
    public ProxyImage(String file){
        this.file=file;
    }

    public void display(){
        if(image==null){
            image = new RealImage(file);
        }
        image.display();
    }
}