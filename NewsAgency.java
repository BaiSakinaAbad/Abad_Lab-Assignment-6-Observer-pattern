import java.util.List;

public class NewsAgency implements NewsSubject{
    //Represents the central hub for publishing news. It maintains a list of subscribers and notifies them whenever new news is available.
  private String newsTitle;
//    private Double stockPrice;
    private List<Subscriber> subscribers;

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public List<Subscriber> getSubscribersName() {
        return subscribers;
    }

    public void setSubscribers(List<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

    @Override
    public void attach(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void detach(Subscriber subscriber) {
    subscribers.remove(subscriber);
    }

    @Override
    public String updateSubscriber() {
        String output = "";
        for (Subscriber subscriber : subscribers) {
            output += "Good Day! " + getSubscribersName() + "!\n" + newsTitle + ", is now AVAILABLE\nENJOY READING\n૮₍˶ •. • ⑅₎ა♡";
        }
        return output;
    }
}
