package DataStructers;

public class app {
    public static void main(String[] args) {
        ourlinkedlist<String> list = new ourlinkedlist<>();
        list.add("Karahan");
        list.add("Güllü");

        list.display();
        System.out.println("---------");
        list.delete();
        System.out.println("---------");
        list.display();
    }   
}
