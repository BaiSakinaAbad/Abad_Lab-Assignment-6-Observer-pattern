import java.util.ArrayList;
import java.util.List;

public class NewsService {
    public static void main(String[] args) {
        Subscriber alan = new Subscriber();
        alan.setSubscriberName("Alan Mido");

        Subscriber alan_kalbo = new Subscriber();
        alan_kalbo.setSubscriberName("Alan Kalbo");

        // add subscribers to list
        List<Subscriber> subscribers = new ArrayList<Subscriber>();
        subscribers.add(alan);
        subscribers.add(alan_kalbo);

        //create news
        NewsAgency newsAgency = new NewsAgency();
        newsAgency.setNewsTitle("ALAN AND HIS GIRLFRIEND ARE GETTING MARRIED");
        newsAgency.setSubscribers(subscribers);

        //update subsribers

        System.out.println("EXCLUSIVE NEWS UPDATE!");
        System.out.println(newsAgency.getNewsTitle());

        //remove subscribers using detach

        // add new subscribers




    }
}
