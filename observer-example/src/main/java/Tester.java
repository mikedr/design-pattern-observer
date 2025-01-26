public class Tester {
    public static void main(String[] args) throws InterruptedException {
        Topic topic = new Topic();
        User user1 = new User("Tito");
        User user2 = new User("Pepe");
        User user3 = new User("Juan");
        User user4 = new User("Jose");
        User user5 = new User("Manuel");
        User user6 = new User("Adolofo");
        topic.registerObserver(user1);
        topic.registerObserver(user3);
        topic.registerObserver(user5);
        topic.notifyObservers("Los peligros de la AI");
        Thread.sleep(1000);
        topic.notifyObservers("Resultados de la primera fecha");
        Thread.sleep(5000);
        topic.registerObserver(user2);
        topic.registerObserver(user4);
        topic.registerObserver(user6);
        topic.removeObserver(user1);
        topic.notifyObservers("Argentina crece un 10% en el primer trimestre");
    }
}
