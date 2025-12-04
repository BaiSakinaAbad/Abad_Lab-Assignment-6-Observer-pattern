import java.util.ArrayList;
import java.util.List;

public class NewsService {
    public static void main(String[] args) {
        Subscriber sessam = new Subscriber();
        sessam.setSubscriberName("Sessam");

        Subscriber leo = new Subscriber();
        leo.setSubscriberName("Leo Kurosagi");

        // add subscribers to list
        List<Subscriber> subscribers = new ArrayList<Subscriber>();
        subscribers.add(sessam);
        subscribers.add(leo);

        //create news
        NewsAgency newsAgency = new NewsAgency();
        newsAgency.setNewsTitle("ALAN AND HIS GIRLFRIEND ARE GETTING MARRIED");
        newsAgency.setSubscribers(subscribers);

        //update subsribers
        System.out.println("EXCLUSIVE NEWS UPDATE!");
        System.out.println(newsAgency.updateSubscriber());

        //remove subscribers using detach

        // add new subscribers




    }
}
